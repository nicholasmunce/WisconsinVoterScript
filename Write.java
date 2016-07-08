import java.awt.List;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.Number;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class Write {

	static String[][]data;

	public static int readData(String input, String file, int year) throws RowsExceededException, WriteException 
	{
		File inputWorkbook = new File(input);
		Workbook w;
		int counter = 0;
		int counter1 = 0;
		int counter2 = 0;

		try 
		{
			w = Workbook.getWorkbook(inputWorkbook);
			File exlFile = new File(file);
			WritableWorkbook writableWorkbook = Workbook
					.createWorkbook(exlFile);
			WritableSheet writableSheet = writableWorkbook.createSheet(
					"Sheet1", 0);
			// Get the first sheet
			for (int m = 1; m < w.getNumberOfSheets(); m++) {
				Sheet sheet = w.getSheet(m);
				Cell party1;
				Cell party2;
				if(!(sheet.getCell(3,8).getContents().contains("REP") || sheet.getCell(3,8).getContents().contains("DEM") || sheet.getCell(3,8).getContents().contains("IND"))){
				party1 = sheet.getCell(3,9);
				party2 = sheet.getCell(4,9);
				}
				
				else{
					party1 = sheet.getCell(3,8);
					party2 = sheet.getCell(4,8);
				}
				//for (int j = 2; j <sheet.getColumns(); j++) 
				//{
					for (int k = 11; k < sheet.getRows()-2; k++) 
					{
						Cell cell = sheet.getCell(1, k);
						Label newLabel = new Label(0, counter, cell.getContents().toString());
						writableSheet.addCell(newLabel);
						counter++;
					}
					
					
					for (int k = 11; k < sheet.getRows()-2; k++) 
					{
						Cell cell = sheet.getCell(3, k);
						Label newLabel = new Label(1, counter1, cell.getContents().toString());
						Label newLabelq = new Label(3, counter1, party1.getContents().toString());
						Integer inte = new Integer(year);
						Label yearLabel = new Label(5, counter1, inte.toString());
						writableSheet.addCell(newLabel);
						writableSheet.addCell(newLabelq);
						writableSheet.addCell(yearLabel);
						counter1++;
					}
					
					for (int k = 11; k < sheet.getRows()-2; k++) 
					{
						Cell cell = sheet.getCell(4, k);
						Label newLabel = new Label(2, counter2, cell.getContents().toString());
						writableSheet.addCell(newLabel);
						Label newLabelq = new Label(4, counter2, party2.getContents().toString());
						writableSheet.addCell(newLabelq);
						counter2++;
					}
					
					
					
					
					
					
					
					
				//}
			} 
			
			
			
			writableWorkbook.write();
    		writableWorkbook.close();
		}
		catch (BiffException e) 
		{
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return counter;


	}
	
	public static void read2010 (String input, String file, Integer year) throws BiffException, IOException, RowsExceededException, WriteException{
		File inputWorkbook = new File(input);
		Workbook w = Workbook.getWorkbook(inputWorkbook);
		File exlFile = new File(file);
		WritableWorkbook writableWorkbook = Workbook
				.createWorkbook(exlFile);
		WritableSheet writableSheet = writableWorkbook.createSheet(
				"Sheet1", 0);
		Sheet sheet = w.getSheet(0);
		int ward1Index = 0;
		int ward2Index = 0;
		int ward3Index = 0;
		int vote1Index = 0;
		int vote2Index = 0;
		
		
		
		
		for(int i = 0; i <sheet.getColumns(); i++){
			if(sheet.getCell(i,0).getContents().contains("REPORTING")){
				ward3Index = i;
				break;
			}
		}
			
		for(int i = 0; i <sheet.getColumns(); i++){	
			if(sheet.getCell(i,0).getContents().contains("MUNICIPALITY") && sheet.getCell(i,1).getContents().contains("TYPE")){
				ward1Index = i;
				break;}
			}
		for(int i = 0; i <sheet.getColumns(); i++){
			if(sheet.getCell(i,0).getContents().contains("MUNICIPALITY") && sheet.getCell(i,1).getContents().contains("NAME")){
				ward2Index = i;
				break;
			}
		}
		for(int i = 0; i <sheet.getColumns(); i++){
			if(sheet.getCell(i,1).getContents().contains("Democratic") || sheet.getCell(i,1).getContents().contains("Republican")){
				vote1Index = i;
				vote2Index = i + 1;
				break;
			}
		}
			
		//find the places where this shit changes
		ArrayList<Integer> changeList = new ArrayList<>();
		for(int a = 0; a < sheet.getRows(); a++){
			if(sheet.getCell(ward3Index, a).getContents().contains("TOTAL")){
				Integer inte = new Integer(a);
				changeList.add(inte);
			}
		}
	
		
		
		for (int k = 1; k < sheet.getRows(); k++) 
		{
			String string1 = "";
			
			if(sheet.getCell(ward3Index,k).getContents().isEmpty()){
				string1 = sheet.getCell(ward1Index,k).getContents().toUpperCase() + " of " + sheet.getCell(ward2Index,k).getContents().toUpperCase() + " Ward 1";
			}
			
			else{
				string1 = sheet.getCell(ward1Index,k).getContents().toUpperCase() + " of " +  sheet.getCell(ward2Index,k).getContents() + " " + sheet.getCell(ward3Index, k).getContents();
			}
			
			Label newLabel = new Label(0, k-1, string1);
			writableSheet.addCell(newLabel);
		}
		
		
		
		for (int k = 1; k < sheet.getRows(); k++) 
		{
			Cell cell = sheet.getCell(vote1Index, k);
			Cell cell2 = sheet.getCell(vote2Index, k);
			Cell party1 = sheet.getCell(0,0);
			Cell party2 = sheet.getCell(0, 0);
			Label newLabel = new Label(1, k-1, cell.getContents().toString());
			Label newLabel2 = new Label (2, k-1, cell2.getContents().toString());
			/*Label newLabel3 =  new Label (0, 0, "0");
			Label newLabel4 = new Label (0, 0, "0");
			if(party1.getContents().toString().contains("Democrat")){
			 newLabel3 = new Label(3, k-2, "DEM");
			}
			else if (party1.getContents().toString().contains("Republican")){
			newLabel3 = new Label(3, k-2, "REP");
			}
			if(party2.getContents().toString().contains("Democrat")){
				 newLabel4 = new Label(4, k-2, "DEM");
				}
			else if (party2.getContents().toString().contains("Republican")){
				newLabel4 = new Label(4, k-2, "REP");
				}*/
			Integer inte = new Integer(year);
			Label yearLabel = new Label(5, k-1, inte.toString());
			writableSheet.addCell(newLabel);
			writableSheet.addCell(newLabel2);
			//writableSheet.addCell(newLabel3);
			//writableSheet.addCell(newLabel4);
			writableSheet.addCell(yearLabel);
		}
		
		writableWorkbook.write();
		writableWorkbook.close();
	}
	
	public static void secondaryWrite(String input, String file, Integer Year, int choice) throws BiffException, IOException, RowsExceededException, WriteException{
		File inputWorkbook = new File(input);
		Workbook w = Workbook.getWorkbook(inputWorkbook);
		File exlFile = new File(file);
		WritableWorkbook writableWorkbook = Workbook
				.createWorkbook(exlFile);
		WritableSheet writableSheet = writableWorkbook.createSheet(
				"Sheet1", 0);
		Sheet sheet = w.getSheet(0);
		
		//find the changes in party
		ArrayList<Integer> list = new ArrayList<>();
		list.add(0, 0);
		for(int i = 0; i<sheet.getRows(); i++){
			Cell cell = sheet.getCell(1, i);
			if(cell.getContents().contains("Democratic") || cell.getContents().contains("Republican")){
				list.add(i);
			}
		}
		
		
		
		for(int i = 0; i<sheet.getRows(); i++){
			for(int j = 0; j<sheet.getColumns(); j++){
				Cell cell = sheet.getCell(j,i);
				Label write = new Label(j, i, cell.getContents().toString());
				writableSheet.addCell(write);
				
			}
			
		}
		
		if(choice == 1)
			{for(int j = 1; j <list.size()-1; j++){
			int index1= list.get(j);
			int index2= list.get(j+1);
			//these bad boys are the parties
			Cell cell=sheet.getCell(1, index1);
			Cell cell2 = sheet.getCell(2, index1);
			int check = list.get(j);
			while( check >= index1 && check <= index2){
				if(cell.getContents().contains("Democratic")){
					Label dem = new Label (3, check, "DEM");
					writableSheet.addCell(dem);
				}
				else if(cell.getContents().contains("Republican")){
					Label rep = new Label (3, check, "REP");
					writableSheet.addCell(rep);
				}
				if(cell2.getContents().contains("Democratic")){
					Label dem = new Label (4, check, "DEM");
					writableSheet.addCell(dem);
				}
				else if(cell2.getContents().contains("Republican")){
					Label rep = new Label (4, check, "REP");
					writableSheet.addCell(rep);
				}
				else if(cell2.getContents().isEmpty()){
					Label empty = new Label(4, check, "NP");
					writableSheet.addCell(empty);
				}
				else if(cell2.getContents().contains("Independent")){
					Label empty = new Label(4, check, "IND");
					writableSheet.addCell(empty);
				}
				
				check++;
			}
			}
		}
		else if (choice ==2){
			for(int e = 0; e<sheet.getRows(); e++){
				Cell first1 = sheet.getCell(1,0);
				Cell second1 = sheet.getCell(2,0);
				if(first1.getContents().contains("Democratic")){
					Label dem = new Label (3, e, "DEM");
					writableSheet.addCell(dem);
				}
				else if(first1.getContents().contains("Republican")){
					Label rep = new Label (3, e, "REP");
					writableSheet.addCell(rep);
				}
				if(second1.getContents().contains("Democratic")){
					Label dem = new Label (4, e, "DEM");
					writableSheet.addCell(dem);
				}
				else if(second1.getContents().contains("Republican")){
					Label rep = new Label (4, e, "REP");
					writableSheet.addCell(rep);
				}
				else if(second1.getContents().isEmpty()){
					Label empty = new Label(4, e, "NP");
					writableSheet.addCell(empty);
				}
				else if(second1.getContents().contains("Independent")){
					Label empty = new Label(4, e, "IND");
					writableSheet.addCell(empty);
				}
				
				
		}
		}
		writableWorkbook.write();
		writableWorkbook.close();
	}
	

	public static void main(String[]args) throws RowsExceededException, WriteException, BiffException, IOException{
		
		//commented out are done.
		
		//readData("data/2014.xls", "data/2014compiled.xls", 2014);
		//readData("data/2016.xls", "data/2016compiled.xls", 2016);
		//readData("data/2013.xls", "data/2013compiled.xls", 2013);
		readData("data/2012.xls", "data/2012compiled.xls", 2012);
		/*readData("data/2012recall.xls", "data/2012recallcompiled.xls", 2012);
		// did manually 
		//readData("data/2011Spring.xls", "data/2011SpringCompiled.xls", 0);
		readData("data/2010Fall.xls", "data/2010FallCompiled.xls", 2010);*/
		//read2010("data/2008Congress.xls", "data/2008CongressCompiled.xls", 2008);
		//read2010("data/2008StateAssemb.xls", "data/Compiled/2008StateAssembCompiled.xls", 2008);
		//secondaryWrite("data/Compiled/2008StateAssembCompiled.xls", "data/Finals/2008StateAssembFinal.xls", 2008);
		//read2010("data/2008StateSenate.xls", "data/Compiled/2008StateSenate.xls", 2008);
		//secondaryWrite("data/Compiled/2008StateSenate.xls", "data/Finals/2008StateSenateFinal.xls",2008);
		//read2010("data/2008USCongress.xls", "data/Compiled/2008USCongress.xls", 2008);
		//secondaryWrite("data/Compiled/2008USCongress.xls", "data/Finals/2008USCongressFinal.xls",2008);
		//read2010("data/2000USSenate.xls", "data/Compiled/2000USSenate.xls", 2000);
		//secondaryWrite("data/Compiled/2000USSenate.xls", "data/Finals/2000USSenateFinal.xls",2000,2);
	}
}
