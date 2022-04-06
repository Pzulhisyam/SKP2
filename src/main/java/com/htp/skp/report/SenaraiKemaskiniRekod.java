package com.htp.skp.report;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.stereotype.Component;

import com.htp.skp.db2.entity.THEI_EXTRACT_ICSC;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.util.JRSaver;

@Component
public class SenaraiKemaskiniRekod {
	
	   private String reportFileName;
	   
	   private JasperReport jasperReport;

	   private JasperPrint jasperPrint;

	    private Map<String, Object> parameters;

	    public void SimpleReportFiller() {
	        parameters = new HashMap<>();
	    }
	   
	    public void compileReport() {
	        try {
	            InputStream reportStream = getClass().getResourceAsStream("/".concat(reportFileName));
	            jasperReport = JasperCompileManager.compileReport(reportStream);
	            JRSaver.saveObject(jasperReport, reportFileName.replace(".jrxml", ".jasper"));
	        } catch (JRException ex) {
	            Logger.getLogger(SenaraiKemaskiniRekod.class.getName()).log(Level.SEVERE, null, ex);
	        }
	    }
	
	    public void fillReport(List<THEI_EXTRACT_ICSC> icsc) {
	        try {
	            JRBeanCollectionDataSource icscData = new JRBeanCollectionDataSource(icsc);
	            jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, icscData);
	        } catch (JRException ex) {
	            Logger.getLogger(SenaraiKemaskiniRekod.class.getName()).log(Level.SEVERE, null, ex);
	        }
	    }

	    public Map<String, Object> getParameters() {
	        return parameters;
	    }

	    public void setParameters(Map<String, Object> parameters) {
	        this.parameters = parameters;
	    }

	    public String getReportFileName() {
	        return reportFileName;
	    }

	    public void setReportFileName(String reportFileName) {
	        this.reportFileName = reportFileName;
	    }

	    public JasperPrint getJasperPrint() {
	        return jasperPrint;
	    }


}
