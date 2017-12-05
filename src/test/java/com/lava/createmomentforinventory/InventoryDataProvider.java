package com.lava.createmomentforinventory;


import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import java.io.InputStream;
import java.lang.reflect.Method;


/**
 * Created by Dewesh Yadav on 3/14/2017.
 */
public class InventoryDataProvider {

    @DataProvider(name = "Inventory")
    public static Object[][] momentsData(Method m) throws Exception {

        String fileName = "Data.xlsx";
        int sheetName = 2;

        Object[][] arrayObject = fetchDataFromSecondRow(fileName, sheetName);
        Object[][] arrayObject1 = null;

        if (m.getName().equalsIgnoreCase("dragAndDropTrigger")) {
            arrayObject1 = new Object[][]{{arrayObject[0][0], arrayObject[0][1], arrayObject[0][2], arrayObject[0][3], arrayObject[0][4], arrayObject[0][5], arrayObject[0][6]}};
        }
        if (m.getName().equalsIgnoreCase("dragAndDropProfiles")) {
            arrayObject1 = new Object[][]{{arrayObject[0][7], arrayObject[0][8]}};
        }
        if (m.getName().equalsIgnoreCase("dragAndDropQualifiers")) {
            arrayObject1 = new Object[][]{{arrayObject[0][9], arrayObject[0][10]}};
        }
        if (m.getName().equalsIgnoreCase("dragAndDropEngagments")) {
            arrayObject1 = new Object[][]{{arrayObject[0][11], arrayObject[0][12]}};
        }

        System.out.println(arrayObject1);

        return arrayObject1;
    }


    public static String[][] fetchDataFromSecondRow(String fileName, int sheetName) throws Exception {

        InputStream fis = InventoryDataProvider.class.getClassLoader().getResourceAsStream(fileName);

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

