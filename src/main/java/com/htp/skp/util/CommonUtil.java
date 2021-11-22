package com.htp.skp.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.YearMonth;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.stream.Collectors;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import org.json.simple.parser.JSONParser;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.htp.skp.Skp20Application;
import com.htp.skp.constant.Constant;
import com.htp.skp.db2.entity.THEI_EXTRACT_ICSC;
import com.htp.skp.oracle.entity.APPLICATION;

public class CommonUtil {

	static String globalJsonString = "";

	public static String devideRemarks(String remarksVal, Boolean remarks1) {
		String str = "";
		if (remarksVal != null && !"".equalsIgnoreCase(remarksVal)) {
			if (remarks1) {
				str = remarksVal.substring(0, 59);
			} else {
				if (remarksVal.length() <= 120) {
					str = remarksVal.substring(59, remarksVal.length()-1);
				} else {
					str = remarksVal.substring(59, 118);
				}
			}
		}
		

		return str;
	}
	
	public static Boolean checkLength(APPLICATION app, THEI_EXTRACT_ICSC icsc, String remarksVal) {
		if(remarksVal.length() > 60) {
			String appid= app.getAPPLID();
			String icscid = icsc.getHEI_APPL_LEGAPPLID();
			printOut(" APPID : "+appid+" HEI_APPL_LEGAPPLID : "+icscid+" HEI_PR_ACTRMK1 : "+remarksVal+" length : "+remarksVal.length());
			return false;
		}else {
			return true;
		}
	}

	public static String getDate(String temp) {
		String value = "";
		SimpleDateFormat formatter2 = new SimpleDateFormat("YYYY/MM");
		String woDate = formatter2.format(new Date());

		LocalDate now = LocalDate.now();
		YearMonth yearMonthObject = YearMonth.of(now.getYear(), now.getMonthValue());
		int day = yearMonthObject.lengthOfMonth();

		if (temp.equalsIgnoreCase("startDate")) {
			value = woDate + "/01";
		} else if (temp.equalsIgnoreCase("endDate")) {
			value = woDate + "/" + String.valueOf(day);
		}
		return value;
	}

	public static String reformatDate(String dateStr) {
		// 20210201
		String year = dateStr.substring(0, 4);
		String month = dateStr.substring(4, 6);
		String day = dateStr.substring(6, 8);

		return year + "/" + month + "/" + day;
	}

	public static String changeDateFormat(Date dateStr, String format) {
		SimpleDateFormat formatter2 = new SimpleDateFormat(format);
		String woDate = formatter2.format(dateStr);
		return woDate;
	}

	public static Date changeDateFormatNew(Date date, String format) {
		SimpleDateFormat formatter2 = new SimpleDateFormat(format);
		String woDate = formatter2.format(date);
		java.sql.Date d = java.sql.Date.valueOf(woDate);
		return d;
	}

	public static String formatStringDate(String dateStr, String format) {

		try {
			Date date1;
			date1 = new SimpleDateFormat(format).parse(dateStr);

			String sDate1 = changeDateFormat(date1, format);

			return sDate1;
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}
	}

	public static Date getCurrentDate() {
		LocalDate now = LocalDate.now();
		Date date = java.sql.Date.valueOf(now);
		return date;
	}

	public static String getCurrentDateString() {
		LocalDate now = LocalDate.now();
		Date date = java.sql.Date.valueOf(now);

		return date.toString();
	}

	public static long performanceTest() {
		long startTime = System.currentTimeMillis();

		// run your code here

		long stopTime = System.currentTimeMillis();
		long runTime = stopTime - startTime;
		System.out.println("Run time: " + runTime);

		return runTime;
	}

	@SuppressWarnings("unchecked")
	public static String generateJsonForOutputFileNew(List<APPLICATION> applList, List<THEI_EXTRACT_ICSC> icscList,
			float runTime) {

		JSONParser jsonParser = new JSONParser();
		List<APPLICATION> listApplication = applList;
		List<THEI_EXTRACT_ICSC> listICSC = icscList;
		JSONObject mainJsonObject = new JSONObject();
		try {

			File tempFile = new File(Constant.JsonLogFilePath);
			if (!tempFile.exists()) {
				JSONObject json = new JSONObject();
				FileWriter file = new FileWriter(Constant.JsonLogFilePath, false);
				String strJson = json.toString();
				file.write(strJson);

				file.flush();
				file.close();
			}

			// to get from file path
			Object obj = jsonParser.parse(new FileReader(Constant.JsonLogFilePath));
			JSONObject ja = (JSONObject) obj;

			JSONObject joExtract = new JSONObject();
			joExtract.put("Record extract timestamp (seconds)", runTime);
			joExtract.put("Record extract list size from oracle", listApplication.size());
			JSONArray arrayExtract = new JSONArray();
			JSONObject joApplication;
			for (int i = 0; i < applList.size(); i++) {
				APPLICATION app = applList.get(i);

				joApplication = new JSONObject();
				joApplication.put("APPLID", app.getAPPLID());
				joApplication.put("KPTNO", app.getKPTNO());

				arrayExtract.add(joApplication);
			}
			joExtract.put("List ", arrayExtract);

			JSONObject joInsert = new JSONObject();
			joInsert.put("Record extract timestamp (seconds)", runTime);
			joInsert.put("Record extract list size from oracle", listApplication.size());
			JSONArray arrayInsert = new JSONArray();
			JSONObject joICSC;
			for (int i = 0; i < listICSC.size(); i++) {

				THEI_EXTRACT_ICSC icsc = listICSC.get(i);

				joICSC = new JSONObject();
				joICSC.put("TEI_APPL_LEGAPPLID", icsc.getHEI_APPL_LEGAPPLID());
				joICSC.put("TEI_APPL_KPTNO", icsc.getHEI_APPL_KPTNO());

				arrayInsert.add(joICSC);
			}
			joInsert.put("List ", arrayInsert);

			mainJsonObject.put("ora", joExtract);
			mainJsonObject.put("db2", joInsert);
			ja.put(new Date(), mainJsonObject);

			// to append
			FileWriter file2 = new FileWriter(Constant.JsonLogFilePath);
			file2.write(ja.toJSONString());
			file2.flush();
			file2.close();

		} catch (org.json.simple.parser.ParseException | IOException e) {
			e.printStackTrace();
		}
		return "";
	}

	public static boolean checkIfFileExist(String path) {
		File tempFile = new File(path);
		if (tempFile.exists()) {
			return true;
		} else {
			return false;
		}
	}

	public static void getJsonFromFilePath(String path, org.json.simple.JSONArray jsonArray) {
		try {
			FileWriter file = new FileWriter(path);
			file.write(jsonArray.toJSONString());
			file.flush();
			file.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static String generateJsonString(float runTime) {
		String val = "";
		val = "Record insert timestamp: " + runTime;
		val += "\nRecord insert list size from db2" + 7;
		return val;
	}

	public static void printOut(Object val) {
		String callerClassName = new Exception().getStackTrace()[1].getClassName();// fairly expensive task

		int index = 0;
		for (int i = 0; i < callerClassName.length(); i++) {
			if (callerClassName.charAt(i) == '.') {
				index = i;
			}
		}

		callerClassName = callerClassName.substring(index + 1);

		int lineNumber = Thread.currentThread().getStackTrace()[2].getLineNumber();
		System.out.println(callerClassName + "[Lines:" + lineNumber + "] myTrace :" + val);
	}

	public static void generateJsonObjExcel(List<THEI_EXTRACT_ICSC> icscListTemp) throws IOException {
		try {

			File file = new File(Constant.ExcelLogFilePath);

			FileOutputStream out = new FileOutputStream(file);
			XSSFWorkbook workbook = new XSSFWorkbook();
			XSSFSheet sheet = workbook.createSheet("ICSC Data");

			List<String> l1 = new ArrayList<String>();
			List<List<String>> list = new ArrayList<List<String>>();
			list.add(generateHeader());

			List<THEI_EXTRACT_ICSC> icscList = icscListTemp;
			for (THEI_EXTRACT_ICSC icsc : icscList) {
				THEI_EXTRACT_ICSC tempIcsc = new THEI_EXTRACT_ICSC();
				tempIcsc = icsc;

				l1 = new ArrayList<String>();
				l1.add(changeDateFormat(new Date(), Constant.dateStandard));
				l1.add(tempIcsc.getHEI_APPL_LEGAPPLID());
				l1.add(tempIcsc.getHEI_APPL_KPTNO());
				l1.add(tempIcsc.getHEI_APPL_APPLSTAT());
				l1.add(formatStringDate(tempIcsc.getHEI_APPL_DATE(), Constant.dateStandardNew));
				l1.add(tempIcsc.getHEI_APPL_USERID());
				l1.add(String.valueOf(tempIcsc.getHEI_APPL_COLLCTR()));
				l1.add(tempIcsc.getHEI_APPL_COLLKPTNO());
				l1.add(tempIcsc.getHEI_APPL_IDTYPE());
				l1.add(tempIcsc.getHEI_APPL_RLTNCD());
				l1.add(String.valueOf(tempIcsc.getHEI_APPLTF_FEEAMT()));
				l1.add(tempIcsc.getHEI_APPLFR_RTYPE());
				l1.add(tempIcsc.getHEI_APPLTXN_TXNCD());
				l1.add(tempIcsc.getHEI_APPLTXN_LICCLASS());
				l1.add(String.valueOf(tempIcsc.getHEI_APPLFR_FEEAMT()));
				l1.add(String.valueOf(tempIcsc.getHEI_CS_CARDVERNO()));
				l1.add(tempIcsc.getHEI_CS_USERID());
				l1.add(tempIcsc.getHEI_APPLHIS_USERID());
				l1.add(String.valueOf(tempIcsc.getHEI_AJI_LCCRIME()));
				l1.add(String.valueOf(tempIcsc.getHEI_AJI_LCTDIS()));
				l1.add(String.valueOf(tempIcsc.getHEI_AJI_LCNEG()));
				l1.add(String.valueOf(tempIcsc.getHEI_AJI_CLCNT()));
				l1.add(getCurrentDateString());
				l1.add(tempIcsc.getHEI_RV_IND());
				l1.add(tempIcsc.getHEI_PR_ACTRMK1());
				l1.add(tempIcsc.getHEI_PR_ACTRMK2());

				list.add(l1);

			}

			Iterator<List<String>> i = list.iterator();
			int rownum = 0;
			int cellnum = 0;
			while (i.hasNext()) {
				List<String> templist = (List<String>) i.next();
				Iterator<String> tempIterator = templist.iterator();
				Row row = sheet.createRow(rownum++);
				cellnum = 0;
				while (tempIterator.hasNext()) {
					String temp = (String) tempIterator.next();
					Cell cell = row.createCell(cellnum++);
					cell.setCellValue(temp);

				}

			}
			workbook.write(out);
			out.close();
			workbook.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private static List<String> generateHeader() {
		List<String> header = new ArrayList<String>();
		header.add("Current Date");
		header.add("TEI_APPL_LEGAPPLID");
		header.add("TEI_APPL_KPTNO");
		header.add("TEI_APPL_APPLSTAT");
		header.add("TEI_APPL_DATE");
		header.add("TEI_APPL_USERID");
		header.add("TEI_APPL_COLLCTR");
		header.add("TEI_APPL_COLLKPTNO");
		header.add("TEI_APPL_IDTYPE");
		header.add("TEI_APPL_RLTNCD");
		header.add("TEI_APPLTF_FEEAMT");
		header.add("TEI_APPLFR_RTYPE");
		header.add("TEI_APPLTXN_TXNCD");
		header.add("TEI_APPLTXN_LICCLASS");
		header.add("TEI_APPLFR_FEEAMT");
		header.add("TEI_CS_CARDVERNO");
		header.add("TEI_CS_USERID");
		header.add("TEI_APPLHIS_USERID");
		header.add("TEI_AJI_LCCRIME");
		header.add("TEI_AJI_LCTDIS");
		header.add("TEI_AJI_LCNEG");
		header.add("TEI_AJI_CLCNT");
		header.add("TEI_CREATE_DT");
		header.add("TEI_PR_ACTRMK1");
		header.add("TEI_PR_ACTRMK2");
		return header;
	}

	// stfu
	public static void logFile() {
		boolean append = false;
		try {
			Logger logger = Logger.getLogger("MyLog");
			FileHandler fh;

			if (!checkIfFileExist(Constant.LogFilePath)) {
				fh = new FileHandler(Constant.LogFilePath, append);
				logger.addHandler(fh);
				SimpleFormatter formatter = new SimpleFormatter();
				fh.setFormatter(formatter);
			}

			logger.info("This is log\n" + generateJsonString(Float.parseFloat("0.980")));
			logger.info("This is log 2\n" + generateJsonString(Float.parseFloat("0.980")));

		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public static boolean configAuthentication() throws IOException {
		InputStream inputStream = new FileInputStream(new File("C:/auth/auth.properties"));
		InputStream input = Skp20Application.class.getClassLoader().getResourceAsStream("config.properties");
		

		OutputStream output = new FileOutputStream(
				new File(CommonUtil.getCurrentDirectory()+"/src/main/resources/application.properties"));

		try {
			Properties data = new Properties();
			Properties data2 = new Properties();

			data2.load(inputStream);
			String username = data2.getProperty("db2.username");
			String password = data2.getProperty("db2.password");
			printOut(username + "\n" + password);

			data.load(input);
			data.setProperty("spring.datasource.db.username", username);
			data.setProperty("spring.datasource.db.password", password);
			data.store(output, null);
			
			try (BufferedReader reader = new BufferedReader(new InputStreamReader(input))) {
				String contents = reader.lines().collect(Collectors.joining(System.lineSeparator()));
				System.out.print(contents);
			} catch (Exception e) {
				e.printStackTrace();
			}

		} catch (Exception e) {
			printOut("Properties auth.properties not found\n" + "File Path : " + "C:/auth/auth.properties");
			printOut("Properties config.properties not found\n" + "File Path : /src/main/resources/config.properties");
			printOut("Properties application.properties not found\n " + "File Path : " + CommonUtil.getCurrentDirectory()
					+ "/src/main/resources/application.properties");
			System.err.println("Error: " + e.getMessage());

			return false;
		} finally {
			inputStream.close();
			output.close();
			input.close();
		}

		return true;
	}

	public static String getCurrentUser() {
		try {
			Properties data = new Properties();
			InputStream inputStream = new FileInputStream(
					new File("C:/OracleConn/SKP20/src/main/resources/application.properties"));
			data.load(inputStream);
			String username = data.getProperty("spring.datasource.db.username");
			String password = data.getProperty("spring.datasource.db.password");

			return username + "\n" + password;
		} catch (IOException ioe) {
			ioe.printStackTrace();
			return "";
		}

	}

	public static String getCurrentDirectory() {
		return System.getProperty("user.dir");
	}

}
