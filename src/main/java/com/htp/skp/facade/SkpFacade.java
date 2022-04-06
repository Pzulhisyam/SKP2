package com.htp.skp.facade;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.htp.skp.Skp21Application;
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
import com.htp.skp.report.SenaraiKemaskiniRekod;
import com.htp.skp.report.SimpleReportExporter;
import com.htp.skp.util.AESUtil;
import com.htp.skp.util.CommonUtil;

import net.sf.jasperreports.engine.JRException;

public class SkpFacade {
	private static Logger log = LoggerFactory.getLogger(Skp21Application.class);
	HashMap<String, Object> mainMap = new HashMap<String, Object>();
	private ExtractICSCRepository iscsRepository;
	private ApplicationRespository appRepository;
	private CardStatusRepository cardRepository;
	private FeeReductionRepository feeRepository;
	private ApplTxnRepository txnRepository;
	private ApplTxnFeeRepository txnFeeRepository;
	private ProblRecordRepository probRepository;
	private AppntJpnInfoRepository jpnInfoRepository;
	private ApplHistoryRepository historyRepository;
	private BranchInfoRepository branchRepository;

	public SkpFacade(HashMap<String, Object> map) {
		//test mapping by syafiza
		if (map != null) {
			mainMap = map;
			if (mainMap.get("iscs") instanceof ExtractICSCRepository) {
				iscsRepository = (ExtractICSCRepository) mainMap.get("iscs");
			}
			if (mainMap.get("app") instanceof ApplicationRespository) {
				appRepository = (ApplicationRespository) mainMap.get("app");
			}
			if (mainMap.get("card") instanceof CardStatusRepository) {
				cardRepository = (CardStatusRepository) mainMap.get("card");
			}
			if (mainMap.get("fee") instanceof FeeReductionRepository) {
				feeRepository = (FeeReductionRepository) mainMap.get("fee");
			}
			if (mainMap.get("txn") instanceof ApplTxnRepository) {
				txnRepository = (ApplTxnRepository) mainMap.get("txn");
			}
			if (mainMap.get("txnFee") instanceof ApplTxnFeeRepository) {
				txnFeeRepository = (ApplTxnFeeRepository) mainMap.get("txnFee");
			}
			if (mainMap.get("prob") instanceof ProblRecordRepository) {
				probRepository = (ProblRecordRepository) mainMap.get("prob");
			}
			if (mainMap.get("jpnInfo") instanceof AppntJpnInfoRepository) {
				jpnInfoRepository = (AppntJpnInfoRepository) mainMap.get("jpnInfo");
			}
			if (mainMap.get("history") instanceof ApplHistoryRepository) {
				historyRepository = (ApplHistoryRepository) mainMap.get("history");
			}
			if (mainMap.get("branch") instanceof BranchInfoRepository) {
				branchRepository = (BranchInfoRepository) mainMap.get("branch");
			}
		}
	}

	@SuppressWarnings("unused")
	private boolean authentication() {
		try {
			return CommonUtil.configAuthentication();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return false;
	}

	@SuppressWarnings("unused")
	private void encryptdecryptVal() {
		AESUtil td;
		try {
			td = new AESUtil();
			String target = "P@ssw0rd@@";
			String encrypted = td.encrypt(target);
			String decrypted = td.decrypt(encrypted);

			System.out.println("String To Encrypt: " + target);
			System.out.println("Encrypted String: " + encrypted);
			System.out.println("Decrypted String: " + decrypted);
			System.out.println("Output Decrypted String: " + td.decrypt("8FonMlnjFv3aFGKFIelnSQ=="));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

//	public void insertDataTemp() {
//		long extractStartTime = System.currentTimeMillis();
//
//		List<THEI_EXTRACT_ICSC> icscList = new ArrayList<THEI_EXTRACT_ICSC>();
//
////		String startDate = CommonUtil.getDate("startDate");
////		String endDate = CommonUtil.getDate("endDate");
//		String startDate = "2012/02/13";
//		String endDate = "2012/02/28"; //for data testing
//		List<APPLICATION> list = appRepository.findRecordById(startDate, endDate,"2021011002100901003");
//
//		if (list.size() != 0) {
//			for (int i = 0; i < list.size(); i++) {
//				if (list.get(i) != null) {
//					APPLICATION app = list.get(i);
////					THEI_EXTRACT_ICSC icsc = insertICSCBean(app);
////					iscsRepository.save(icsc);
////				    icscList.add(icsc); //for excell
//				} else {
//					log.info("no beds found");
//				}
//			}
//		}
//
//		long extractStopTime = System.currentTimeMillis();
//		float extractRunTime = extractStopTime - extractStartTime;
//		float result = extractRunTime / 1000;
//		CommonUtil.printOut("Run time: " + result);
////		try {
////			CommonUtil.generateJsonObjExcel(icscList);
////		} catch (IOException e) {
////			e.printStackTrace();
////		}
//	
//		
//	}
	public void insertData() throws JRException, Exception {
		long extractStartTime = System.currentTimeMillis();

		List<THEI_EXTRACT_ICSC> icscList = new ArrayList<THEI_EXTRACT_ICSC>();

//		String startDate = CommonUtil.getDate("startDate");
//		String endDate = CommonUtil.getDate("endDate");
//		String startDate = "2012/02/13";
//		String endDate = "2012/02/28"; //for data testing
		List<THEI_EXTRACT_ICSC> list = iscsRepository.findAllRecord();

		if (list.size() != 0) {
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i) != null) {
					THEI_EXTRACT_ICSC icsc = list.get(i);
				    icscList.add(icsc); //for report
				} else {
					log.info("no beds found");
				}
			}
		}
		
        SenaraiKemaskiniRekod reportFiller = new SenaraiKemaskiniRekod();
        reportFiller.setReportFileName("SemakanRekodKemaskiniBulanan.jrxml");
        reportFiller.compileReport();
        
//        Map<String, Object> parameters = new HashMap<>();
//        parameters.put("title", "Employee Report Example");
//        
//        reportFiller.setParameters(parameters);
        reportFiller.fillReport(icscList);
        
        SimpleReportExporter simpleExporter = new SimpleReportExporter();
        simpleExporter.setJasperPrint(reportFiller.getJasperPrint());
        
        simpleExporter.exportToPdf("SemakanRekodKemaskiniBulanan.pdf", "test");

		long extractStopTime = System.currentTimeMillis();
		float extractRunTime = extractStopTime - extractStartTime;
		float result = extractRunTime / 1000;
		CommonUtil.printOut("Run time: " + result);
        
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
		String tempStr = app.getCOLLCENTER().toString();
		if(tempStr.length() == 5 && tempStr.substring(0, 1).equalsIgnoreCase("0")) {
			tempStr = "0"+tempStr;
		}
		Optional<BRANCH_INFO> opt = branchRepository.findById(tempStr);
		if (opt.isPresent() && opt.get() instanceof BRANCH_INFO) {
			branch = new BRANCH_INFO();
			branch = opt.get();
			temp = Integer.parseInt(branch.getBRANCHCODEJPN());
//			CommonUtil.printOut(branch.getBRANCHCODEJPN());
		}
		return temp;
	}

}
