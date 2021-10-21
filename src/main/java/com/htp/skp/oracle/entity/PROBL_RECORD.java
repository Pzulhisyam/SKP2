package com.htp.skp.oracle.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

import com.htp.skp.oracle.pk.PROBL_RECORD_PK;

@Entity
@IdClass(PROBL_RECORD_PK.class)
public class PROBL_RECORD {

	@Id private String APPLID;
	@Id private Integer PROBLNO;
	
	private String IDTYPE;
	private String IDNO;
	private Date PROBLDATE;
	private String PROBLREASONCODE;
	private Integer PROBLSERNO;
	private String PROBLSTAT;
	private String PROBLREMARKS;
	private Date PROBLSOLVEDATE;
	private String USERID;
	private String WSID;
	private Date ACTDATETIME;
	private String ACTREMARKS;
	private String ACTUSERID;
	private String BRANCHCODE;
	private String TXNCODE;
	private String LEGACYTYPE;
	private String GSCBUPDFLAG;
	private String ENQFLAG;
	private String GENKPT;
	private String BSKRECD;
	private String GUSER1;
	private Date GUSER1TIMESTAMP;
	private String GUSER2;
	private Date GUSER2TIMESTAMP;
	
	
	public PROBL_RECORD() {
		
	}

	public PROBL_RECORD(String aPPLID, Integer pROBLNO, String iDTYPE, String iDNO, Date pROBLDATE,
			String pROBLREASONCODE, Integer pROBLSERNO, String pROBLSTAT, String pROBLREMARKS, Date pROBLSOLVEDATE,
			String uSERID, String wSID, Date aCTDATETIME, String aCTREMARKS, String aCTUSERID, String bRANCHCODE,
			String tXNCODE, String lEGACYTYPE, String gSCBUPDFLAG, String eNQFLAG, String gENKPT, String bSKRECD,
			String gUSER1, Date gUSER1TIMESTAMP, String gUSER2, Date gUSER2TIMESTAMP) {
		super();
		APPLID = aPPLID;
		PROBLNO = pROBLNO;
		IDTYPE = iDTYPE;
		IDNO = iDNO;
		PROBLDATE = pROBLDATE;
		PROBLREASONCODE = pROBLREASONCODE;
		PROBLSERNO = pROBLSERNO;
		PROBLSTAT = pROBLSTAT;
		PROBLREMARKS = pROBLREMARKS;
		PROBLSOLVEDATE = pROBLSOLVEDATE;
		USERID = uSERID;
		WSID = wSID;
		ACTDATETIME = aCTDATETIME;
		ACTREMARKS = aCTREMARKS;
		ACTUSERID = aCTUSERID;
		BRANCHCODE = bRANCHCODE;
		TXNCODE = tXNCODE;
		LEGACYTYPE = lEGACYTYPE;
		GSCBUPDFLAG = gSCBUPDFLAG;
		ENQFLAG = eNQFLAG;
		GENKPT = gENKPT;
		BSKRECD = bSKRECD;
		GUSER1 = gUSER1;
		GUSER1TIMESTAMP = gUSER1TIMESTAMP;
		GUSER2 = gUSER2;
		GUSER2TIMESTAMP = gUSER2TIMESTAMP;
	}

	public String getAPPLID() {
		return APPLID;
	}

	public void setAPPLID(String aPPLID) {
		APPLID = aPPLID;
	}

	public Integer getPROBLNO() {
		return PROBLNO;
	}

	public void setPROBLNO(Integer pROBLNO) {
		PROBLNO = pROBLNO;
	}

	public String getIDTYPE() {
		return IDTYPE;
	}

	public void setIDTYPE(String iDTYPE) {
		IDTYPE = iDTYPE;
	}

	public String getIDNO() {
		return IDNO;
	}

	public void setIDNO(String iDNO) {
		IDNO = iDNO;
	}

	public Date getPROBLDATE() {
		return PROBLDATE;
	}

	public void setPROBLDATE(Date pROBLDATE) {
		PROBLDATE = pROBLDATE;
	}

	public String getPROBLREASONCODE() {
		return PROBLREASONCODE;
	}

	public void setPROBLREASONCODE(String pROBLREASONCODE) {
		PROBLREASONCODE = pROBLREASONCODE;
	}

	public Integer getPROBLSERNO() {
		return PROBLSERNO;
	}

	public void setPROBLSERNO(Integer pROBLSERNO) {
		PROBLSERNO = pROBLSERNO;
	}

	public String getPROBLSTAT() {
		return PROBLSTAT;
	}

	public void setPROBLSTAT(String pROBLSTAT) {
		PROBLSTAT = pROBLSTAT;
	}

	public String getPROBLREMARKS() {
		return PROBLREMARKS;
	}

	public void setPROBLREMARKS(String pROBLREMARKS) {
		PROBLREMARKS = pROBLREMARKS;
	}

	public Date getPROBLSOLVEDATE() {
		return PROBLSOLVEDATE;
	}

	public void setPROBLSOLVEDATE(Date pROBLSOLVEDATE) {
		PROBLSOLVEDATE = pROBLSOLVEDATE;
	}

	public String getUSERID() {
		return USERID;
	}

	public void setUSERID(String uSERID) {
		USERID = uSERID;
	}

	public String getWSID() {
		return WSID;
	}

	public void setWSID(String wSID) {
		WSID = wSID;
	}

	public Date getACTDATETIME() {
		return ACTDATETIME;
	}

	public void setACTDATETIME(Date aCTDATETIME) {
		ACTDATETIME = aCTDATETIME;
	}

	public String getACTREMARKS() {
		return ACTREMARKS;
	}

	public void setACTREMARKS(String aCTREMARKS) {
		ACTREMARKS = aCTREMARKS;
	}

	public String getACTUSERID() {
		return ACTUSERID;
	}

	public void setACTUSERID(String aCTUSERID) {
		ACTUSERID = aCTUSERID;
	}

	public String getBRANCHCODE() {
		return BRANCHCODE;
	}

	public void setBRANCHCODE(String bRANCHCODE) {
		BRANCHCODE = bRANCHCODE;
	}

	public String getTXNCODE() {
		return TXNCODE;
	}

	public void setTXNCODE(String tXNCODE) {
		TXNCODE = tXNCODE;
	}

	public String getLEGACYTYPE() {
		return LEGACYTYPE;
	}

	public void setLEGACYTYPE(String lEGACYTYPE) {
		LEGACYTYPE = lEGACYTYPE;
	}

	public String getGSCBUPDFLAG() {
		return GSCBUPDFLAG;
	}

	public void setGSCBUPDFLAG(String gSCBUPDFLAG) {
		GSCBUPDFLAG = gSCBUPDFLAG;
	}

	public String getENQFLAG() {
		return ENQFLAG;
	}

	public void setENQFLAG(String eNQFLAG) {
		ENQFLAG = eNQFLAG;
	}

	public String getGENKPT() {
		return GENKPT;
	}

	public void setGENKPT(String gENKPT) {
		GENKPT = gENKPT;
	}

	public String getBSKRECD() {
		return BSKRECD;
	}

	public void setBSKRECD(String bSKRECD) {
		BSKRECD = bSKRECD;
	}

	public String getGUSER1() {
		return GUSER1;
	}

	public void setGUSER1(String gUSER1) {
		GUSER1 = gUSER1;
	}

	public Date getGUSER1TIMESTAMP() {
		return GUSER1TIMESTAMP;
	}

	public void setGUSER1TIMESTAMP(Date gUSER1TIMESTAMP) {
		GUSER1TIMESTAMP = gUSER1TIMESTAMP;
	}

	public String getGUSER2() {
		return GUSER2;
	}

	public void setGUSER2(String gUSER2) {
		GUSER2 = gUSER2;
	}

	public Date getGUSER2TIMESTAMP() {
		return GUSER2TIMESTAMP;
	}

	public void setGUSER2TIMESTAMP(Date gUSER2TIMESTAMP) {
		GUSER2TIMESTAMP = gUSER2TIMESTAMP;
	}

	@Override
	public String toString() {
		return "PROBL_RECORD [APPLID=" + APPLID + ", PROBLNO=" + PROBLNO + ", IDTYPE=" + IDTYPE + ", IDNO=" + IDNO
				+ ", PROBLDATE=" + PROBLDATE + ", PROBLREASONCODE=" + PROBLREASONCODE + ", PROBLSERNO=" + PROBLSERNO
				+ ", PROBLSTAT=" + PROBLSTAT + ", PROBLREMARKS=" + PROBLREMARKS + ", PROBLSOLVEDATE=" + PROBLSOLVEDATE
				+ ", USERID=" + USERID + ", WSID=" + WSID + ", ACTDATETIME=" + ACTDATETIME + ", ACTREMARKS="
				+ ACTREMARKS + ", ACTUSERID=" + ACTUSERID + ", BRANCHCODE=" + BRANCHCODE + ", TXNCODE=" + TXNCODE
				+ ", LEGACYTYPE=" + LEGACYTYPE + ", GSCBUPDFLAG=" + GSCBUPDFLAG + ", ENQFLAG=" + ENQFLAG + ", GENKPT="
				+ GENKPT + ", BSKRECD=" + BSKRECD + ", GUSER1=" + GUSER1 + ", GUSER1TIMESTAMP=" + GUSER1TIMESTAMP
				+ ", GUSER2=" + GUSER2 + ", GUSER2TIMESTAMP=" + GUSER2TIMESTAMP + "]";
	}
	
	
}
