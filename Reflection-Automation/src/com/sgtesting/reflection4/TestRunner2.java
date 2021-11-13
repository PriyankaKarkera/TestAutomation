package com.sgtesting.reflection4;
import java.io.FileInputStream;
import java.lang.reflect.*;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestRunner2 {
	private static String path=null;
	public static void main(String[] args) {
		testRunner();
	}
	private static void testRunner()
	{
		FileInputStream fin=null;
		Workbook wb=null;
		Sheet sh=null;
		Row row=null;
		Cell cell=null;
		try
		{
			path=System.getProperty("user.dir");
			fin=new FileInputStream(path+"\\DataFiles\\data_Runner1.xlsx");
			wb=new XSSFWorkbook(fin);

			sh=wb.getSheet("Sheet1");
			int rc1=sh.getPhysicalNumberOfRows();
			for(int r=1;r<rc1;r++)
			{
				row=sh.getRow(r);
				cell=row.getCell(0);
				String methodname=cell.getStringCellValue();
				cell=row.getCell(1);
				String pkgclassname=cell.getStringCellValue();
				
				System.out.println(pkgclassname+ " ----> "+methodname);
				
				Class cls=Class.forName(pkgclassname);
				Object obj=cls.getDeclaredConstructor().newInstance();
				
				Method method=obj.getClass().getMethod(methodname);
				method.invoke(obj);
			
			}
			sh=wb.getSheet("Sheet2");
			int rc2=sh.getPhysicalNumberOfRows();
			for(int r=1;r<rc2;r++)
			{
				row=sh.getRow(r);
				cell=row.getCell(0);
				String methodname=cell.getStringCellValue();
				cell=row.getCell(1);
				String pkgclassname=cell.getStringCellValue();
				
				System.out.println(pkgclassname+ " ----> "+methodname);
				
				Class cls=Class.forName(pkgclassname);
				Object obj=cls.getDeclaredConstructor().newInstance();
				
				Method method=obj.getClass().getMethod(methodname);
				method.invoke(obj);
			
			}
			sh=wb.getSheet("Sheet3");
			int rc3=sh.getPhysicalNumberOfRows();
			for(int r=1;r<rc3;r++)
			{
				row=sh.getRow(r);
				cell=row.getCell(0);
				String methodname=cell.getStringCellValue();
				cell=row.getCell(1);
				String pkgclassname=cell.getStringCellValue();
				
				System.out.println(pkgclassname+ " ----> "+methodname);
				
				Class cls=Class.forName(pkgclassname);
				Object obj=cls.getDeclaredConstructor().newInstance();
				
				Method method=obj.getClass().getMethod(methodname);
				method.invoke(obj);
			
			}
	
			sh=wb.getSheet("Sheet4");
			int rc4=sh.getPhysicalNumberOfRows();
			for(int r=1;r<rc4;r++)
			{
				row=sh.getRow(r);
				cell=row.getCell(0);
				String methodname=cell.getStringCellValue();
				cell=row.getCell(1);
				String pkgclassname=cell.getStringCellValue();
				
				System.out.println(pkgclassname+ " ----> "+methodname);
				
				Class cls=Class.forName(pkgclassname);
				Object obj=cls.getDeclaredConstructor().newInstance();
				
				Method method=obj.getClass().getMethod(methodname);
				method.invoke(obj);
			
			}
			sh=wb.getSheet("Sheet5");
			int rc5=sh.getPhysicalNumberOfRows();
			for(int r=1;r<rc5;r++)
			{
				row=sh.getRow(r);
				cell=row.getCell(0);
				String methodname=cell.getStringCellValue();
				cell=row.getCell(1);
				String pkgclassname=cell.getStringCellValue();
				
				System.out.println(pkgclassname+ " ----> "+methodname);
				
				Class cls=Class.forName(pkgclassname);
				Object obj=cls.getDeclaredConstructor().newInstance();
				
				Method method=obj.getClass().getMethod(methodname);
				method.invoke(obj);
			
			}
			sh=wb.getSheet("Sheet6");
			int rc6=sh.getPhysicalNumberOfRows();
			for(int r=1;r<rc6;r++)
			{
				row=sh.getRow(r);
				cell=row.getCell(0);
				String methodname=cell.getStringCellValue();
				cell=row.getCell(1);
				String pkgclassname=cell.getStringCellValue();
				
				System.out.println(pkgclassname+ " ----> "+methodname);
				
				Class cls=Class.forName(pkgclassname);
				Object obj=cls.getDeclaredConstructor().newInstance();
				
				Method method=obj.getClass().getMethod(methodname);
				method.invoke(obj);
			
			}
			sh=wb.getSheet("Sheet7");
			int rc7=sh.getPhysicalNumberOfRows();
			for(int r=1;r<rc7;r++)
			{
				row=sh.getRow(r);
				cell=row.getCell(0);
				String methodname=cell.getStringCellValue();
				cell=row.getCell(1);
				String pkgclassname=cell.getStringCellValue();
				
				System.out.println(pkgclassname+ " ----> "+methodname);
				
				Class cls=Class.forName(pkgclassname);
				Object obj=cls.getDeclaredConstructor().newInstance();
				
				Method method=obj.getClass().getMethod(methodname);
				method.invoke(obj);
			
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fin.close();
				wb.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

}
