package com.htp.skp.oracle.pk;

import java.io.Serializable;


public class APPL_TXN_FEE_PK  implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String APPLID;
	private Integer TXNSERNO;
	private String FEETYPE;

	public APPL_TXN_FEE_PK() {
		
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


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((APPLID == null) ? 0 : APPLID.hashCode());
		result = prime * result + ((FEETYPE == null) ? 0 : FEETYPE.hashCode());
		result = prime * result + ((TXNSERNO == null) ? 0 : TXNSERNO.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		APPL_TXN_FEE_PK other = (APPL_TXN_FEE_PK) obj;
		if (APPLID == null) {
			if (other.APPLID != null)
				return false;
		} else if (!APPLID.equals(other.APPLID))
			return false;
		if (FEETYPE == null) {
			if (other.FEETYPE != null)
				return false;
		} else if (!FEETYPE.equals(other.FEETYPE))
			return false;
		if (TXNSERNO == null) {
			if (other.TXNSERNO != null)
				return false;
		} else if (!TXNSERNO.equals(other.TXNSERNO))
			return false;
		return true;
	}
	
	
}
