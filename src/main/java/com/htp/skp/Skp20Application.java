package com.htp.skp;

import java.io.IOException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
import com.htp.skp.facade.SkpFacade;
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
//		Skp20Application skp = new Skp20Application();
//		if(skp.authentication()) {
		SpringApplication.run(Skp20Application.class, args);
//		}
		log.info("APPLICATION FINISHED");
	}


	@Override
	public void run(String... args) throws Exception {
		log.info("EXECUTING : command line runner");
		SkpFacade sf = new SkpFacade(insertRepoToMap());
		sf.insertData();
	}
	
	private HashMap<String, Object> insertRepoToMap() {
		HashMap<String, Object> mainMap = new HashMap<String, Object>();
		
	    mainMap.put("iscs", iscsRepository);
	    mainMap.put("app", appRepository);
	    mainMap.put("card", cardRepository);
	    mainMap.put("fee", feeRepository);
	    mainMap.put("txn", txnRepository);
	    mainMap.put("txnFee", txnFeeRepository);
	    mainMap.put("prob", probRepository);
	    mainMap.put("jpnInfo", jpnInfoRepository);
	    mainMap.put("history", historyRepository);
	    mainMap.put("branch", branchRepository);
	    
	    return mainMap;
	}
	

}
