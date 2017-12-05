package com.lava.createmomentforcolorsequence;


import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import java.io.InputStream;
import java.lang.reflect.Method;


/**
 * Created by Dewesh Yadav on 3/14/2017.
 */
public class ColorSequenceDataProvider {


  @DataProvider(name = "colorSequence")
  public static Object[][] popUpData(Method m) throws Exception {

    String fileName = "Data.xlsx";
    int sheetName = 1;
    Object[][] arrayObject = fetchDataFromSecondRow(fileName, sheetName);
    Object[][] arrayObject1 = null;

    if (m.getName().equalsIgnoreCase("dragAndDropTrigger")) {
      arrayObject1 = new Object[][]{{arrayObject[0][0], arrayObject[0][1]}};
    }
    if (m.getName().equalsIgnoreCase("dragAndDropProfiles")) {
      arrayObject1 = new Object[][]{{arrayObject[0][2], arrayObject[0][3]}};
    }
    if (m.getName().equalsIgnoreCase("dragAndDropQualifiers")) {
      arrayObject1 = new Object[][]{{arrayObject[0][4], arrayObject[0][5]}};
    }
    if (m.getName().equalsIgnoreCase("chooseColorSequence")) {
      arrayObject1 = new Object[][]{{arrayObject[0][6], arrayObject[0][7], arrayObject[0][8], arrayObject[0][9]}};
    }
    if (m.getName().equalsIgnoreCase("dragAndDropEngagments")) {
      arrayObject1 = new Object[][]{{arrayObject[0][10], arrayObject[0][11]}};
    }

    System.out.println(arrayObject1);

    return arrayObject1;

  }


  public static String[][] fetchDataFromSecondRow(String fileName, int sheetName) throws Exception {

    InputStream fis = ColorSequenceDataProvider.class.getClassLoader().getResourceAsStream(fileName);

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

