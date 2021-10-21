package com.htp.skp.oracle.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.htp.skp.oracle.entity.APPNT_JPN_INFO;


@Repository
public interface AppntJpnInfoRepository extends JpaRepository<APPNT_JPN_INFO, String> {
	String query = "SELECT aji.APPLID, aji.KPTNO, aji.KPPNO, aji.GENDER, aji.BIRTHDATE, aji.UNKNOWNBIRTHIND, aji.RELIGIONCODE, aji.RACECODE, aji.CITIZENSHIPSTATCODE, aji.HKIND, aji.ORIGNAME, aji.CURRLONGNAME, aji.CURRSHORTNAME1, aji.CURRSHORTNAME2, aji.GMPCSHORTNAME1, aji.GMPCSHORTNAME2, aji.GMPCSHORTNAME3, aji.ADDRESS1, aji.ADDRESS2, aji.ADDRESS3, aji.POSTCODE, aji.CITYCODE, aji.STATECODE, aji.JPNREMARKS1, aji.JPNREMARKS2, aji.IDTYPE, aji.IDNO, aji.BIRTHPLACE, aji.HSCCOLORCODE, aji.RESTRICRESIDCODE, aji.RJIND, aji.COUNTRYOFORIGIN, aji.APPNTREMARKS, aji.SUPVRNOTES, aji.INVSERVICEFLAG, aji.RESIDENTSTAT, aji.PERSONSTATCODE, aji.LASTADDCHANGEDATE, aji.AFISFLAG, aji.CARDLOSTCNT, aji.LASTKPTISSUEDDATE, aji.KPTAPPLSTAT, aji.KTINDCODE, aji.POLMILITARYJOINDATE, aji.RETIREMENTDATE, aji.ORIGNAMEIND, aji.CITIZENNATIONCODE, aji.APPLAPPROVALDATE, aji.GREENCARDEXPDATE, aji.IMMREFNO, aji.IMMREFDATE, aji.IMMEXPDATE, aji.PASSPORTNO, aji.PASSPORTISSUEDDATE, aji.PASSPORTISSUECOUNTRY, aji.RJSTARTDATE, aji.RJENDDATE, aji.KTSTARTDATE, aji.KTENDDATE, aji.JKIND, aji.BLKLSTCODE, aji.AFISBYPASS, aji.PERMITNO, aji.PERMITISSUEDATE, aji.PERMITTYPE, aji.PRDOCTYPE, aji.LOSTCNTNEG, aji.LOSTCNTCRIME, aji.LOSTCNTDIS, aji.KTAREACODE, aji.APJAREACODE FROM APPNT_JPN_INFO aji WHERE aji.APPLID = :applid";

	@Query(value = query, nativeQuery = true)
	List<APPNT_JPN_INFO> findAllRecord(String applid);
}
