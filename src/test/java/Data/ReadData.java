package Data;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;

public class ReadData {

    @DataProvider(name="Data")
    public Object[][] getData(Method m) throws EncryptedDocumentException,IOException {
        String ExcelSheetName=m.getName();
        File f=new File(System.getProperty("user.dir")+"\\Data\\Data.xlsx");
        FileInputStream fis=new FileInputStream(f);
        Workbook wb= WorkbookFactory.create(fis);
        Sheet sheetName =wb.getSheet(ExcelSheetName);
        int totalRows=sheetName.getLastRowNum();
        Row rowCells=sheetName.getRow(0);
        int totalCols=rowCells.getLastCellNum();
        DataFormatter format=new DataFormatter() ;
        String testData[][]=new String[totalRows][totalCols];
        for (int i=1;i<=totalRows;i++){
            for (int j=0;j<totalCols;j++){
                testData[i-1][j]=format.formatCellValue(sheetName.getRow(i).getCell(j));

            }

        }

       return testData;

    }
}
