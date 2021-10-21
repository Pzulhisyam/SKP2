package com.htp.skp.oracle.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

import com.htp.skp.oracle.pk.APPL_FEE_REDUCTION_PK;

@Entity
@IdClass(APPL_FEE_REDUCTION_PK.class)
public class APPL_FEE_REDUCTION {
		@Id private String APPLID;
		@Id private Integer TXNSERNO;
		@Id private String FEETYPE;
		
		private Integer ORIGFEEAMT;
		private Integer FEEAMT;
		private Integer AGENCYREVNCODE;
		private String REDUCTIONTYPE;
		
		public APPL_FEE_REDUCTION() {
			
		}
		
		

		public APPL_FEE_REDUCTION(String aPPLID, Integer tXNSERNO, String fEETYPE, Integer oRIGFEEAMT, Integer fEEAMT,
				Integer aGENCYREVNCODE, String rEDUCTIONTYPE) {
			super();
			APPLID = aPPLID;
			TXNSERNO = tXNSERNO;
			FEETYPE = fEETYPE;
			ORIGFEEAMT = oRIGFEEAMT;
			FEEAMT = fEEAMT;
			AGENCYREVNCODE = aGENCYREVNCODE;
			REDUCTIONTYPE = rEDUCTIONTYPE;
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

		public Integer getORIGFEEAMT() {
			return ORIGFEEAMT;
		}

		public void setORIGFEEAMT(Integer oRIGFEEAMT) {
			ORIGFEEAMT = oRIGFEEAMT;
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

		public String getREDUCTIONTYPE() {
			return REDUCTIONTYPE;
		}

		public void setREDUCTIONTYPE(String rEDUCTIONTYPE) {
			REDUCTIONTYPE = rEDUCTIONTYPE;
		}



		@Override
		public String toString() {
			return "APPL_FEE_REDUCTION [APPLID=" + APPLID + ", TXNSERNO=" + TXNSERNO + ", FEETYPE=" + FEETYPE
					+ ", ORIGFEEAMT=" + ORIGFEEAMT + ", FEEAMT=" + FEEAMT + ", AGENCYREVNCODE=" + AGENCYREVNCODE
					+ ", REDUCTIONTYPE=" + REDUCTIONTYPE + "]";
		}
		
		
		
}
