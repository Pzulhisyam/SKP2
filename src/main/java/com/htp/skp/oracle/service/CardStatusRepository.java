package com.htp.skp.oracle.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.htp.skp.oracle.entity.CARD_STATUS;

@Repository
public interface CardStatusRepository extends JpaRepository<CARD_STATUS, String> {
	String query = "SELECT cs.KPTNO,cs.CARDVERSIONNO,cs.APPLID,cs.BATCHNO,cs.CARDSTAT,cs.CARDPERSONALDATE,cs.CHIPSERNO,cs.CARDEXPDATE,cs.CARDISSUEDATE,cs.COLLKPTNO,cs.USERID,cs.TIMESTAMP,cs.CARDUPDGRPNO,cs.CARDSTATUPDREQPROC,cs.CARDSTATUPDFLAG,cs.BRANCHCODE,cs.AGENCYONCHIP,cs.CARDDESTROYDATE,cs.CARDDISPATCHDATE,cs.CARDREJECTDATE,cs.WSID,cs.WRONGBATCHNO,cs.REPRODUCEFLAG,cs.GQDBRANCHCODE,cs.MEPSPANNO,cs.TNGSERNO,cs.MEPSUPDIND,cs.TNGUPDIND,cs.PURSEID FROM CARD_STATUS cs WHERE cs.APPLID = :applid";

	@Query(value = query, nativeQuery = true)
	List<CARD_STATUS> findAllRecord(String applid);
}
