package com.htp.skp.oracle.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

import com.htp.skp.oracle.pk.APPL_TXN_FEE_PK;

@Entity
@IdClass(APPL_TXN_FEE_PK.class)
public class APPL_TXN_FEE {
	@Id private String APPLID;
	@Id private Integer TXNSERNO;
	@Id private String FEETYPE;

	private Integer FEEAMT;
	private Integer AGENCYREVNCODE;
	public APPL_TXN_FEE() {
	}
	
	
	public APPL_TXN_FEE(String aPPLID, Integer tXNSERNO, String fEETYPE, Integer fEEAMT, Integer aGENCYREVNCODE) {
		super();
		APPLID = aPPLID;
		TXNSERNO = tXNSERNO;
		FEETYPE = fEETYPE;
		FEEAMT = fEEAMT;
		AGENCYREVNCODE = aGENCYREVNCODE;
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
	public String getFEETYPE() {
		return FEETYPE;
	}
	public void setFEETYPE(String fEETYPE) {
		FEETYPE = fEETYPE;
	}
	public Integer getFEEAMT() {
		return FEEAMT;
	}
	public void setFEEAMT(Integer fEEAMT) {
		FEEAMT = fEEAMT;
	}
	public Integer getAGENCYREVNCODE() {
		return AGENCYREVNCODE;
	}
	public void setAGENCYREVNCODE(Integer aGENCYREVNCODE) {
		AGENCYREVNCODE = aGENCYREVNCODE;
	}
	@Override
	public String toString() {
		return "APPL_TXN_FEE [APPLID=" + APPLID + ", TXNSERNO=" + TXNSERNO + ", FEETYPE=" + FEETYPE + ", FEEAMT="
				+ FEEAMT + ", AGENCYREVNCODE=" + AGENCYREVNCODE + "]";
	}
	
	
	
	
	
}
