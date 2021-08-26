package com.codewithazam;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Homework1 {
    public static void main(String[] args) throws IOException {
        //1. Read the third row (row index 2) and create an ArrayList of String. Then print the ArrayList.

        String filePath = System.getProperty("user.dir") + "/testData/Homework.xlsx";

        FileInputStream fis = new FileInputStream(filePath);

        Workbook b = new XSSFWorkbook(fis);

        Sheet sheet = b.getSheet("Companies");

        int cellTwo = sheet.getRow(2).getLastCellNum();
        System.out.println(cellTwo);

        ArrayList<String> data= new ArrayList<>();
        for (int col=0; col<cellTwo;col++){
            String cellValue = sheet.getRow(2).getCell(col).toString();
            data.add(cellValue);
        }
        System.out.println(data);
    }
}
