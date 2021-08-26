package com.codewithazam;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelIntro {

    public static void main(String[] args) throws IOException {

        String filePath = "/Users/codewithazam/Desktop/Azam/Book1.xlsx";

        FileInputStream fis = new FileInputStream(filePath);

        Workbook book1 = new XSSFWorkbook(fis);

        Sheet sheet = book1.getSheet("neotech");

        Row row = sheet.getRow(0);

        Cell cell = row.getCell(1);

        String info = cell.toString();
        System.out.println(info); //LastName

        Row r = sheet.getRow(2);
        Cell c = r.getCell(3);
        System.out.println(c.toString()); //NY

        //Method chaining
        String cellInfo = sheet.getRow(1).getCell(2).toString();
        System.out.println(cellInfo); //Garfield

        //How to get numeric value  from the cell
        //only for numbers
        double cellDoubleValue = sheet.getRow(1).getCell(4).getNumericCellValue();
        System.out.println(cellDoubleValue);

        //downcast to integer
        int x = (int)cellDoubleValue;
        System.out.println(x);

        //I can get the zip as a String
       String zip =  sheet.getRow(1).getCell(4).toString();
        System.out.println(zip);

    }
}
