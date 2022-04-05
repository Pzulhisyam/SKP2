package com.htp.skp.db2.service;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.htp.skp.db2.entity.THEI_EXTRACT_ICSC;
//import com.htp.skp.oracle.entity.APPLICATION;

@Repository
public interface ExtractICSCRepository extends JpaRepository<THEI_EXTRACT_ICSC, String>{
	
	String query = "SELECT a.HEI_APPL_KPTNO, a.HEI_APPL_LEGAPPLID, a.HEI_APPL_DATE, a.HEI_CREATE_DT, a.HEI_RV_IND FROM JPND.THEI_EXTRACT_ICSC a WHERE a.HEI_RV_IND='1'";
	 @Query(value = query, nativeQuery = true)
	 List<THEI_EXTRACT_ICSC> findAllRecord();
	
}
