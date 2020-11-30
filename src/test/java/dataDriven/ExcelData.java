package dataDriven;

public class ExcelData {

	public static void main(String[] args) {
		getNumber1();
		getCellCount();
	}
	public static void getNumber1() {
		String retVal=null;
		//Works properly
		String projectPath = System.getProperty("user.dir");
		//try {

			//Use OpenCSV instead of this.
			//XSSFWorkbook workbook = new XSSFWorkbook(projectPath+"/excel/Students.xlsx");
			//XSSFSheet sheet = workbook.getSheet("Sheet1");
			/*int rowCount =sheet.getPhysicalNumberOfRows();
			int cellCount = sheet.getRow(0).getPhysicalNumberOfCells();*/

/*			System.out.println("No of rows "+rowCount);
			System.out.println("No of cells "+cellCount);
			String student[][] = new String[rowCount][cellCount];*/


			/*for(int i=0;i<rowCount; i++) {
				for(int j=0; j<cellCount; j++) {
					Row r= sheet.getRow(i);
					Cell c = r.getCell(j);
					if(c.equals("")) {
						System.out.println("Found one");
					}
					else if(c.getCellType() == Cell.CELL_TYPE_STRING) {
				        retVal=c.getStringCellValue();}

				        else {
				            retVal = String.valueOf(c.getNumericCellValue());
				        }
					System.out.println(c);
				}*/

/*
		}

	} catch (Exception exp) {
		// TODO Auto-generated catch block
		System.out.println(exp.getMessage());
		System.out.println(exp.getCause());
		exp.printStackTrace();
	}*/

}

public static void getCellCount() {
	String projectPath = System.getProperty("user.dir");

	try {
		/*
		 * XSSFWorkbook workbook = new XSSFWorkbook(projectPath+"/excel/Students.xlsx");
		 * XSSFSheet sheet = workbook.getSheet("Sheet1");
		 * 
		 * DataFormatter obj = new DataFormatter();
		 */


		//double cellData =sheet.getRow(1).getCell(4).getNumericCellValue();
		//	System.out.println(cellData);
	} catch (Exception exp) {
		// TODO Auto-generated catch block
		System.out.println(exp.getMessage());
		System.out.println(exp.getCause());
		exp.printStackTrace();
	}

}

}
