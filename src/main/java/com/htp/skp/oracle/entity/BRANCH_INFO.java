package com.htp.skp.oracle.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class BRANCH_INFO {
	@Id
	private String BRANCHCODE;
	
	private String AGENCYCODE;
	private String BRANCHCODEJPN;
	private String BRANCHCODEJPJ;
	private String BRANCHCODEIMM;
	private String BRANCHCODEPDRM;
	private String ADDRESS1;
	private String ADDRESS2;
	private String ADDRESS3;
	private String POSTCODE;
	private Integer CITYCODE;
	private String STATECODE;
	private String PHONENO;
	private String EMAILADDRESS;
	private String GSCFLAG;
	private String GSCNAME;
	private String REGIONCODE;
	private String SSCIND;
	private String BRANCHCODEKKM;
	private String PREFERREDGSC;
	private String PREFERREDGQD;
	private Integer FLLIMT;
	private Integer RECEIPTTELNO;
	private String PREFFCOLLCENTER;
	private String STATEBRANCHCODE;
	private String MOBACTIVEFLAG;
	private Date MOBEFFECTDATE;
	private Date MOBEXPIRYDATE;
	private String MOBILE;
	private String MOBLOCATION;
	private String MOBREPORTBRANCH;
	private String BRANCHIND;
	private String PTJCODE;
	private String TXNIND;
	private String COLLIND;
	
	public BRANCH_INFO() {
	}

	public BRANCH_INFO(String bRANCHCODE, String aGENCYCODE, String bRANCHCODEJPN, String bRANCHCODEJPJ,
			String bRANCHCODEIMM, String bRANCHCODEPDRM, String aDDRESS1, String aDDRESS2, String aDDRESS3,
			String pOSTCODE, Integer cITYCODE, String sTATECODE, String pHONENO, String eMAILADDRESS, String gSCFLAG,
			String gSCNAME, String rEGIONCODE, String sSCIND, String bRANCHCODEKKM, String pREFERREDGSC,
			String pREFERREDGQD, Integer fLLIMT, Integer rECEIPTTELNO, String pREFFCOLLCENTER, String sTATEBRANCHCODE,
			String mOBACTIVEFLAG, Date mOBEFFECTDATE, Date mOBEXPIRYDATE, String mOBILE, String mOBLOCATION,
			String mOBREPORTBRANCH, String bRANCHIND, String pTJCODE, String tXNIND, String cOLLIND) {
		super();
		BRANCHCODE = bRANCHCODE;
		AGENCYCODE = aGENCYCODE;
		BRANCHCODEJPN = bRANCHCODEJPN;
		BRANCHCODEJPJ = bRANCHCODEJPJ;
		BRANCHCODEIMM = bRANCHCODEIMM;
		BRANCHCODEPDRM = bRANCHCODEPDRM;
		ADDRESS1 = aDDRESS1;
		ADDRESS2 = aDDRESS2;
		ADDRESS3 = aDDRESS3;
		POSTCODE = pOSTCODE;
		CITYCODE = cITYCODE;
		STATECODE = sTATECODE;
		PHONENO = pHONENO;
		EMAILADDRESS = eMAILADDRESS;
		GSCFLAG = gSCFLAG;
		GSCNAME = gSCNAME;
		REGIONCODE = rEGIONCODE;
		SSCIND = sSCIND;
		BRANCHCODEKKM = bRANCHCODEKKM;
		PREFERREDGSC = pREFERREDGSC;
		PREFERREDGQD = pREFERREDGQD;
		FLLIMT = fLLIMT;
		RECEIPTTELNO = rECEIPTTELNO;
		PREFFCOLLCENTER = pREFFCOLLCENTER;
		STATEBRANCHCODE = sTATEBRANCHCODE;
		MOBACTIVEFLAG = mOBACTIVEFLAG;
		MOBEFFECTDATE = mOBEFFECTDATE;
		MOBEXPIRYDATE = mOBEXPIRYDATE;
		MOBILE = mOBILE;
		MOBLOCATION = mOBLOCATION;
		MOBREPORTBRANCH = mOBREPORTBRANCH;
		BRANCHIND = bRANCHIND;
		PTJCODE = pTJCODE;
		TXNIND = tXNIND;
		COLLIND = cOLLIND;
	}

	public String getBRANCHCODE() {
		return BRANCHCODE;
	}

	public void setBRANCHCODE(String bRANCHCODE) {
		BRANCHCODE = bRANCHCODE;
	}

	public String getAGENCYCODE() {
		return AGENCYCODE;
	}

	public void setAGENCYCODE(String aGENCYCODE) {
		AGENCYCODE = aGENCYCODE;
	}

	public String getBRANCHCODEJPN() {
		return BRANCHCODEJPN;
	}

	public void setBRANCHCODEJPN(String bRANCHCODEJPN) {
		BRANCHCODEJPN = bRANCHCODEJPN;
	}

	public String getBRANCHCODEJPJ() {
		return BRANCHCODEJPJ;
	}

	public void setBRANCHCODEJPJ(String bRANCHCODEJPJ) {
		BRANCHCODEJPJ = bRANCHCODEJPJ;
	}

	public String getBRANCHCODEIMM() {
		return BRANCHCODEIMM;
	}

	public void setBRANCHCODEIMM(String bRANCHCODEIMM) {
		BRANCHCODEIMM = bRANCHCODEIMM;
	}

	public String getBRANCHCODEPDRM() {
		return BRANCHCODEPDRM;
	}

	public void setBRANCHCODEPDRM(String bRANCHCODEPDRM) {
		BRANCHCODEPDRM = bRANCHCODEPDRM;
	}

	public String getADDRESS1() {
		return ADDRESS1;
	}

	public void setADDRESS1(String aDDRESS1) {
		ADDRESS1 = aDDRESS1;
	}

	public String getADDRESS2() {
		return ADDRESS2;
	}

	public void setADDRESS2(String aDDRESS2) {
		ADDRESS2 = aDDRESS2;
	}

	public String getADDRESS3() {
		return ADDRESS3;
	}

	public void setADDRESS3(String aDDRESS3) {
		ADDRESS3 = aDDRESS3;
	}

	public String getPOSTCODE() {
		return POSTCODE;
	}

	public void setPOSTCODE(String pOSTCODE) {
		POSTCODE = pOSTCODE;
	}

	public Integer getCITYCODE() {
		return CITYCODE;
	}

	public void setCITYCODE(Integer cITYCODE) {
		CITYCODE = cITYCODE;
	}

	public String getSTATECODE() {
		return STATECODE;
	}

	public void setSTATECODE(String sTATECODE) {
		STATECODE = sTATECODE;
	}

	public String getPHONENO() {
		return PHONENO;
	}

	public void setPHONENO(String pHONENO) {
		PHONENO = pHONENO;
	}

	public String getEMAILADDRESS() {
		return EMAILADDRESS;
	}

	public void setEMAILADDRESS(String eMAILADDRESS) {
		EMAILADDRESS = eMAILADDRESS;
	}

	public String getGSCFLAG() {
		return GSCFLAG;
	}

	public void setGSCFLAG(String gSCFLAG) {
		GSCFLAG = gSCFLAG;
	}

	public String getGSCNAME() {
		return GSCNAME;
	}

	public void setGSCNAME(String gSCNAME) {
		GSCNAME = gSCNAME;
	}

	public String getREGIONCODE() {
		return REGIONCODE;
	}

	public void setREGIONCODE(String rEGIONCODE) {
		REGIONCODE = rEGIONCODE;
	}

	public String getSSCIND() {
		return SSCIND;
	}

	public void setSSCIND(String sSCIND) {
		SSCIND = sSCIND;
	}

	public String getBRANCHCODEKKM() {
		return BRANCHCODEKKM;
	}

	public void setBRANCHCODEKKM(String bRANCHCODEKKM) {
		BRANCHCODEKKM = bRANCHCODEKKM;
	}

	public String getPREFERREDGSC() {
		return PREFERREDGSC;
	}

	public void setPREFERREDGSC(String pREFERREDGSC) {
		PREFERREDGSC = pREFERREDGSC;
	}

	public String getPREFERREDGQD() {
		return PREFERREDGQD;
	}

	public void setPREFERREDGQD(String pREFERREDGQD) {
		PREFERREDGQD = pREFERREDGQD;
	}

	public Integer getFLLIMT() {
		return FLLIMT;
	}

	public void setFLLIMT(Integer fLLIMT) {
		FLLIMT = fLLIMT;
	}

	public Integer getRECEIPTTELNO() {
		return RECEIPTTELNO;
	}

	public void setRECEIPTTELNO(Integer rECEIPTTELNO) {
		RECEIPTTELNO = rECEIPTTELNO;
	}

	public String getPREFFCOLLCENTER() {
		return PREFFCOLLCENTER;
	}

	public void setPREFFCOLLCENTER(String pREFFCOLLCENTER) {
		PREFFCOLLCENTER = pREFFCOLLCENTER;
	}

	public String getSTATEBRANCHCODE() {
		return STATEBRANCHCODE;
	}

	public void setSTATEBRANCHCODE(String sTATEBRANCHCODE) {
		STATEBRANCHCODE = sTATEBRANCHCODE;
	}

	public String getMOBACTIVEFLAG() {
		return MOBACTIVEFLAG;
	}

	public void setMOBACTIVEFLAG(String mOBACTIVEFLAG) {
		MOBACTIVEFLAG = mOBACTIVEFLAG;
	}

	public Date getMOBEFFECTDATE() {
		return MOBEFFECTDATE;
	}

	public void setMOBEFFECTDATE(Date mOBEFFECTDATE) {
		MOBEFFECTDATE = mOBEFFECTDATE;
	}

	public Date getMOBEXPIRYDATE() {
		return MOBEXPIRYDATE;
	}

	public void setMOBEXPIRYDATE(Date mOBEXPIRYDATE) {
		MOBEXPIRYDATE = mOBEXPIRYDATE;
	}

	public String getMOBILE() {
		return MOBILE;
	}

	public void setMOBILE(String mOBILE) {
		MOBILE = mOBILE;
	}

	public String getMOBLOCATION() {
		return MOBLOCATION;
	}

	public void setMOBLOCATION(String mOBLOCATION) {
		MOBLOCATION = mOBLOCATION;
	}

	public String getMOBREPORTBRANCH() {
		return MOBREPORTBRANCH;
	}

	public void setMOBREPORTBRANCH(String mOBREPORTBRANCH) {
		MOBREPORTBRANCH = mOBREPORTBRANCH;
	}

	public String getBRANCHIND() {
		return BRANCHIND;
	}

	public void setBRANCHIND(String bRANCHIND) {
		BRANCHIND = bRANCHIND;
	}

	public String getPTJCODE() {
		return PTJCODE;
	}

	public void setPTJCODE(String pTJCODE) {
		PTJCODE = pTJCODE;
	}

	public String getTXNIND() {
		return TXNIND;
	}

	public void setTXNIND(String tXNIND) {
		TXNIND = tXNIND;
	}

	public String getCOLLIND() {
		return COLLIND;
	}

	public void setCOLLIND(String cOLLIND) {
		COLLIND = cOLLIND;
	}

	@Override
	public String toString() {
		return "BRANCH_INFO [BRANCHCODE=" + BRANCHCODE + ", AGENCYCODE=" + AGENCYCODE + ", BRANCHCODEJPN="
				+ BRANCHCODEJPN + ", BRANCHCODEJPJ=" + BRANCHCODEJPJ + ", BRANCHCODEIMM=" + BRANCHCODEIMM
				+ ", BRANCHCODEPDRM=" + BRANCHCODEPDRM + ", ADDRESS1=" + ADDRESS1 + ", ADDRESS2=" + ADDRESS2
				+ ", ADDRESS3=" + ADDRESS3 + ", POSTCODE=" + POSTCODE + ", CITYCODE=" + CITYCODE + ", STATECODE="
				+ STATECODE + ", PHONENO=" + PHONENO + ", EMAILADDRESS=" + EMAILADDRESS + ", GSCFLAG=" + GSCFLAG
				+ ", GSCNAME=" + GSCNAME + ", REGIONCODE=" + REGIONCODE + ", SSCIND=" + SSCIND + ", BRANCHCODEKKM="
				+ BRANCHCODEKKM + ", PREFERREDGSC=" + PREFERREDGSC + ", PREFERREDGQD=" + PREFERREDGQD + ", FLLIMT="
				+ FLLIMT + ", RECEIPTTELNO=" + RECEIPTTELNO + ", PREFFCOLLCENTER=" + PREFFCOLLCENTER
				+ ", STATEBRANCHCODE=" + STATEBRANCHCODE + ", MOBACTIVEFLAG=" + MOBACTIVEFLAG + ", MOBEFFECTDATE="
				+ MOBEFFECTDATE + ", MOBEXPIRYDATE=" + MOBEXPIRYDATE + ", MOBILE=" + MOBILE + ", MOBLOCATION="
				+ MOBLOCATION + ", MOBREPORTBRANCH=" + MOBREPORTBRANCH + ", BRANCHIND=" + BRANCHIND + ", PTJCODE="
				+ PTJCODE + ", TXNIND=" + TXNIND + ", COLLIND=" + COLLIND + "]";
	}
	
	
	
}
