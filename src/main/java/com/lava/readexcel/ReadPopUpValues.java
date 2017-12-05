package com.lava.readexcel;

import com.lava.utils.Base;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFColor;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import static com.lava.utils.Base.*;

/**
 * Created by Dewesh Yadav on 4/17/2017.
 */
public class ReadPopUpValues extends Base {


    public List pickJsonValuesForDialogElements(String keyword, String fileName, String sheetName) throws IOException {
        List columnData = new ArrayList<>();
        try {
            InputStream fis = ReadPopUpValues.class.getClassLoader().getResourceAsStream(fileName);
            workBook = new XSSFWorkbook(fis);
            sheet = workBook.getSheet(sheetName);

            //Initialize the row and col number
            int col_num = 0;

            //Fetch header name
            row = sheet.getRow(0);

            //Fetching columnNumber of "keyword"
            for (int i = 0; i <= row.getLastCellNum(); i++) {
                if (row.getCell(i).getStringCellValue().equals(keyword)) {
                    col_num = i;
                    break;
                }
            }

            for (Row row : sheet) { // For each Row.
                Cell cell = row.getCell(col_num); // Get the Cell at the Index / Colum you want.
                if (cell != null) {
                    columnData.add(cell.getStringCellValue());
                } else break;
            }

            columnData.remove(0);
            fis.close();
            System.out.println("Data fetched from " + fileName + "is: " + columnData);
        } catch (Exception e) {
            System.out.println("Something went wrong in fetching Data from excel: " + e);
        }

        return columnData;
    }


}

