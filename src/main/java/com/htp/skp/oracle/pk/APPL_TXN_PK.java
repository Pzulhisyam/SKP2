package com.htp.skp.oracle.pk;

import java.io.Serializable;

public class APPL_TXN_PK implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String APPLID;
	private Integer TXNSERNO;
	public APPL_TXN_PK() {
		
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((APPLID == null) ? 0 : APPLID.hashCode());
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
		APPL_TXN_PK other = (APPL_TXN_PK) obj;
		if (APPLID == null) {
			if (other.APPLID != null)
				return false;
		} else if (!APPLID.equals(other.APPLID))
			return false;
		if (TXNSERNO == null) {
			if (other.TXNSERNO != null)
				return false;
		} else if (!TXNSERNO.equals(other.TXNSERNO))
			return false;
		return true;
	}
	
	
}
