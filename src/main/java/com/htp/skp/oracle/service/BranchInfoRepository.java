package com.htp.skp.oracle.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.htp.skp.oracle.entity.BRANCH_INFO;


@Repository
public interface BranchInfoRepository extends JpaRepository<BRANCH_INFO, String> {

}
