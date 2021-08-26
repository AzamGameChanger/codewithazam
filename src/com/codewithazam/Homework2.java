package com.codewithazam;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class Homework2 {
    public static void main(String[] args) throws IOException {
        //2. Read the fifth column (col index 4) and create an HashSet of Double. Then print the HashSet.

        String filePath = System.getProperty("user.dir") + "/testData/Homework.xlsx";

        FileInputStream fis = new FileInputStream(filePath);

        Workbook b = new XSSFWorkbook(fis);

        Sheet sheet = b.getSheet("Companies");

        //print title of the fifth column
        System.out.println(sheet.getRow(0).getCell(4).toString());

        //print number of rows in a file
        int numberRows = sheet.getRow(0).getPhysicalNumberOfCells();
        System.out.println(numberRows);

        //create HashSet with double parameter
        //do not contain the title - means start from index 1
        //iterate through and add to the set
        Set<Double> values =new HashSet<>();
        for (int row = 1; row < numberRows; row++) {
            Double valueCol4 = sheet.getRow(row).getCell(4).getNumericCellValue();
            values.add(valueCol4);
        }
        //print the hashset with double value
        System.out.println(values);
    }

}

