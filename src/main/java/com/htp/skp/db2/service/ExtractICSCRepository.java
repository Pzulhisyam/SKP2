package com.htp.skp.db2.service;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.htp.skp.db2.entity.THEI_EXTRACT_ICSC;

@Repository
public interface ExtractICSCRepository extends JpaRepository<THEI_EXTRACT_ICSC, String>{
	
}
