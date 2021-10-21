package com.htp.skp.oracle.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

import com.htp.skp.oracle.pk.CARD_STATUS_PK;

@Entity
@IdClass(CARD_STATUS_PK.class)
public class CARD_STATUS {
	@Id private String KPTNO;
	@Id private Integer CARDVERSIONNO;
	
	private String APPLID;
	private String BATCHNO;
	private Integer CARDSTAT;
	private Date CARDPERSONALDATE;
	private String CHIPSERNO;
	private Date CARDEXPDATE;
	private Date CARDISSUEDATE;
	private String COLLKPTNO;
	private String USERID;
	private Date TIMESTAMP;
	private Integer CARDUPDGRPNO;
	private Integer CARDSTATUPDREQPROC;
	private String CARDSTATUPDFLAG;
	private String BRANCHCODE;
	private String AGENCYONCHIP;
	private Date CARDDESTROYDATE;
	private Date CARDDISPATCHDATE;
	private Date CARDREJECTDATE;
	private String WSID;
	private String WRONGBATCHNO;
	private String REPRODUCEFLAG;
	private String GQDBRANCHCODE;
	private String MEPSPANNO;
	private String TNGSERNO;
	private String MEPSUPDIND;
	private String TNGUPDIND;
	private String PURSEID;
	
	
	public CARD_STATUS() {
	}


	public CARD_STATUS(String kPTNO, Integer cARDVERSIONNO, String aPPLID, String bATCHNO, Integer cARDSTAT,
			Date cARDPERSONALDATE, String cHIPSERNO, Date cARDEXPDATE, Date cARDISSUEDATE, String cOLLKPTNO,
			String uSERID, Date tIMESTAMP, Integer cARDUPDGRPNO, Integer cARDSTATUPDREQPROC, String cARDSTATUPDFLAG,
			String bRANCHCODE, String aGENCYONCHIP, Date cARDDESTROYDATE, Date cARDDISPATCHDATE, Date cARDREJECTDATE,
			String wSID, String wRONGBATCHNO, String rEPRODUCEFLAG, String gQDBRANCHCODE, String mEPSPANNO,
			String tNGSERNO, String mEPSUPDIND, String tNGUPDIND, String pURSEID) {
		super();
		KPTNO = kPTNO;
		CARDVERSIONNO = cARDVERSIONNO;
		APPLID = aPPLID;
		BATCHNO = bATCHNO;
		CARDSTAT = cARDSTAT;
		CARDPERSONALDATE = cARDPERSONALDATE;
		CHIPSERNO = cHIPSERNO;
		CARDEXPDATE = cARDEXPDATE;
		CARDISSUEDATE = cARDISSUEDATE;
		COLLKPTNO = cOLLKPTNO;
		USERID = uSERID;
		TIMESTAMP = tIMESTAMP;
		CARDUPDGRPNO = cARDUPDGRPNO;
		CARDSTATUPDREQPROC = cARDSTATUPDREQPROC;
		CARDSTATUPDFLAG = cARDSTATUPDFLAG;
		BRANCHCODE = bRANCHCODE;
		AGENCYONCHIP = aGENCYONCHIP;
		CARDDESTROYDATE = cARDDESTROYDATE;
		CARDDISPATCHDATE = cARDDISPATCHDATE;
		CARDREJECTDATE = cARDREJECTDATE;
		WSID = wSID;
		WRONGBATCHNO = wRONGBATCHNO;
		REPRODUCEFLAG = rEPRODUCEFLAG;
		GQDBRANCHCODE = gQDBRANCHCODE;
		MEPSPANNO = mEPSPANNO;
		TNGSERNO = tNGSERNO;
		MEPSUPDIND = mEPSUPDIND;
		TNGUPDIND = tNGUPDIND;
		PURSEID = pURSEID;
	}


	public String getKPTNO() {
		return KPTNO;
	}


	public void setKPTNO(String kPTNO) {
		KPTNO = kPTNO;
	}


	public Integer getCARDVERSIONNO() {
		return CARDVERSIONNO;
	}


	public void setCARDVERSIONNO(Integer cARDVERSIONNO) {
		CARDVERSIONNO = cARDVERSIONNO;
	}


	public String getAPPLID() {
		return APPLID;
	}


	public void setAPPLID(String aPPLID) {
		APPLID = aPPLID;
	}


	public String getBATCHNO() {
		return BATCHNO;
	}


	public void setBATCHNO(String bATCHNO) {
		BATCHNO = bATCHNO;
	}


	public Integer getCARDSTAT() {
		return CARDSTAT;
	}


	public void setCARDSTAT(Integer cARDSTAT) {
		CARDSTAT = cARDSTAT;
	}


	public Date getCARDPERSONALDATE() {
		return CARDPERSONALDATE;
	}


	public void setCARDPERSONALDATE(Date cARDPERSONALDATE) {
		CARDPERSONALDATE = cARDPERSONALDATE;
	}


	public String getCHIPSERNO() {
		return CHIPSERNO;
	}


	public void setCHIPSERNO(String cHIPSERNO) {
		CHIPSERNO = cHIPSERNO;
	}


	public Date getCARDEXPDATE() {
		return CARDEXPDATE;
	}


	public void setCARDEXPDATE(Date cARDEXPDATE) {
		CARDEXPDATE = cARDEXPDATE;
	}


	public Date getCARDISSUEDATE() {
		return CARDISSUEDATE;
	}


	public void setCARDISSUEDATE(Date cARDISSUEDATE) {
		CARDISSUEDATE = cARDISSUEDATE;
	}


	public String getCOLLKPTNO() {
		return COLLKPTNO;
	}


	public void setCOLLKPTNO(String cOLLKPTNO) {
		COLLKPTNO = cOLLKPTNO;
	}


	public String getUSERID() {
		return USERID;
	}


	public void setUSERID(String uSERID) {
		USERID = uSERID;
	}


	public Date getTIMESTAMP() {
		return TIMESTAMP;
	}


	public void setTIMESTAMP(Date tIMESTAMP) {
		TIMESTAMP = tIMESTAMP;
	}


	public Integer getCARDUPDGRPNO() {
		return CARDUPDGRPNO;
	}


	public void setCARDUPDGRPNO(Integer cARDUPDGRPNO) {
		CARDUPDGRPNO = cARDUPDGRPNO;
	}


	public Integer getCARDSTATUPDREQPROC() {
		return CARDSTATUPDREQPROC;
	}


	public void setCARDSTATUPDREQPROC(Integer cARDSTATUPDREQPROC) {
		CARDSTATUPDREQPROC = cARDSTATUPDREQPROC;
	}


	public String getCARDSTATUPDFLAG() {
		return CARDSTATUPDFLAG;
	}


	public void setCARDSTATUPDFLAG(String cARDSTATUPDFLAG) {
		CARDSTATUPDFLAG = cARDSTATUPDFLAG;
	}


	public String getBRANCHCODE() {
		return BRANCHCODE;
	}


	public void setBRANCHCODE(String bRANCHCODE) {
		BRANCHCODE = bRANCHCODE;
	}


	public String getAGENCYONCHIP() {
		return AGENCYONCHIP;
	}


	public void setAGENCYONCHIP(String aGENCYONCHIP) {
		AGENCYONCHIP = aGENCYONCHIP;
	}


	public Date getCARDDESTROYDATE() {
		return CARDDESTROYDATE;
	}


	public void setCARDDESTROYDATE(Date cARDDESTROYDATE) {
		CARDDESTROYDATE = cARDDESTROYDATE;
	}


	public Date getCARDDISPATCHDATE() {
		return CARDDISPATCHDATE;
	}


	public void setCARDDISPATCHDATE(Date cARDDISPATCHDATE) {
		CARDDISPATCHDATE = cARDDISPATCHDATE;
	}


	public Date getCARDREJECTDATE() {
		return CARDREJECTDATE;
	}


	public void setCARDREJECTDATE(Date cARDREJECTDATE) {
		CARDREJECTDATE = cARDREJECTDATE;
	}


	public String getWSID() {
		return WSID;
	}


	public void setWSID(String wSID) {
		WSID = wSID;
	}


	public String getWRONGBATCHNO() {
		return WRONGBATCHNO;
	}


	public void setWRONGBATCHNO(String wRONGBATCHNO) {
		WRONGBATCHNO = wRONGBATCHNO;
	}


	public String getREPRODUCEFLAG() {
		return REPRODUCEFLAG;
	}


	public void setREPRODUCEFLAG(String rEPRODUCEFLAG) {
		REPRODUCEFLAG = rEPRODUCEFLAG;
	}


	public String getGQDBRANCHCODE() {
		return GQDBRANCHCODE;
	}


	public void setGQDBRANCHCODE(String gQDBRANCHCODE) {
		GQDBRANCHCODE = gQDBRANCHCODE;
	}


	public String getMEPSPANNO() {
		return MEPSPANNO;
	}


	public void setMEPSPANNO(String mEPSPANNO) {
		MEPSPANNO = mEPSPANNO;
	}


	public String getTNGSERNO() {
		return TNGSERNO;
	}


	public void setTNGSERNO(String tNGSERNO) {
		TNGSERNO = tNGSERNO;
	}


	public String getMEPSUPDIND() {
		return MEPSUPDIND;
	}


	public void setMEPSUPDIND(String mEPSUPDIND) {
		MEPSUPDIND = mEPSUPDIND;
	}


	public String getTNGUPDIND() {
		return TNGUPDIND;
	}


	public void setTNGUPDIND(String tNGUPDIND) {
		TNGUPDIND = tNGUPDIND;
	}


	public String getPURSEID() {
		return PURSEID;
	}


	public void setPURSEID(String pURSEID) {
		PURSEID = pURSEID;
	}


	@Override
	public String toString() {
		return "CARD_STATUS [KPTNO=" + KPTNO + ", CARDVERSIONNO=" + CARDVERSIONNO + ", APPLID=" + APPLID + ", BATCHNO="
				+ BATCHNO + ", CARDSTAT=" + CARDSTAT + ", CARDPERSONALDATE=" + CARDPERSONALDATE + ", CHIPSERNO="
				+ CHIPSERNO + ", CARDEXPDATE=" + CARDEXPDATE + ", CARDISSUEDATE=" + CARDISSUEDATE + ", COLLKPTNO="
				+ COLLKPTNO + ", USERID=" + USERID + ", TIMESTAMP=" + TIMESTAMP + ", CARDUPDGRPNO=" + CARDUPDGRPNO
				+ ", CARDSTATUPDREQPROC=" + CARDSTATUPDREQPROC + ", CARDSTATUPDFLAG=" + CARDSTATUPDFLAG
				+ ", BRANCHCODE=" + BRANCHCODE + ", AGENCYONCHIP=" + AGENCYONCHIP + ", CARDDESTROYDATE="
				+ CARDDESTROYDATE + ", CARDDISPATCHDATE=" + CARDDISPATCHDATE + ", CARDREJECTDATE=" + CARDREJECTDATE
				+ ", WSID=" + WSID + ", WRONGBATCHNO=" + WRONGBATCHNO + ", REPRODUCEFLAG=" + REPRODUCEFLAG
				+ ", GQDBRANCHCODE=" + GQDBRANCHCODE + ", MEPSPANNO=" + MEPSPANNO + ", TNGSERNO=" + TNGSERNO
				+ ", MEPSUPDIND=" + MEPSUPDIND + ", TNGUPDIND=" + TNGUPDIND + ", PURSEID=" + PURSEID + "]";
	}
	
	
}
