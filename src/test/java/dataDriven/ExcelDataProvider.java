package dataDriven;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ExcelDataProvider {
	
	//Works properly
	@Test(dataProvider ="getData")
	public void setData(String username,String password) {
		
		System.out.println("Your username is ::"+username);
		System.out.println("Your password is ::"+password);
	}
	@DataProvider
	public Object[][] getData(){
		Object[][] data = new Object[3][2];
		//1st row
		data[0][0] = "user1";
		data[0][1] ="abcdef";
		//2nd row
		data[1][0]="user2";
		data[1][1]="xyz";
		//3rd row
		data[2][0]="user3";
		data[2][1]="12345";
		
		return data;
	}
}