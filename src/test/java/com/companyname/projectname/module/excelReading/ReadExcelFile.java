package com.companyname.projectname.module.excelReading;

public class ReadExcelFile {

	public static void main(String[] args) {
		
		//ExcelReader excel = new ExcelReader("D:\\BYMAT_Automation\\WorkSpace\\OnlineTraining\\SeleniumTraining_B15_MVN\\src\\test\\resources\\testData\\Master_sheet.xlsx");
		ExcelReader excel = new ExcelReader(System.getProperty("user.dir")+"\\src\\test\\resources\\testData\\Master_sheet.xlsx");
		
		//excel.addSheet("Test_Sheet");
		
	//	excel.addColumn("Test_Data", "PINCode");
		
		
		System.out.println(excel.getColumnCount("Test_Data"));
		
		System.out.println(excel.getRowCount("Test_Data"));
		
		
	System.out.println(	excel.getCellData("Test_Data", "Email_Address", 3));
	
	excel.setCellData("Test_Data", "PINCode", 2, "453674");
		
	}

}
