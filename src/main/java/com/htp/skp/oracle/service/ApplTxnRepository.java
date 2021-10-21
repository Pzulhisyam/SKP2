package com.htp.skp.oracle.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.htp.skp.oracle.entity.APPL_TXN;

@Repository
public interface ApplTxnRepository extends JpaRepository<APPL_TXN, String> {
	String query = "SELECT at2.APPLID, at2.TXNSERNO, at2.TXNCODE, at2.TXNCANCELCODE, at2.LICTYPE, at2.LICCLASS, at2.LICUSAGECODE, at2.LICVALIDPERIOD, at2.PAYMSERNO, at2.QCSERNO, at2.QCFLAG, at2.TXNDATE, at2.LEGUPDFLAG, at2.LEGTXNCODE, at2.PAYMSERNO1 FROM APPL_TXN at2 WHERE at2.APPLID = :applid AND at2.TXNCODE ='403'";

	@Query(value = query, nativeQuery = true)
	List<APPL_TXN> findAllRecord(String applid);
}
