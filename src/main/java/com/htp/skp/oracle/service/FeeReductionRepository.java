package com.htp.skp.oracle.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.htp.skp.oracle.entity.APPL_FEE_REDUCTION;

@Repository
public interface FeeReductionRepository extends JpaRepository<APPL_FEE_REDUCTION, String> {
	String query = "SELECT app.APPLID, app.TXNSERNO, app.FEETYPE, app.ORIGFEEAMT, app.FEEAMT, app.AGENCYREVNCODE, app.REDUCTIONTYPE FROM APPL_FEE_REDUCTION app WHERE app.APPLID = :applid AND app.ORIGFEEAMT IS NOT NULL ";

	@Query(value = query, nativeQuery = true)
	List<APPL_FEE_REDUCTION> findAllRecord(String applid);

}
