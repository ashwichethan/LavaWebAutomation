package com.lava.CreateMomentPage;


import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import java.io.*;


/**
 * Created by jenkins on 3/14/2017.
 */
public class momentsDataProvider {

  @DataProvider(name = "area")
  public static Object[][] momentsData() throws Exception{

    String fileName = "Data.xlsx";
    int sheetName=0;

    Object[][] arrayObject = fetchDataFromSecondRow(fileName,sheetName);
    System.out.println(arrayObject);

    return arrayObject;

  }

  @DataProvider(name = "colorSequence")
  public static Object[][] popUpData() throws Exception{

    String fileName = "Data.xlsx";
    int sheetName=1;

    Object[][] arrayObject = fetchDataFromSecondRow(fileName,sheetName);
    System.out.println(arrayObject);

    return arrayObject;

  }



  public static String[][] fetchDataFromSecondRow(String fileName, int sheetName) throws Exception {

    InputStream fis = momentsDataProvider.class.getClassLoader().getResourceAsStream(fileName);

    XSSFWorkbook workbook = new XSSFWorkbook(fis);
    XSSFSheet sh = workbook.getSheetAt(sheetName);

    int totalNoOfCols = sh.getRow(0).getPhysicalNumberOfCells();
    int rowNum = sh.getLastRowNum() - sh.getFirstRowNum();

    String[][] arrayExcelData = new String[rowNum][totalNoOfCols];
    Row row = sh.getRow(rowNum);

    for (int i = 0; i < rowNum; i++) {
      for (int j = 0; j < totalNoOfCols; j++) {
        arrayExcelData[i][j] = row.getCell(j).toString();
      }

    }

    return arrayExcelData;
  }

}

