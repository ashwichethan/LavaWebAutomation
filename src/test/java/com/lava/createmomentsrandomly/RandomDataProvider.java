package com.lava.createmomentsrandomly;


import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import java.io.InputStream;


/**
 * Created by Dewesh Yadav on 3/14/2017.
 */
public class RandomDataProvider {

    @DataProvider(name = "random")
    public static Object[][] momentsData() throws Exception {

        String fileName = "Data.xlsx";
        int sheetName = 3;

        Object[][] arrayObject = fetchDataFromSecondRow(fileName, sheetName);
        System.out.println(arrayObject);

        return arrayObject;

    }


    public static String[][] fetchDataFromSecondRow(String fileName, int sheetName) throws Exception {

        InputStream fis = RandomDataProvider.class.getClassLoader().getResourceAsStream(fileName);

        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sh = workbook.getSheetAt(sheetName);

        int totalNoOfCols = sh.getRow(0).getPhysicalNumberOfCells();
        int rowNum = sh.getLastRowNum() - sh.getFirstRowNum();

        String[][] arrayExcelData = new String[rowNum][totalNoOfCols];
        int rowCount = 1;
        for (int firstArrayIndex = 0; firstArrayIndex < rowNum; firstArrayIndex++) {
            if (firstArrayIndex >= 1) {
                rowCount++;
            }
            for (int secondArrayIndex = 0; secondArrayIndex < totalNoOfCols; secondArrayIndex++) {
                arrayExcelData[firstArrayIndex][secondArrayIndex] = sh.getRow(rowCount).getCell(secondArrayIndex).getStringCellValue();
            }
        }
        return arrayExcelData;
    }

}

