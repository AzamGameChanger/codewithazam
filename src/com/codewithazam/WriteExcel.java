package com.codewithazam;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExcel {
    public static void main(String[] args) throws IOException {
        String filePath = System.getProperty("user.dir") + "/testData/Book2.xlsx";

        FileInputStream fis = new FileInputStream(filePath);

        Workbook b = new XSSFWorkbook(fis);

        Sheet sheet = b.getSheet("TestData");

        //I want to write into row with index 0;
        sheet.getRow(0).createCell(5).setCellValue("Country");

        //I want to create a new row and write Shodmon in the first cell
        sheet.createRow(3).createCell(0).setCellValue("Shodmon");

        //create  a new sheet
        b.createSheet("Burak");

        //To write we need fileOutputStream
        FileOutputStream fos = new FileOutputStream(filePath);
        b.write(fos);

    }
}
