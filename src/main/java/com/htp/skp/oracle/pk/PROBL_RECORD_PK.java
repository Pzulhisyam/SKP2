package com.htp.skp.oracle.pk;

import java.io.Serializable;


public class PROBL_RECORD_PK implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String APPLID;
	private Integer PROBLNO;
	public PROBL_RECORD_PK() {
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((APPLID == null) ? 0 : APPLID.hashCode());
		result = prime * result + ((PROBLNO == null) ? 0 : PROBLNO.hashCode());
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
		PROBL_RECORD_PK other = (PROBL_RECORD_PK) obj;
		if (APPLID == null) {
			if (other.APPLID != null)
				return false;
		} else if (!APPLID.equals(other.APPLID))
			return false;
		if (PROBLNO == null) {
			if (other.PROBLNO != null)
				return false;
		} else if (!PROBLNO.equals(other.PROBLNO))
			return false;
		return true;
	}
	
	
}
