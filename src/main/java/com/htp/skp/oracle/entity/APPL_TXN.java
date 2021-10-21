package com.htp.skp.oracle.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

import com.htp.skp.oracle.pk.APPL_TXN_PK;

@Entity
@IdClass(APPL_TXN_PK.class)
public class APPL_TXN {

	@Id private String APPLID;
	@Id private Integer TXNSERNO;
	
	private String TXNCODE;
	private String TXNCANCELCODE;
	private String LICTYPE;
	private String LICCLASS;
	private String LICUSAGECODE;
	private Integer LICVALIDPERIOD;
	private Integer PAYMSERNO;
	private Integer QCSERNO;
	private String QCFLAG;
	private Date TXNDATE;
	private String LEGUPDFLAG;
	private String LEGTXNCODE;
	private Integer PAYMSERNO1;
	
	
	
	public APPL_TXN() {
	}

	public APPL_TXN(String aPPLID, Integer tXNSERNO, String tXNCODE, String tXNCANCELCODE, String lICTYPE,
			String lICCLASS, String lICUSAGECODE, Integer lICVALIDPERIOD, Integer pAYMSERNO, Integer qCSERNO,
			String qCFLAG, Date tXNDATE, String lEGUPDFLAG, String lEGTXNCODE, Integer pAYMSERNO1) {
		super();
		APPLID = aPPLID;
		TXNSERNO = tXNSERNO;
		TXNCODE = tXNCODE;
		TXNCANCELCODE = tXNCANCELCODE;
		LICTYPE = lICTYPE;
		LICCLASS = lICCLASS;
		LICUSAGECODE = lICUSAGECODE;
		LICVALIDPERIOD = lICVALIDPERIOD;
		PAYMSERNO = pAYMSERNO;
		QCSERNO = qCSERNO;
		QCFLAG = qCFLAG;
		TXNDATE = tXNDATE;
		LEGUPDFLAG = lEGUPDFLAG;
		LEGTXNCODE = lEGTXNCODE;
		PAYMSERNO1 = pAYMSERNO1;
	}

	public String getAPPLID() {
		return APPLID;
	}

	public void setAPPLID(String aPPLID) {
		APPLID = aPPLID;
	}

	public Integer getTXNSERNO() {
		return TXNSERNO;
	}

	public void setTXNSERNO(Integer tXNSERNO) {
		TXNSERNO = tXNSERNO;
	}

	public String getTXNCODE() {
		return TXNCODE;
	}

	public void setTXNCODE(String tXNCODE) {
		TXNCODE = tXNCODE;
	}

	public String getTXNCANCELCODE() {
		return TXNCANCELCODE;
	}

	public void setTXNCANCELCODE(String tXNCANCELCODE) {
		TXNCANCELCODE = tXNCANCELCODE;
	}

	public String getLICTYPE() {
		return LICTYPE;
	}

	public void setLICTYPE(String lICTYPE) {
		LICTYPE = lICTYPE;
	}

	public String getLICCLASS() {
		return LICCLASS;
	}

	public void setLICCLASS(String lICCLASS) {
		LICCLASS = lICCLASS;
	}

	public String getLICUSAGECODE() {
		return LICUSAGECODE;
	}

	public void setLICUSAGECODE(String lICUSAGECODE) {
		LICUSAGECODE = lICUSAGECODE;
	}

	public Integer getLICVALIDPERIOD() {
		return LICVALIDPERIOD;
	}

	public void setLICVALIDPERIOD(Integer lICVALIDPERIOD) {
		LICVALIDPERIOD = lICVALIDPERIOD;
	}

	public Integer getPAYMSERNO() {
		return PAYMSERNO;
	}

	public void setPAYMSERNO(Integer pAYMSERNO) {
		PAYMSERNO = pAYMSERNO;
	}

	public Integer getQCSERNO() {
		return QCSERNO;
	}

	public void setQCSERNO(Integer qCSERNO) {
		QCSERNO = qCSERNO;
	}

	public String getQCFLAG() {
		return QCFLAG;
	}

	public void setQCFLAG(String qCFLAG) {
		QCFLAG = qCFLAG;
	}

	public Date getTXNDATE() {
		return TXNDATE;
	}

	public void setTXNDATE(Date tXNDATE) {
		TXNDATE = tXNDATE;
	}

	public String getLEGUPDFLAG() {
		return LEGUPDFLAG;
	}

	public void setLEGUPDFLAG(String lEGUPDFLAG) {
		LEGUPDFLAG = lEGUPDFLAG;
	}

	public String getLEGTXNCODE() {
		return LEGTXNCODE;
	}

	public void setLEGTXNCODE(String lEGTXNCODE) {
		LEGTXNCODE = lEGTXNCODE;
	}

	public Integer getPAYMSERNO1() {
		return PAYMSERNO1;
	}

	public void setPAYMSERNO1(Integer pAYMSERNO1) {
		PAYMSERNO1 = pAYMSERNO1;
	}

	@Override
	public String toString() {
		return "APPL_TXN [APPLID=" + APPLID + ", TXNSERNO=" + TXNSERNO + ", TXNCODE=" + TXNCODE + ", TXNCANCELCODE="
				+ TXNCANCELCODE + ", LICTYPE=" + LICTYPE + ", LICCLASS=" + LICCLASS + ", LICUSAGECODE=" + LICUSAGECODE
				+ ", LICVALIDPERIOD=" + LICVALIDPERIOD + ", PAYMSERNO=" + PAYMSERNO + ", QCSERNO=" + QCSERNO
				+ ", QCFLAG=" + QCFLAG + ", TXNDATE=" + TXNDATE + ", LEGUPDFLAG=" + LEGUPDFLAG + ", LEGTXNCODE="
				+ LEGTXNCODE + ", PAYMSERNO1=" + PAYMSERNO1 + "]";
	}

	
	
}
