package com.htp.skp.oracle.service;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.htp.skp.oracle.entity.APPL_HISTORY;


@Repository
public interface ApplHistoryRepository extends JpaRepository<APPL_HISTORY, String> {
	String query = "SELECT APPLID, PROCSERNO, APPLDATE, APPLSTAT, KPTNO, CURRLONGNAME, APPLCANCELCODE, APPLCANCELDATE, BRANCHCODE, USERID, WSID, TIMESTAMP FROM GSCB.APPL_HISTORY ah WHERE ah.APPLID = :applid AND ah.APPLSTAT ='T'";

	@Query(value = query, nativeQuery = true)
	List<APPL_HISTORY> findAllRecord(String applid);
}
