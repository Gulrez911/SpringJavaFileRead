package com.gul.test;

import java.io.File;

import jxl.Sheet;
import jxl.Workbook;
 

public class ReadExcel {
	private void readExcelSheet(String destFile){ 
	      File excelSheet = null;
	      Workbook workbook = null;    
	           
	        try {

	             Workbook wb = Workbook.getWorkbook(new File(destFile));
	             System.out.println(wb.getNumberOfSheets());
	                for(int sheetNo=0; sheetNo<wb.getNumberOfSheets();sheetNo++)
	                {                
	                  Sheet sheet = wb.getSheet(sheetNo);
	                  int columns = sheet.getColumns();
	                  System.out.println("No. of Columns: >>>>>> "+columns);
	                  int rows = sheet.getRows();
	                  String data;
	                  System.out.println("Sheet Name\t"+wb.getSheet(sheetNo).getName());
	                          for(int row = 0;row < rows;row++) {
	                              for(int col = 0;col < columns;col++) {
	                            	  if(sheet.getCell(col,row).getContents().equalsIgnoreCase("Observed Volume")) {
	                            		  System.out.println("Found: .............................................                 "+sheet.getCell(col,row).getContents());
	                            	  }
	                               data = sheet.getCell(col, row).getContents();
	                              System.out.print(data+ " ");
	                            
	                          }                          
	                          System.out.println("\n");
	                      }
	                      }
	                  } catch(Exception ioe) {
	                       ioe.printStackTrace();
	                  }
	             
	          }

	public static void main(String arg[]) {
		ReadExcel excel = new ReadExcel();
//		excel.readExcelSheet("C:/Users/gulfa/Desktop/Employee2.xls");
		excel.readExcelSheet("C:/Users/gulfa/Downloads/Handy-Kingfisher-V1 (1).xls");
	}
}
