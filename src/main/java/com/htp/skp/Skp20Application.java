package com.htp.skp;

import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.htp.skp.constant.Constant;
import com.htp.skp.db2.entity.THEI_EXTRACT_ICSC;
import com.htp.skp.db2.service.ExtractICSCRepository;
import com.htp.skp.oracle.entity.APPLICATION;
import com.htp.skp.oracle.entity.APPL_FEE_REDUCTION;
import com.htp.skp.oracle.entity.APPL_HISTORY;
import com.htp.skp.oracle.entity.APPL_TXN;
import com.htp.skp.oracle.entity.APPL_TXN_FEE;
import com.htp.skp.oracle.entity.APPNT_JPN_INFO;
import com.htp.skp.oracle.entity.BRANCH_INFO;
import com.htp.skp.oracle.entity.CARD_STATUS;
import com.htp.skp.oracle.entity.PROBL_RECORD;
import com.htp.skp.oracle.service.ApplHistoryRepository;
import com.htp.skp.oracle.service.ApplTxnFeeRepository;
import com.htp.skp.oracle.service.ApplTxnRepository;
import com.htp.skp.oracle.service.ApplicationRespository;
import com.htp.skp.oracle.service.AppntJpnInfoRepository;
import com.htp.skp.oracle.service.BranchInfoRepository;
import com.htp.skp.oracle.service.CardStatusRepository;
import com.htp.skp.oracle.service.FeeReductionRepository;
import com.htp.skp.oracle.service.ProblRecordRepository;
import com.htp.skp.util.AESUtil;
import com.htp.skp.util.CommonUtil;

@SpringBootApplication
public class Skp20Application implements CommandLineRunner {
	private static Logger log = LoggerFactory.getLogger(Skp20Application.class);
	@Autowired
	private ExtractICSCRepository iscsRepository;
	@Autowired
	private ApplicationRespository appRepository;
	@Autowired
	private CardStatusRepository cardRepository;
	@Autowired
	private FeeReductionRepository feeRepository;
	@Autowired
	private ApplTxnRepository txnRepository;
	@Autowired
	private ApplTxnFeeRepository txnFeeRepository;
	@Autowired
	private ProblRecordRepository probRepository;
	@Autowired
	private AppntJpnInfoRepository jpnInfoRepository;
	@Autowired
	private ApplHistoryRepository historyRepository;
	@Autowired
	private BranchInfoRepository branchRepository;

	public static void main(String[] args) throws Exception {
		log.info("STARTING THE APPLICATION");
		Skp20Application skp = new Skp20Application();
//		if(skp.authentication()) {
//			SpringApplication.run(Skp20Application.class, args);
//		}
		skp.encryptdecryptVal();
		log.info("APPLICATION FINISHED");
	}

	private boolean authentication() {
		try {
			return CommonUtil.configAuthentication();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return false;
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("EXECUTING : command line runner");
		String currentUser = CommonUtil.getCurrentUser();
		CommonUtil.printOut(currentUser);
		insertData();
	}

	private void encryptdecryptVal() {
	       AESUtil td;
		try {
			td = new AESUtil();
			String target="P@ssw0rd@@";
	        String encrypted=td.encrypt(target);
	        String decrypted=td.decrypt(encrypted);

	        System.out.println("String To Encrypt: "+ target);
	        System.out.println("Encrypted String: " + encrypted);
	        System.out.println("Decrypted String: " + decrypted);
	        System.out.println("Output Decrypted String: " + td.decrypt("8FonMlnjFv3aFGKFIelnSQ=="));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void insertData() {
		long extractStartTime = System.currentTimeMillis();

		List<THEI_EXTRACT_ICSC> icscList = new ArrayList<THEI_EXTRACT_ICSC>();

		String startDate = CommonUtil.getDate("startDate");
		String endDate = CommonUtil.getDate("endDate");
//		String startDate = "2021/08/01";
//		String endDate = "2021/08/07";
		List<APPLICATION> list = appRepository.findAllRecord(startDate, endDate);

		if (list.size() != 0) {
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i) != null) {
					APPLICATION app = list.get(i);
					THEI_EXTRACT_ICSC icsc = insertICSCBean(app);
					iscsRepository.save(icsc);
					icscList.add(icsc);
				} else {
					log.info("no beds found");
				}
			}
		}

		long extractStopTime = System.currentTimeMillis();
		float extractRunTime = extractStopTime - extractStartTime;
		float result = extractRunTime / 1000;
		CommonUtil.printOut("Run time: " + result);
//		try {
//			CommonUtil.generateJsonObjExcel(icscList);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}

	private THEI_EXTRACT_ICSC insertICSCBean(APPLICATION app) {

		APPL_HISTORY applHistory = findApplHistory(app);
		APPL_TXN_FEE txnFee = findTxnFee(app);
		APPL_TXN txn = findTxn(app);
		APPNT_JPN_INFO jpnInfo = findJpnInfo(app);
		CARD_STATUS cardStatus = findCardStatus(app);
		APPL_FEE_REDUCTION feeReduction = findFeeReduction(app);
		PROBL_RECORD record = findProblRecord(app);

		THEI_EXTRACT_ICSC icsc = new THEI_EXTRACT_ICSC();
		icsc.setHEI_APPL_LEGAPPLID(app.getLEGAPPLID() != null ? app.getLEGAPPLID() : "");
		icsc.setHEI_APPL_KPTNO(app.getKPTNO() != null ? app.getKPTNO() : "");
		icsc.setHEI_APPL_APPLSTAT(app.getAPPLSTAT() != null ? app.getAPPLSTAT() : "");
		icsc.setHEI_APPL_DATE(
				app.getTIMESTAMP() != null ? CommonUtil.changeDateFormat(app.getTIMESTAMP(), Constant.dateStandardNew)
						: CommonUtil.getCurrentDateString());
		icsc.setHEI_APPL_USERID(app.getUSERID() != null ? app.getUSERID() : "");

//		icsc.setHEI_APPL_COLLCTR(app.getCOLLCENTER() != null ? app.getCOLLCENTER() : 0);
		icsc.setHEI_APPL_COLLCTR(app.getCOLLCENTER() != null ? findBranchInfo(app) : 0);

		icsc.setHEI_APPL_COLLKPTNO(app.getCOLLKPTNO() != null ? app.getCOLLKPTNO() : "");
		icsc.setHEI_APPL_IDTYPE(app.getIDTYPE() != null ? app.getIDTYPE() : "");
		icsc.setHEI_APPL_RLTNCD(app.getRELATIONCODE() != null ? app.getRELATIONCODE() : "");
		icsc.setHEI_APPLTF_FEEAMT(feeReduction.getFEEAMT() != null ? feeReduction.getFEEAMT() : 0);
		icsc.setHEI_APPLFR_RTYPE(feeReduction.getREDUCTIONTYPE() != null ? feeReduction.getREDUCTIONTYPE() : "");
		icsc.setHEI_APPLTXN_TXNCD(txn.getTXNCODE() != null ? txn.getTXNCODE() : "");
		icsc.setHEI_APPLTXN_LICCLASS(txn.getLICCLASS() != null ? txn.getLICCLASS() : "");
		icsc.setHEI_APPLFR_FEEAMT(txnFee.getFEEAMT() != null ? txnFee.getFEEAMT() : 0);
		icsc.setHEI_CS_CARDVERNO(cardStatus.getCARDVERSIONNO() != null ? cardStatus.getCARDVERSIONNO() : 0);
		icsc.setHEI_CS_USERID(cardStatus.getUSERID() != null ? cardStatus.getUSERID() : "");
		icsc.setHEI_APPLHIS_USERID(applHistory.getUSERID() != null ? applHistory.getUSERID() : "");
		icsc.setHEI_AJI_LCCRIME(jpnInfo.getLOSTCNTCRIME() != null ? jpnInfo.getLOSTCNTCRIME() : 0);
		icsc.setHEI_AJI_LCTDIS(jpnInfo.getLOSTCNTDIS() != null ? jpnInfo.getLOSTCNTDIS() : 0);
		icsc.setHEI_AJI_LCNEG(jpnInfo.getLOSTCNTNEG() != null ? jpnInfo.getLOSTCNTNEG() : 0);
		icsc.setHEI_AJI_CLCNT(jpnInfo.getCARDLOSTCNT() != null ? jpnInfo.getCARDLOSTCNT() : 0);
		icsc.setHEI_CREATE_DT(CommonUtil.getCurrentDateString());
		icsc.setHEI_RV_IND(Constant.fromOra);

		if (record.getACTREMARKS() != null && !"".equalsIgnoreCase(record.getACTREMARKS())
				&& record.getACTREMARKS().length() <= 60) {
			icsc.setHEI_PR_ACTRMK1(record.getACTREMARKS());
			icsc.setHEI_PR_ACTRMK2("");
		} else {
			icsc.setHEI_PR_ACTRMK1(CommonUtil.devideRemarks(record.getACTREMARKS(), true));
			icsc.setHEI_PR_ACTRMK2(CommonUtil.devideRemarks(record.getACTREMARKS(), false));

		}

		return icsc;
	}

	// APPL_HISTORY
	private APPL_HISTORY findApplHistory(APPLICATION app) {
		APPL_HISTORY applHistory = new APPL_HISTORY();
		List<APPL_HISTORY> list8 = historyRepository.findAllRecord(app.getAPPLID());
		if (list8.size() != 0) {
			for (int x = 0; x < list8.size(); x++) {
				if (list8.get(x) != null) {

					applHistory = list8.get(x);
				}
			}
		}
		return applHistory;
	}

	// APPNT_JPN_INFO
	private APPNT_JPN_INFO findJpnInfo(APPLICATION app) {
		APPNT_JPN_INFO infoB = new APPNT_JPN_INFO();
		List<APPNT_JPN_INFO> list7 = jpnInfoRepository.findAllRecord(app.getAPPLID());
		if (list7.size() != 0) {
			for (int x = 0; x < list7.size(); x++) {
				if (list7.get(x) != null) {

					infoB = list7.get(x);
				}
			}
		}
		return infoB;
	}

	// PROBL_RECORD
	private PROBL_RECORD findProblRecord(APPLICATION app) {
		PROBL_RECORD recordB = new PROBL_RECORD();
		List<PROBL_RECORD> list6 = probRepository.findAllRecord(app.getAPPLID());
		if (list6.size() != 0) {
			for (int x = 0; x < list6.size(); x++) {
				if (list6.get(x) != null) {

					recordB = list6.get(x);
				}
			}
		}
		return recordB;
	}

	// APPL_TXN_FEE
	private APPL_TXN_FEE findTxnFee(APPLICATION app) {
		APPL_TXN_FEE txnFeeB = new APPL_TXN_FEE();
		List<APPL_TXN_FEE> list5 = txnFeeRepository.findAllRecord(app.getAPPLID());
		if (list5.size() != 0) {
			for (int x = 0; x < list5.size(); x++) {
				if (list5.get(x) != null) {

					txnFeeB = list5.get(x);
				}
			}
		}

		return txnFeeB;
	}

	// APPL_TXN
	private APPL_TXN findTxn(APPLICATION app) {
		APPL_TXN txnB = new APPL_TXN();
		List<APPL_TXN> list4 = txnRepository.findAllRecord(app.getAPPLID());
		if (list4.size() != 0) {
			for (int x = 0; x < list4.size(); x++) {
				if (list4.get(x) != null) {

					txnB = list4.get(x);
				}
			}
		}
		return txnB;
	}

	// APPL_FEE_REDUCTION
	private APPL_FEE_REDUCTION findFeeReduction(APPLICATION app) {
		APPL_FEE_REDUCTION feeB = new APPL_FEE_REDUCTION();
		List<APPL_FEE_REDUCTION> list3 = feeRepository.findAllRecord(app.getAPPLID());
		if (list3.size() != 0) {
			for (int x = 0; x < list3.size(); x++) {
				if (list3.get(x) != null) {
					feeB = list3.get(x);
				}
			}
		}
		return feeB;
	}

	// CARD_STATUS
	private CARD_STATUS findCardStatus(APPLICATION app) {
		CARD_STATUS card = new CARD_STATUS();
		List<CARD_STATUS> list2 = cardRepository.findAllRecord(app.getAPPLID());
		if (list2.size() != 0) {
			for (int x = 0; x < list2.size(); x++) {
				if (list2.get(x) != null) {
					card = list2.get(x);
				}
			}
		}
		return card;
	}

	// BRANCH_INFO
	private Integer findBranchInfo(APPLICATION app) {
		Integer temp = 0;
		BRANCH_INFO branch = new BRANCH_INFO();
		Optional<BRANCH_INFO> opt = branchRepository.findById(app.getCOLLCENTER().toString());
		if (opt.isPresent() && opt.get() instanceof BRANCH_INFO) {
			branch = new BRANCH_INFO();
			branch = opt.get();
			temp = Integer.parseInt(branch.getBRANCHCODEJPN());
		}
		return temp;
	}

}
