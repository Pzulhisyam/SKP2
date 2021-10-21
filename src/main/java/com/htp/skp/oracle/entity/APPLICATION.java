package com.htp.skp.oracle.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class APPLICATION {
	
	@Id
	private String APPLID;
	
	private Date APPLDATE;
	private String APPLSTAT;
	private Integer APPLPRIORITY;
	private Integer PROCSERNO;
	private Date DATEOFARRIVAL;
	private Date DATEOFAPPROVAL;
	private String RELATIONCODE;
	private String TEMPORARYID;
	private String OWNERCAT;
	private String KPTNO;
	private Integer COLLCENTER;
	private String COLLKPTNO;
	private String IDTYPE;
	private String IDNO;
	private Integer APPNTCARDVERNO;
	private String LICIDTYPE;
	private String LICIDNO;
	private String APPLREMARKS;
	private String SUPVSRNOTES;
	private String DISTRICTCODE;
	private Date APPLCANCELDATE;
	private String APPLCANCELCODE;
	private String BRANCHCODE;
	private String USERID;
	private String WSID;
	private Date TIMESTAMP ;
	private Integer QTICKETNO;
	private String APPLSTAGE;
	private String LOSTRECEIPTFLAG;
	private String QCFLAG;
	private String MISSEDOPEXFLAG;
	private String SUMMIND;
	private String SPONSORIDTYPE;
	private String SPONSORIDNO;
	private String SSCBRANCHCODE;
	private String GENDER;
	private String PHOTOCAPTURE;
	private String SUMMPAYMIND;
	private String LOSSCARDIND;
	private Date CARDCOLLDATE;
	private Date BIRTHDATE;
	private String AGENCYONCHIP;
	private String NEWOWNERCAT;
	private String CONTACTNO;
	private Integer MEPSCASH;
	private String LOSSOFDL;
	private String PRBSTATUS;
	private String OFFICCOLORCODE;
	private String OLDAPPLID;
	private Date TEMPIDEXPDATE;
	private String TEMPIDSERNO;
	private Integer CARDLOSTCOUNT;
	private String LOADDL;
	private Date IMMEXPIRYDATE;
	private String PDLRENEWTYPE;
	private String APRVLDOCNO;
	private String OLDKPTNO;
	private Date JOINDATE;
	private String NAMECHGCODE;
	private Date NAMEREGDATE;
	private String LEGAPPLID;
	
	public APPLICATION() {
	}

	public APPLICATION(String aPPLID, Date aPPLDATE, String aPPLSTAT, Integer aPPLPRIORITY, Integer pROCSERNO,
			Date dATEOFARRIVAL, Date dATEOFAPPROVAL, String rELATIONCODE, String tEMPORARYID, String oWNERCAT,
			String kPTNO, Integer cOLLCENTER, String cOLLKPTNO, String iDTYPE, String iDNO, Integer aPPNTCARDVERNO,
			String lICIDTYPE, String lICIDNO, String aPPLREMARKS, String sUPVSRNOTES, String dISTRICTCODE,
			Date aPPLCANCELDATE, String aPPLCANCELCODE, String bRANCHCODE, String uSERID, String wSID, Date tIMESTAMP,
			Integer qTICKETNO, String aPPLSTAGE, String lOSTRECEIPTFLAG, String qCFLAG, String mISSEDOPEXFLAG,
			String sUMMIND, String sPONSORIDTYPE, String sPONSORIDNO, String sSCBRANCHCODE, String gENDER,
			String pHOTOCAPTURE, String sUMMPAYMIND, String lOSSCARDIND, Date cARDCOLLDATE, Date bIRTHDATE,
			String aGENCYONCHIP, String nEWOWNERCAT, String cONTACTNO, Integer mEPSCASH, String lOSSOFDL,
			String pRBSTATUS, String oFFICCOLORCODE, String oLDAPPLID, Date tEMPIDEXPDATE, String tEMPIDSERNO,
			Integer cARDLOSTCOUNT, String lOADDL, Date iMMEXPIRYDATE, String pDLRENEWTYPE, String aPRVLDOCNO,
			String oLDKPTNO, Date jOINDATE, String nAMECHGCODE, Date nAMEREGDATE, String lEGAPPLID) {
		super();
		APPLID = aPPLID;
		APPLDATE = aPPLDATE;
		APPLSTAT = aPPLSTAT;
		APPLPRIORITY = aPPLPRIORITY;
		PROCSERNO = pROCSERNO;
		DATEOFARRIVAL = dATEOFARRIVAL;
		DATEOFAPPROVAL = dATEOFAPPROVAL;
		RELATIONCODE = rELATIONCODE;
		TEMPORARYID = tEMPORARYID;
		OWNERCAT = oWNERCAT;
		KPTNO = kPTNO;
		COLLCENTER = cOLLCENTER;
		COLLKPTNO = cOLLKPTNO;
		IDTYPE = iDTYPE;
		IDNO = iDNO;
		APPNTCARDVERNO = aPPNTCARDVERNO;
		LICIDTYPE = lICIDTYPE;
		LICIDNO = lICIDNO;
		APPLREMARKS = aPPLREMARKS;
		SUPVSRNOTES = sUPVSRNOTES;
		DISTRICTCODE = dISTRICTCODE;
		APPLCANCELDATE = aPPLCANCELDATE;
		APPLCANCELCODE = aPPLCANCELCODE;
		BRANCHCODE = bRANCHCODE;
		USERID = uSERID;
		WSID = wSID;
		TIMESTAMP = tIMESTAMP;
		QTICKETNO = qTICKETNO;
		APPLSTAGE = aPPLSTAGE;
		LOSTRECEIPTFLAG = lOSTRECEIPTFLAG;
		QCFLAG = qCFLAG;
		MISSEDOPEXFLAG = mISSEDOPEXFLAG;
		SUMMIND = sUMMIND;
		SPONSORIDTYPE = sPONSORIDTYPE;
		SPONSORIDNO = sPONSORIDNO;
		SSCBRANCHCODE = sSCBRANCHCODE;
		GENDER = gENDER;
		PHOTOCAPTURE = pHOTOCAPTURE;
		SUMMPAYMIND = sUMMPAYMIND;
		LOSSCARDIND = lOSSCARDIND;
		CARDCOLLDATE = cARDCOLLDATE;
		BIRTHDATE = bIRTHDATE;
		AGENCYONCHIP = aGENCYONCHIP;
		NEWOWNERCAT = nEWOWNERCAT;
		CONTACTNO = cONTACTNO;
		MEPSCASH = mEPSCASH;
		LOSSOFDL = lOSSOFDL;
		PRBSTATUS = pRBSTATUS;
		OFFICCOLORCODE = oFFICCOLORCODE;
		OLDAPPLID = oLDAPPLID;
		TEMPIDEXPDATE = tEMPIDEXPDATE;
		TEMPIDSERNO = tEMPIDSERNO;
		CARDLOSTCOUNT = cARDLOSTCOUNT;
		LOADDL = lOADDL;
		IMMEXPIRYDATE = iMMEXPIRYDATE;
		PDLRENEWTYPE = pDLRENEWTYPE;
		APRVLDOCNO = aPRVLDOCNO;
		OLDKPTNO = oLDKPTNO;
		JOINDATE = jOINDATE;
		NAMECHGCODE = nAMECHGCODE;
		NAMEREGDATE = nAMEREGDATE;
		LEGAPPLID = lEGAPPLID;
	}

	public String getAPPLID() {
		return APPLID;
	}

	public void setAPPLID(String aPPLID) {
		APPLID = aPPLID;
	}

	public Date getAPPLDATE() {
		return APPLDATE;
	}

	public void setAPPLDATE(Date aPPLDATE) {
		APPLDATE = aPPLDATE;
	}

	public String getAPPLSTAT() {
		return APPLSTAT;
	}

	public void setAPPLSTAT(String aPPLSTAT) {
		APPLSTAT = aPPLSTAT;
	}

	public Integer getAPPLPRIORITY() {
		return APPLPRIORITY;
	}

	public void setAPPLPRIORITY(Integer aPPLPRIORITY) {
		APPLPRIORITY = aPPLPRIORITY;
	}

	public Integer getPROCSERNO() {
		return PROCSERNO;
	}

	public void setPROCSERNO(Integer pROCSERNO) {
		PROCSERNO = pROCSERNO;
	}

	public Date getDATEOFARRIVAL() {
		return DATEOFARRIVAL;
	}

	public void setDATEOFARRIVAL(Date dATEOFARRIVAL) {
		DATEOFARRIVAL = dATEOFARRIVAL;
	}

	public Date getDATEOFAPPROVAL() {
		return DATEOFAPPROVAL;
	}

	public void setDATEOFAPPROVAL(Date dATEOFAPPROVAL) {
		DATEOFAPPROVAL = dATEOFAPPROVAL;
	}

	public String getRELATIONCODE() {
		return RELATIONCODE;
	}

	public void setRELATIONCODE(String rELATIONCODE) {
		RELATIONCODE = rELATIONCODE;
	}

	public String getTEMPORARYID() {
		return TEMPORARYID;
	}

	public void setTEMPORARYID(String tEMPORARYID) {
		TEMPORARYID = tEMPORARYID;
	}

	public String getOWNERCAT() {
		return OWNERCAT;
	}

	public void setOWNERCAT(String oWNERCAT) {
		OWNERCAT = oWNERCAT;
	}

	public String getKPTNO() {
		return KPTNO;
	}

	public void setKPTNO(String kPTNO) {
		KPTNO = kPTNO;
	}

	public Integer getCOLLCENTER() {
		return COLLCENTER;
	}

	public void setCOLLCENTER(Integer cOLLCENTER) {
		COLLCENTER = cOLLCENTER;
	}

	public String getCOLLKPTNO() {
		return COLLKPTNO;
	}

	public void setCOLLKPTNO(String cOLLKPTNO) {
		COLLKPTNO = cOLLKPTNO;
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

	public Integer getAPPNTCARDVERNO() {
		return APPNTCARDVERNO;
	}

	public void setAPPNTCARDVERNO(Integer aPPNTCARDVERNO) {
		APPNTCARDVERNO = aPPNTCARDVERNO;
	}

	public String getLICIDTYPE() {
		return LICIDTYPE;
	}

	public void setLICIDTYPE(String lICIDTYPE) {
		LICIDTYPE = lICIDTYPE;
	}

	public String getLICIDNO() {
		return LICIDNO;
	}

	public void setLICIDNO(String lICIDNO) {
		LICIDNO = lICIDNO;
	}

	public String getAPPLREMARKS() {
		return APPLREMARKS;
	}

	public void setAPPLREMARKS(String aPPLREMARKS) {
		APPLREMARKS = aPPLREMARKS;
	}

	public String getSUPVSRNOTES() {
		return SUPVSRNOTES;
	}

	public void setSUPVSRNOTES(String sUPVSRNOTES) {
		SUPVSRNOTES = sUPVSRNOTES;
	}

	public String getDISTRICTCODE() {
		return DISTRICTCODE;
	}

	public void setDISTRICTCODE(String dISTRICTCODE) {
		DISTRICTCODE = dISTRICTCODE;
	}

	public Date getAPPLCANCELDATE() {
		return APPLCANCELDATE;
	}

	public void setAPPLCANCELDATE(Date aPPLCANCELDATE) {
		APPLCANCELDATE = aPPLCANCELDATE;
	}

	public String getAPPLCANCELCODE() {
		return APPLCANCELCODE;
	}

	public void setAPPLCANCELCODE(String aPPLCANCELCODE) {
		APPLCANCELCODE = aPPLCANCELCODE;
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

	public Integer getQTICKETNO() {
		return QTICKETNO;
	}

	public void setQTICKETNO(Integer qTICKETNO) {
		QTICKETNO = qTICKETNO;
	}

	public String getAPPLSTAGE() {
		return APPLSTAGE;
	}

	public void setAPPLSTAGE(String aPPLSTAGE) {
		APPLSTAGE = aPPLSTAGE;
	}

	public String getLOSTRECEIPTFLAG() {
		return LOSTRECEIPTFLAG;
	}

	public void setLOSTRECEIPTFLAG(String lOSTRECEIPTFLAG) {
		LOSTRECEIPTFLAG = lOSTRECEIPTFLAG;
	}

	public String getQCFLAG() {
		return QCFLAG;
	}

	public void setQCFLAG(String qCFLAG) {
		QCFLAG = qCFLAG;
	}

	public String getMISSEDOPEXFLAG() {
		return MISSEDOPEXFLAG;
	}

	public void setMISSEDOPEXFLAG(String mISSEDOPEXFLAG) {
		MISSEDOPEXFLAG = mISSEDOPEXFLAG;
	}

	public String getSUMMIND() {
		return SUMMIND;
	}

	public void setSUMMIND(String sUMMIND) {
		SUMMIND = sUMMIND;
	}

	public String getSPONSORIDTYPE() {
		return SPONSORIDTYPE;
	}

	public void setSPONSORIDTYPE(String sPONSORIDTYPE) {
		SPONSORIDTYPE = sPONSORIDTYPE;
	}

	public String getSPONSORIDNO() {
		return SPONSORIDNO;
	}

	public void setSPONSORIDNO(String sPONSORIDNO) {
		SPONSORIDNO = sPONSORIDNO;
	}

	public String getSSCBRANCHCODE() {
		return SSCBRANCHCODE;
	}

	public void setSSCBRANCHCODE(String sSCBRANCHCODE) {
		SSCBRANCHCODE = sSCBRANCHCODE;
	}

	public String getGENDER() {
		return GENDER;
	}

	public void setGENDER(String gENDER) {
		GENDER = gENDER;
	}

	public String getPHOTOCAPTURE() {
		return PHOTOCAPTURE;
	}

	public void setPHOTOCAPTURE(String pHOTOCAPTURE) {
		PHOTOCAPTURE = pHOTOCAPTURE;
	}

	public String getSUMMPAYMIND() {
		return SUMMPAYMIND;
	}

	public void setSUMMPAYMIND(String sUMMPAYMIND) {
		SUMMPAYMIND = sUMMPAYMIND;
	}

	public String getLOSSCARDIND() {
		return LOSSCARDIND;
	}

	public void setLOSSCARDIND(String lOSSCARDIND) {
		LOSSCARDIND = lOSSCARDIND;
	}

	public Date getCARDCOLLDATE() {
		return CARDCOLLDATE;
	}

	public void setCARDCOLLDATE(Date cARDCOLLDATE) {
		CARDCOLLDATE = cARDCOLLDATE;
	}

	public Date getBIRTHDATE() {
		return BIRTHDATE;
	}

	public void setBIRTHDATE(Date bIRTHDATE) {
		BIRTHDATE = bIRTHDATE;
	}

	public String getAGENCYONCHIP() {
		return AGENCYONCHIP;
	}

	public void setAGENCYONCHIP(String aGENCYONCHIP) {
		AGENCYONCHIP = aGENCYONCHIP;
	}

	public String getNEWOWNERCAT() {
		return NEWOWNERCAT;
	}

	public void setNEWOWNERCAT(String nEWOWNERCAT) {
		NEWOWNERCAT = nEWOWNERCAT;
	}

	public String getCONTACTNO() {
		return CONTACTNO;
	}

	public void setCONTACTNO(String cONTACTNO) {
		CONTACTNO = cONTACTNO;
	}

	public Integer getMEPSCASH() {
		return MEPSCASH;
	}

	public void setMEPSCASH(Integer mEPSCASH) {
		MEPSCASH = mEPSCASH;
	}

	public String getLOSSOFDL() {
		return LOSSOFDL;
	}

	public void setLOSSOFDL(String lOSSOFDL) {
		LOSSOFDL = lOSSOFDL;
	}

	public String getPRBSTATUS() {
		return PRBSTATUS;
	}

	public void setPRBSTATUS(String pRBSTATUS) {
		PRBSTATUS = pRBSTATUS;
	}

	public String getOFFICCOLORCODE() {
		return OFFICCOLORCODE;
	}

	public void setOFFICCOLORCODE(String oFFICCOLORCODE) {
		OFFICCOLORCODE = oFFICCOLORCODE;
	}

	public String getOLDAPPLID() {
		return OLDAPPLID;
	}

	public void setOLDAPPLID(String oLDAPPLID) {
		OLDAPPLID = oLDAPPLID;
	}

	public Date getTEMPIDEXPDATE() {
		return TEMPIDEXPDATE;
	}

	public void setTEMPIDEXPDATE(Date tEMPIDEXPDATE) {
		TEMPIDEXPDATE = tEMPIDEXPDATE;
	}

	public String getTEMPIDSERNO() {
		return TEMPIDSERNO;
	}

	public void setTEMPIDSERNO(String tEMPIDSERNO) {
		TEMPIDSERNO = tEMPIDSERNO;
	}

	public Integer getCARDLOSTCOUNT() {
		return CARDLOSTCOUNT;
	}

	public void setCARDLOSTCOUNT(Integer cARDLOSTCOUNT) {
		CARDLOSTCOUNT = cARDLOSTCOUNT;
	}

	public String getLOADDL() {
		return LOADDL;
	}

	public void setLOADDL(String lOADDL) {
		LOADDL = lOADDL;
	}

	public Date getIMMEXPIRYDATE() {
		return IMMEXPIRYDATE;
	}

	public void setIMMEXPIRYDATE(Date iMMEXPIRYDATE) {
		IMMEXPIRYDATE = iMMEXPIRYDATE;
	}

	public String getPDLRENEWTYPE() {
		return PDLRENEWTYPE;
	}

	public void setPDLRENEWTYPE(String pDLRENEWTYPE) {
		PDLRENEWTYPE = pDLRENEWTYPE;
	}

	public String getAPRVLDOCNO() {
		return APRVLDOCNO;
	}

	public void setAPRVLDOCNO(String aPRVLDOCNO) {
		APRVLDOCNO = aPRVLDOCNO;
	}

	public String getOLDKPTNO() {
		return OLDKPTNO;
	}

	public void setOLDKPTNO(String oLDKPTNO) {
		OLDKPTNO = oLDKPTNO;
	}

	public Date getJOINDATE() {
		return JOINDATE;
	}

	public void setJOINDATE(Date jOINDATE) {
		JOINDATE = jOINDATE;
	}

	public String getNAMECHGCODE() {
		return NAMECHGCODE;
	}

	public void setNAMECHGCODE(String nAMECHGCODE) {
		NAMECHGCODE = nAMECHGCODE;
	}

	public Date getNAMEREGDATE() {
		return NAMEREGDATE;
	}

	public void setNAMEREGDATE(Date nAMEREGDATE) {
		NAMEREGDATE = nAMEREGDATE;
	}

	public String getLEGAPPLID() {
		return LEGAPPLID;
	}

	public void setLEGAPPLID(String lEGAPPLID) {
		LEGAPPLID = lEGAPPLID;
	}

	@Override
	public String toString() {
		return "APPLICATION [APPLID=" + APPLID + ", APPLDATE=" + APPLDATE + ", APPLSTAT=" + APPLSTAT + ", APPLPRIORITY="
				+ APPLPRIORITY + ", PROCSERNO=" + PROCSERNO + ", DATEOFARRIVAL=" + DATEOFARRIVAL + ", DATEOFAPPROVAL="
				+ DATEOFAPPROVAL + ", RELATIONCODE=" + RELATIONCODE + ", TEMPORARYID=" + TEMPORARYID + ", OWNERCAT="
				+ OWNERCAT + ", KPTNO=" + KPTNO + ", COLLCENTER=" + COLLCENTER + ", COLLKPTNO=" + COLLKPTNO
				+ ", IDTYPE=" + IDTYPE + ", IDNO=" + IDNO + ", APPNTCARDVERNO=" + APPNTCARDVERNO + ", LICIDTYPE="
				+ LICIDTYPE + ", LICIDNO=" + LICIDNO + ", APPLREMARKS=" + APPLREMARKS + ", SUPVSRNOTES=" + SUPVSRNOTES
				+ ", DISTRICTCODE=" + DISTRICTCODE + ", APPLCANCELDATE=" + APPLCANCELDATE + ", APPLCANCELCODE="
				+ APPLCANCELCODE + ", BRANCHCODE=" + BRANCHCODE + ", USERID=" + USERID + ", WSID=" + WSID
				+ ", TIMESTAMP=" + TIMESTAMP + ", QTICKETNO=" + QTICKETNO + ", APPLSTAGE=" + APPLSTAGE
				+ ", LOSTRECEIPTFLAG=" + LOSTRECEIPTFLAG + ", QCFLAG=" + QCFLAG + ", MISSEDOPEXFLAG=" + MISSEDOPEXFLAG
				+ ", SUMMIND=" + SUMMIND + ", SPONSORIDTYPE=" + SPONSORIDTYPE + ", SPONSORIDNO=" + SPONSORIDNO
				+ ", SSCBRANCHCODE=" + SSCBRANCHCODE + ", GENDER=" + GENDER + ", PHOTOCAPTURE=" + PHOTOCAPTURE
				+ ", SUMMPAYMIND=" + SUMMPAYMIND + ", LOSSCARDIND=" + LOSSCARDIND + ", CARDCOLLDATE=" + CARDCOLLDATE
				+ ", BIRTHDATE=" + BIRTHDATE + ", AGENCYONCHIP=" + AGENCYONCHIP + ", NEWOWNERCAT=" + NEWOWNERCAT
				+ ", CONTACTNO=" + CONTACTNO + ", MEPSCASH=" + MEPSCASH + ", LOSSOFDL=" + LOSSOFDL + ", PRBSTATUS="
				+ PRBSTATUS + ", OFFICCOLORCODE=" + OFFICCOLORCODE + ", OLDAPPLID=" + OLDAPPLID + ", TEMPIDEXPDATE="
				+ TEMPIDEXPDATE + ", TEMPIDSERNO=" + TEMPIDSERNO + ", CARDLOSTCOUNT=" + CARDLOSTCOUNT + ", LOADDL="
				+ LOADDL + ", IMMEXPIRYDATE=" + IMMEXPIRYDATE + ", PDLRENEWTYPE=" + PDLRENEWTYPE + ", APRVLDOCNO="
				+ APRVLDOCNO + ", OLDKPTNO=" + OLDKPTNO + ", JOINDATE=" + JOINDATE + ", NAMECHGCODE=" + NAMECHGCODE
				+ ", NAMEREGDATE=" + NAMEREGDATE + ", LEGAPPLID=" + LEGAPPLID + "]";
	}
	
	
	
	
}
