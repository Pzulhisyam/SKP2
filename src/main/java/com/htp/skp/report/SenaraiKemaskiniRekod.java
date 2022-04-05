package com.htp.skp.report;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.htp.skp.db2.entity.THEI_EXTRACT_ICSC;
import com.htp.skp.db2.service.ExtractICSCRepository;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.util.JRLoader;

public class SenaraiKemaskiniRekod {
	
	private ExtractICSCRepository iscsRepository;

	public String generatePdf(List<THEI_EXTRACT_ICSC> list) throws Exception, JRException {
//		java.util.Vector collection = new java.util.Vector();
		
		
		List<THEI_EXTRACT_ICSC> icscList = new ArrayList<THEI_EXTRACT_ICSC>();

		
//		List<THEI_EXTRACT_ICSC> list = iscsRepository.findAllRecord();

		if (list.size() != 0) {
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i) != null) {
////					APPLICATION app = list.get(i);
					THEI_EXTRACT_ICSC icsc = list.get(i);
////					iscsRepository.save(icsc);
				    icscList.add(icsc); //for excell
				} else {
//					log.info("no beds found");
				}
			}
		}
		
		
		JRBeanCollectionDataSource bean = new JRBeanCollectionDataSource(list);		
		JasperReport compileRpt = JasperCompileManager.compileReport(new FileInputStream("SemakanRekodKemaskiniBulanan.jasper"));
		
		HashMap<String, Object> map = new HashMap<>();
		JasperPrint report = JasperFillManager.fillReport(compileRpt, map, bean);
		JasperExportManager.exportReportToPdfFile(report, "SemakanRekodKemaskiniBulanan.pdf");
		
		
//		collection.add(bean); 
		
		return "generated";
	}

}
