package com.codewithazam;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ReadExcel {
    public static void main(String[] args) throws IOException {
        String filePath = System.getProperty("user.dir") + "/testData/Book2.xlsx";

        FileInputStream fis = new FileInputStream(filePath);

        Workbook b = new XSSFWorkbook(fis);

        Sheet s = b.getSheet("TestData");

        //get number of rows
        int rows = s.getPhysicalNumberOfRows();
        System.out.println("row -> " + rows);

        //number of columns/cells in a specific row
        int cols = s.getRow(1).getLastCellNum();
        System.out.println("cols in a row -> " + cols);

        System.out.println("____________________________");

        //looping  through all rows and columns
        //iterating rows
        for (int row = 0; row < rows; row++) {
            //iterating columns
            for (int col = 0; col < cols; col++) {
               String cellValue = s.getRow(row).getCell(col).toString();
                System.out.print(cellValue + " ");
            }
            System.out.println();
        }

        //This is not important for now!
        b.close(); //this will release the memory
        fis.close(); //this will release the memory




    }
}
