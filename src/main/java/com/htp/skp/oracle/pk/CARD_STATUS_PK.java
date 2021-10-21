package com.htp.skp.oracle.pk;

import java.io.Serializable;

public class CARD_STATUS_PK implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String KPTNO;
	private Integer CARDVERSIONNO;
	public CARD_STATUS_PK() {
		
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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((CARDVERSIONNO == null) ? 0 : CARDVERSIONNO.hashCode());
		result = prime * result + ((KPTNO == null) ? 0 : KPTNO.hashCode());
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
		CARD_STATUS_PK other = (CARD_STATUS_PK) obj;
		if (CARDVERSIONNO == null) {
			if (other.CARDVERSIONNO != null)
				return false;
		} else if (!CARDVERSIONNO.equals(other.CARDVERSIONNO))
			return false;
		if (KPTNO == null) {
			if (other.KPTNO != null)
				return false;
		} else if (!KPTNO.equals(other.KPTNO))
			return false;
		return true;
	}
	
	
}
