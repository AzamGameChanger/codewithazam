package com.codewithazam;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class FromExcelToMap {
    public static void main(String[] args) throws IOException {
        String filePath = System.getProperty("user.dir") + "/testData/Book2.xlsx";

        FileInputStream fis = new FileInputStream(filePath);

        Workbook b = new XSSFWorkbook(fis);

        Sheet sheet = b.getSheet("TestData");
        int cols = sheet.getRow(0).getLastCellNum();
        System.out.println("cols -> " + cols);

        Map<String, String> map = new LinkedHashMap<>();
        for (int col = 0; col < cols; col++) {
            String key = sheet.getRow(0).getCell(col).toString();
            String value = sheet.getRow(1).getCell(col).toString();
            map.put(key,value);
        }
        System.out.println(map);
    }
}
