package com.htp.skp.oracle.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.htp.skp.oracle.entity.APPL_TXN_FEE;


@Repository
public interface ApplTxnFeeRepository extends JpaRepository<APPL_TXN_FEE, String>{
	String query = "SELECT atf.APPLID, atf.TXNSERNO, atf.FEETYPE, atf.FEEAMT, atf.AGENCYREVNCODE FROM APPL_TXN_FEE atf WHERE atf.APPLID = :applid AND atf.FEETYPE ='CF' AND AGENCYREVNCODE IN ('8010080','8010081','8010082','8010083','8020120','8020121','8020122','8020123')";

	@Query(value = query, nativeQuery = true)
	List<APPL_TXN_FEE> findAllRecord(String applid);
}
