package javaProgrammingPractice;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class sdfghjkl {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C://Users//manoj.ms//Downloads//Dailyreport (1).xlsx");
        XSSFWorkbook book = new XSSFWorkbook(fis);
        XSSFSheet sheet = book.getSheetAt(0);
        System.out.println(sheet.getLastRowNum());
    }
}
