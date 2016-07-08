
public class Simulator {

	public static void main(String[] args) {
		/*for(int i = 1; i < 36; i++ ){
			String yup = ("OSHKOSH - C " + i);
			System.out.println((char)34 + yup + (char)34 + ",");
		}*/
	
	String[] array = {"CITY OF Waupun",
			"TOWN OF BYRON",
			"TOWN OF CALUMET",
			"TOWN OF ELDORADO",
			"TOWN OF EMPIRE",
			"TOWN OF FOND DU LAC",
			"TOWN OF FRIENDSHIP",
			"TOWN OF LAMARTINE",
			"TOWN OF OAKFIELD",
			"TOWN OF ROSENDALE",
			"TOWN OF SPRINGVALE",
			"TOWN OF TAYCHEEDAH",
			"TOWN OF WAUPUN",
			"VILLAGE OF NORTH FOND DU LAC",
			"VILLAGE OF OAKFIELD",
			"VILLAGE OF ROSENDALE",
			"CITY OF FOND DU LAC WARD 1",
			"CITY OF FOND DU LAC WARD 2",
			"CITY OF FOND DU LAC WARD 3",
			"CITY OF FOND DU LAC WARD 4",
			"CITY OF FOND DU LAC WARD 5",
			"CITY OF FOND DU LAC WARD 6",
			"CITY OF FOND DU LAC WARD 7",
			"CITY OF FOND DU LAC WARD 8",
			"CITY OF FOND DU LAC WARD 9",
			"CITY OF FOND DU LAC WARD 10",
			"CITY OF FOND DU LAC WARD 11",
			"CITY OF FOND DU LAC WARD 12",
			"CITY OF FOND DU LAC WARD 13",
			"CITY OF FOND DU LAC WARD 14",
			"CITY OF FOND DU LAC WARD 15",
			"CITY OF FOND DU LAC WARD 16",
			"CITY OF FOND DU LAC WARD 17",
			"CITY OF FOND DU LAC WARD 18",
			"CITY OF FOND DU LAC WARD 19",
			"CITY OF FOND DU LAC WARD 20",
			"CITY OF FOND DU LAC WARD 21",
			"CITY OF FOND DU LAC WARD 22",
			"CITY OF FOND DU LAC WARD 23",
			"CITY OF FOND DU LAC WARD 24",
			"CITY OF FOND DU LAC WARD 25",
			"CITY OF FOND DU LAC WARD 26",
			"CITY OF FOND DU LAC WARD 27",
			"CITY OF WAUPUN",
			"TOWN OF ALGOMA",
			"TOWN OF BLACK WOLF",
			"TOWN OF NEKIMI",
			"TOWN OF NEPEUSKUN",
			"TOWN OF OMRO",
			"TOWN OF OSHKOSH",
			"TOWN OF OSHKOSH",
			"TOWN OF RUSHFORD",
			"TOWN OF UTICA",
			"CITY OF OMRO",
			"CITY OF OSHKOSH Ward 1",
			"CITY OF OSHKOSH Ward 2",
			"CITY OF OSHKOSH Ward 3",
			"CITY OF OSHKOSH Ward 4",
			"CITY OF OSHKOSH Ward 5",
			"CITY OF OSHKOSH Ward 6",
			"CITY OF OSHKOSH Ward 7",
			"CITY OF OSHKOSH Ward 8",
			"CITY OF OSHKOSH Ward 9",
			"CITY OF OSHKOSH Ward 10",
			"CITY OF OSHKOSH Ward 11",
			"CITY OF OSHKOSH Ward 12",
			"CITY OF OSHKOSH Ward 13",
			"CITY OF OSHKOSH Ward 14",
			"CITY OF OSHKOSH Ward 15",
			"CITY OF OSHKOSH Ward 16",
			"CITY OF OSHKOSH Ward 17",
			"CITY OF OSHKOSH Ward 18",
			"CITY OF OSHKOSH Ward 19",
			"CITY OF OSHKOSH Ward 20",
			"CITY OF OSHKOSH Ward 21",
			"CITY OF OSHKOSH Ward 22",
			"CITY OF OSHKOSH Ward 23",
			"CITY OF OSHKOSH Ward 24",
			"CITY OF OSHKOSH Ward 25",
			"CITY OF OSHKOSH Ward 26",
			"CITY OF OSHKOSH Ward 27",
			"CITY OF OSHKOSH Ward 28",
			"CITY OF OSHKOSH Ward 29",
			"CITY OF OSHKOSH Ward 30",
			"CITY OF OSHKOSH Ward 31",
			"CITY OF OSHKOSH Ward 32",
			"CITY OF OSHKOSH Ward 33",
			"CITY OF OSHKOSH Ward 34",
			"CITY OF OSHKOSH Ward 35"};
	
	for(int j = 0; j <array.length; j++){
		int hold = 0;
		String check = array[j];
		if(check.contains("Ward") || check.contains("WARD")){
			 hold = check.lastIndexOf("W");
			 String haha = check.substring(0, hold);
			String haha2 = check.substring(hold);
			System.out.println((char)34 + haha + "- " + haha2 + (char)34 + ",");
		}
		else{
			System.out.println( (char)34 + array[j] + (char)34 + ",");
		}
		
	}
}
	
		

}
