import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class BehindTheScenesJosh {

	private static String[][]data;

	public static String[][] readData(String input) 
	{
		File inputWorkbook = new File(input);
		Workbook w;


		try 
		{
			w = Workbook.getWorkbook(inputWorkbook);
			// Get the first sheet


			Sheet sheet = w.getSheet(0);
			data = new String[sheet.getColumns()][sheet.getRows()];

			for (int j = 0; j <sheet.getColumns(); j++) 
			{
				for (int i = 0; i < sheet.getRows(); i++) 
				{
					Cell cell = sheet.getCell(j, i);
					data[j][i] = cell.getContents();
				}
			}
		} 
		catch (BiffException e) 
		{
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
	}

}
