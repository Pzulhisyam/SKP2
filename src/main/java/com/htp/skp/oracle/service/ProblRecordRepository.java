package com.htp.skp.oracle.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.htp.skp.oracle.entity.PROBL_RECORD;

@Repository
public interface ProblRecordRepository extends JpaRepository<PROBL_RECORD, String> {
	String query = "SELECT pr.APPLID, pr.PROBLNO, pr.IDTYPE, pr.IDNO, pr.PROBLDATE, pr.PROBLREASONCODE, pr.PROBLSERNO, pr.PROBLSTAT, pr.PROBLREMARKS, pr.PROBLSOLVEDATE, pr.USERID, pr.WSID, pr.ACTDATETIME, pr.ACTREMARKS, pr.ACTUSERID, pr.BRANCHCODE, pr.TXNCODE, pr.LEGACYTYPE, pr.GSCBUPDFLAG, pr.ENQFLAG, pr.GENKPT, pr.BSKRECD, pr.GUSER1, pr.GUSER1TIMESTAMP, pr.GUSER2, pr.GUSER2TIMESTAMP FROM PROBL_RECORD pr WHERE pr.APPLID = :applid";

	@Query(value = query, nativeQuery = true)
	List<PROBL_RECORD> findAllRecord(String applid);
}
