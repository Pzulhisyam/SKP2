package com.htp.skp.oracle.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class APPL_HISTORY {
	
	@Id private String APPLID;
	private Integer PROCSERNO;
	private Date APPLDATE;
	private String APPLSTAT;
	private String KPTNO;
	private String CURRLONGNAME;
	private String APPLCANCELCODE;
	private Date APPLCANCELDATE;
	private String BRANCHCODE;
	private String USERID;
	private String WSID;
	private Date TIMESTAMP;
	
	
	public APPL_HISTORY() {
	}


	public APPL_HISTORY(String aPPLID, Integer pROCSERNO, Date aPPLDATE, String aPPLSTAT, String kPTNO,
			String cURRLONGNAME, String aPPLCANCELCODE, Date aPPLCANCELDATE, String bRANCHCODE, String uSERID,
			String wSID, Date tIMESTAMP) {
		super();
		APPLID = aPPLID;
		PROCSERNO = pROCSERNO;
		APPLDATE = aPPLDATE;
		APPLSTAT = aPPLSTAT;
		KPTNO = kPTNO;
		CURRLONGNAME = cURRLONGNAME;
		APPLCANCELCODE = aPPLCANCELCODE;
		APPLCANCELDATE = aPPLCANCELDATE;
		BRANCHCODE = bRANCHCODE;
		USERID = uSERID;
		WSID = wSID;
		TIMESTAMP = tIMESTAMP;
	}


	public String getAPPLID() {
		return APPLID;
	}


	public void setAPPLID(String aPPLID) {
		APPLID = aPPLID;
	}


	public Integer getPROCSERNO() {
		return PROCSERNO;
	}


	public void setPROCSERNO(Integer pROCSERNO) {
		PROCSERNO = pROCSERNO;
	}


	public Date getAPPLDATE() {
		return APPLDATE;
	}


	public void setAPPLDATE(Date aPPLDATE) {
		APPLDATE = aPPLDATE;
	}


	public String isAPPLSTAT() {
		return APPLSTAT;
	}


	public void setAPPLSTAT(String aPPLSTAT) {
		APPLSTAT = aPPLSTAT;
	}


	public String getKPTNO() {
		return KPTNO;
	}


	public void setKPTNO(String kPTNO) {
		KPTNO = kPTNO;
	}


	public String getCURRLONGNAME() {
		return CURRLONGNAME;
	}


	public void setCURRLONGNAME(String cURRLONGNAME) {
		CURRLONGNAME = cURRLONGNAME;
	}


	public String getAPPLCANCELCODE() {
		return APPLCANCELCODE;
	}


	public void setAPPLCANCELCODE(String aPPLCANCELCODE) {
		APPLCANCELCODE = aPPLCANCELCODE;
	}


	public Date getAPPLCANCELDATE() {
		return APPLCANCELDATE;
	}


	public void setAPPLCANCELDATE(Date aPPLCANCELDATE) {
		APPLCANCELDATE = aPPLCANCELDATE;
	}


	public String getBRANCHCODE() {
		return BRANCHCODE;
	}


	public void setBRANCHCODE(String bRANCHCODE) {
		BRANCHCODE = bRANCHCODE;
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


	public Date getTIMESTAMP() {
		return TIMESTAMP;
	}


	public void setTIMESTAMP(Date tIMESTAMP) {
		TIMESTAMP = tIMESTAMP;
	}


	@Override
	public String toString() {
		return "APPL_HISTORY [APPLID=" + APPLID + ", PROCSERNO=" + PROCSERNO + ", APPLDATE=" + APPLDATE + ", APPLSTAT="
				+ APPLSTAT + ", KPTNO=" + KPTNO + ", CURRLONGNAME=" + CURRLONGNAME + ", APPLCANCELCODE="
				+ APPLCANCELCODE + ", APPLCANCELDATE=" + APPLCANCELDATE + ", BRANCHCODE=" + BRANCHCODE + ", USERID="
				+ USERID + ", WSID=" + WSID + ", TIMESTAMP=" + TIMESTAMP + "]";
	}
	
	
	
}
