package com.htp.skp.db2.entity;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class THEI_EXTRACT_ICSC {
	
	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String HEI_APPL_KPTNO;
	private String HEI_APPL_LEGAPPLID;
	private String HEI_APPL_DATE;
	private String HEI_CREATE_DT;
	private String HEI_RV_IND;
	
	public THEI_EXTRACT_ICSC() {
	}
	

	public THEI_EXTRACT_ICSC(String hEI_APPL_LEGAPPLID, String hEI_APPL_KPTNO, String hEI_APPL_APPLSTAT, String hEI_APPL_DATE,
			String hEI_APPL_USERID, Integer hEI_APPL_COLLCTR, String hEI_APPL_COLLKPTNO, String hEI_APPL_IDTYPE,
			String hEI_APPL_RLTNCD, Integer hEI_APPLFR_FEEAMT, String hEI_APPLFR_RTYPE, Integer hEI_APPLTF_FEEAMT,
			String hEI_APPLTXN_TXNCD, String hEI_APPLTXN_LICCLASS, Integer hEI_CS_CARDVERNO, String hEI_CS_USERID,
			String hEI_APPLHIS_USERID, Integer hEI_AJI_LCCRIME, Integer hEI_AJI_LCTDIS, Integer hEI_AJI_LCNEG,
			Integer hEI_AJI_CLCNT, String hEI_CREATE_DT,String hEI_RV_IND, String hEI_PR_ACTRMK1, String hEI_PR_ACTRMK2) {
		super();
		HEI_APPL_LEGAPPLID = hEI_APPL_LEGAPPLID;
		HEI_APPL_KPTNO = hEI_APPL_KPTNO;
		HEI_APPL_DATE = hEI_APPL_DATE;
		HEI_CREATE_DT = hEI_CREATE_DT;
		HEI_RV_IND = hEI_RV_IND;
	}


	public String getHEI_APPL_LEGAPPLID() {
		return HEI_APPL_LEGAPPLID;
	}

	public void setHEI_APPL_LEGAPPLID(String hEI_APPL_LEGAPPLID) {
		HEI_APPL_LEGAPPLID = hEI_APPL_LEGAPPLID;
	}

	public String getHEI_APPL_KPTNO() {
		return HEI_APPL_KPTNO;
	}

	public void setHEI_APPL_KPTNO(String hEI_APPL_KPTNO) {
		HEI_APPL_KPTNO = hEI_APPL_KPTNO;
	}

	public String getHEI_APPL_DATE() {
		return HEI_APPL_DATE;
	}

	public void setHEI_APPL_DATE(String hEI_APPL_DATE) {
		HEI_APPL_DATE = hEI_APPL_DATE;
	}

	public String getHEI_CREATE_DT() {
		return HEI_CREATE_DT;
	}

	public void setHEI_CREATE_DT(String hEI_CREATE_DT) {
		HEI_CREATE_DT = hEI_CREATE_DT;
	}

	public String getHEI_RV_IND() {
		return HEI_RV_IND;
	}


	public void setHEI_RV_IND(String hEI_RV_IND) {
		HEI_RV_IND = hEI_RV_IND;
	}


	@Override
	public String toString() {
		return "APPL_FEE_REDUCTION [HEI_APPL_LEGAPPLID=" + HEI_APPL_LEGAPPLID + ", HEI_APPL_KPTNO=" + HEI_APPL_KPTNO
				+ ", HEI_APPL_DATE=" + HEI_APPL_DATE
				+", HEI_CREATE_DT=" + HEI_CREATE_DT
				+ ", HEI_RV_IND=" + HEI_RV_IND +"]";
	}
	
}
