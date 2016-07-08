import java.io.File;
import java.io.IOException;
import java.lang.annotation.Target;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Random;

import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DriverClass {

	public static ArrayList<Ward> targets = new ArrayList<>();
	public static ArrayList<Ward> closeTargets = new ArrayList<>();
	public static ArrayList<Ward> wardList = new ArrayList<>();
	public static String[] wards = {"CITY OF Waupun",
			"TOWN OF BYRON Ward",
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
	public static String[]wardSearch = {"CITY OF Waupun",
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
			"CITY OF FOND DU LAC - WARD 1",
			"CITY OF FOND DU LAC - WARD 2",
			"CITY OF FOND DU LAC - WARD 3",
			"CITY OF FOND DU LAC - WARD 4",
			"CITY OF FOND DU LAC - WARD 5",
			"CITY OF FOND DU LAC - WARD 6",
			"CITY OF FOND DU LAC - WARD 7",
			"CITY OF FOND DU LAC - WARD 8",
			"CITY OF FOND DU LAC - WARD 9",
			"CITY OF FOND DU LAC - WARD 10",
			"CITY OF FOND DU LAC - WARD 11",
			"CITY OF FOND DU LAC - WARD 12",
			"CITY OF FOND DU LAC - WARD 13",
			"CITY OF FOND DU LAC - WARD 14",
			"CITY OF FOND DU LAC - WARD 15",
			"CITY OF FOND DU LAC - WARD 16",
			"CITY OF FOND DU LAC - WARD 17",
			"CITY OF FOND DU LAC - WARD 18",
			"CITY OF FOND DU LAC - WARD 19",
			"CITY OF FOND DU LAC - WARD 20",
			"CITY OF FOND DU LAC - WARD 21",
			"CITY OF FOND DU LAC - WARD 22",
			"CITY OF FOND DU LAC - WARD 23",
			"CITY OF FOND DU LAC - WARD 24",
			"CITY OF FOND DU LAC - WARD 25",
			"CITY OF FOND DU LAC - WARD 26",
			"CITY OF FOND DU LAC - WARD 27",
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
			"CITY OF OSHKOSH - Ward 1",
			"CITY OF OSHKOSH - Ward 2",
			"CITY OF OSHKOSH - Ward 3",
			"CITY OF OSHKOSH - Ward 4",
			"CITY OF OSHKOSH - Ward 5",
			"CITY OF OSHKOSH - Ward 6",
			"CITY OF OSHKOSH - Ward 7",
			"CITY OF OSHKOSH - Ward 8",
			"CITY OF OSHKOSH - Ward 9",
			"CITY OF OSHKOSH - Ward 10",
			"CITY OF OSHKOSH - Ward 11",
			"CITY OF OSHKOSH - Ward 12",
			"CITY OF OSHKOSH - Ward 13",
			"CITY OF OSHKOSH - Ward 14",
			"CITY OF OSHKOSH - Ward 15",
			"CITY OF OSHKOSH - Ward 16",
			"CITY OF OSHKOSH - Ward 17",
			"CITY OF OSHKOSH - Ward 18",
			"CITY OF OSHKOSH - Ward 19",
			"CITY OF OSHKOSH - Ward 20",
			"CITY OF OSHKOSH - Ward 21",
			"CITY OF OSHKOSH - Ward 22",
			"CITY OF OSHKOSH - Ward 23",
			"CITY OF OSHKOSH - Ward 24",
			"CITY OF OSHKOSH - Ward 25",
			"CITY OF OSHKOSH - Ward 26",
			"CITY OF OSHKOSH - Ward 27",
			"CITY OF OSHKOSH - Ward 28",
			"CITY OF OSHKOSH - Ward 29",
			"CITY OF OSHKOSH - Ward 30",
			"CITY OF OSHKOSH - Ward 31",
			"CITY OF OSHKOSH - Ward 32",
			"CITY OF OSHKOSH - Ward 33",
			"CITY OF OSHKOSH - Ward 34",
			"CITY OF OSHKOSH - Ward 35",
	};
	public static String[]wardPop = {"BYRON - T", "CALUMET - T", "EL DORADO - T","EMPIRE - T", "FOND DU LAC - T", 
			"FRIENDSHIP - T", "LAMARTINE - T", "OAKFIELD - T", "ROSENDALE - T", "SPRINGVALE - T", "TAYCHEEDA - T",
			"WAUPUN - T", "NORTH FOND DU LAC - V", "OAKFIELD - V", "ROSENDALE - V", "FOND DU LAC - C 1",
			"FOND DU LAC - C 2",
			"FOND DU LAC - C 3",
			"FOND DU LAC - C 4",
			"FOND DU LAC - C 5",
			"FOND DU LAC - C 6",
			"FOND DU LAC - C 7",
			"FOND DU LAC - C 8",
			"FOND DU LAC - C 9",
			"FOND DU LAC - C 10",
			"FOND DU LAC - C 11",
			"FOND DU LAC - C 12",
			"FOND DU LAC - C 13",
			"FOND DU LAC - C 14",
			"FOND DU LAC - C 15",
			"FOND DU LAC - C 16",
			"FOND DU LAC - C 17",
			"FOND DU LAC - C 18",
			"FOND DU LAC - C 19",
			"FOND DU LAC - C 20",
			"FOND DU LAC - C 21",
			"FOND DU LAC - C 22",
			"FOND DU LAC - C 23",
			"FOND DU LAC - C 24",
			"FOND DU LAC - C 25",
			"FOND DU LAC - C 26",
			"FOND DU LAC - C 27",
			"ALGOMA - T",
			"BLACK WOLF - T",
			"NEKIMI - T",
			"NEPEUSKUN - T",
			"OMRO - T",
			"OSHKOSH - T",
			"RUSHFORD - T",
			"UTICA - T",
			"OMRO - C",
			"OSHKOSH - C 1",
			"OSHKOSH - C 2",
			"OSHKOSH - C 3",
			"OSHKOSH - C 4",
			"OSHKOSH - C 5",
			"OSHKOSH - C 6",
			"OSHKOSH - C 7",
			"OSHKOSH - C 8",
			"OSHKOSH - C 9",
			"OSHKOSH - C 10",
			"OSHKOSH - C 11",
			"OSHKOSH - C 12",
			"OSHKOSH - C 13",
			"OSHKOSH - C 14",
			"OSHKOSH - C 15",
			"OSHKOSH - C 16",
			"OSHKOSH - C 17",
			"OSHKOSH - C 18",
			"OSHKOSH - C 19",
			"OSHKOSH - C 20",
			"OSHKOSH - C 21",
			"OSHKOSH - C 22",
			"OSHKOSH - C 23",
			"OSHKOSH - C 24",
			"OSHKOSH - C 25",
			"OSHKOSH - C 26",
			"OSHKOSH - C 27",
			"OSHKOSH - C 28",
			"OSHKOSH - C 29",
			"OSHKOSH - C 30",
			"OSHKOSH - C 31",
			"OSHKOSH - C 32",
			"OSHKOSH - C 33",
			"OSHKOSH - C 34",
			"OSHKOSH - C 35"
	};
	public static String[][] wardPartyScores = new String[wards.length][2];
	//private static String[][] fileArray


	public static void main(String[] args) throws ParseException, BiffException, IOException{
		//add the Wards and their data to the ward list

		for(int j = 0; j < wards.length; j++){
			String name = wards[j];
			Ward ward = new Ward(name);
			wardList.add(ward);

		}

		addScores();
		printScores();
		sumVotes();
		variance();
		voterData();
		for(int i = 0; i <wardList.size(); i++){
			wardList.get(i).population("Data/Population/2002.xls",2002);
			//wardList.get(i).population("Data/Population/2004.xls",2004);
			//wardList.get(i).population("Data/Population/2006.xls",2006);
			//wardList.get(i).population("Data/Population/2008.xls",2008);
			wardList.get(i).population("Data/Population/2010.xls",2010);
			//wardList.get(i).population("Data/Population/2010.xls",2012);
			//wardList.get(i).population("Data/Population/2010.xls",2014);
			wardList.get(i).targetWard();
			wardList.get(i).newTarget();
			if(wardList.get(i).target == true){
				System.out.println("TARGET: " + wardList.get(i).getName());
			}
			if(wardList.get(i).newTarget == true){
				System.out.println("Close Target: " + wardList.get(i).getName());
			}
		}
		simulate();
		optimize(1);
		optimize(2);
		optimize(3);
		optimize(4);
	}


	public static void addScores(){
		addScores("data/Compiled/2010FallCompiled.xls");
		addScores("data/Compiled/2011SpringCompiled.xls");
		addScores("data/Compiled/2012recallcompiled.xls");
		addScores("data/Compiled/2012compiled.xls");
		addScores("data/Compiled/2014compiled.xls");
		addScores("data/Compiled/2016compiled.xls");
		addScores("data/Compiled/2008FallPresidentCompiled.xls");
		addScores("data/Finals/2008StateAssembFinal.xls");
		addScores("data/Finals/2008StateSenateFinal.xls");
		addScores("data/Finals/2008USCongressFinal.xls");
		addScores("data/Finals/2006AGFinal.xls");
		addScores("data/Finals/2006DAFinal.xls");
		addScores("data/Finals/2006GovFinal.xls");
		addScores("data/Finals/2006AssmFinal.xls");
		addScores("data/Finals/2006SecStateFinal.xls");
		addScores("data/Finals/2006StateTreasFinal.xls");
		addScores("data/Finals/2006StateSenateFinal.xls");
		addScores("data/Finals/2006USSenateFinal.xls");
		addScores("data/Finals/2006USCongressFinal.xls");
		addScores("data/Finals/2004PresidentFinal.xls");
		addScores("data/Finals/2002GovFinal.xls");
		addScores("data/Finals/2002AGFinal.xls");
		addScores("data/Finals/2002SecFinal.xls");
		addScores("data/Finals/2002StateTreFinal.xls");
		addScores("data/Finals/2002USCongressFinal.xls");
		addScores("data/Finals/2002StateSenateFinal.xls");
		addScores("data/Finals/2002StateAssmFinal.xls");
		addScores("data/Finals/2002DAFinal.xls");
		addScores("data/Finals/2000StateAssmFinal.xls");
		addScores("data/Finals/2000DAFinal.xls");
		addScores("data/Finals/2000StateSenateFinal.xls");
		addScores("data/Finals/2000USSenateFinal.xls");
		addScores("data/Finals/2000USCongressFinal.xls");
		addScores("data/Finals/2000PresidentFinal.xls");
	}

	public static void sumVotes(){
		for(int i = 0; i < wardList.size(); i++){
			wardList.get(i).sumVotes("data/Finals/2000PresidentFinal.xls");
			wardList.get(i).sumVotes("data/Finals/2000USCongressFinal.xls");
			wardList.get(i).sumVotes("data/Finals/2000USSenateFinal.xls");
			wardList.get(i).sumVotes("data/Finals/2000StateSenateFinal.xls");
			wardList.get(i).sumVotes("data/Finals/2000DAFinal.xls");
			wardList.get(i).sumVotes("data/Finals/2000StateAssmFinal.xls");
			wardList.get(i).sumVotes("data/Finals/2002DAFinal.xls");
			wardList.get(i).sumVotes("data/Finals/2002StateAssmFinal.xls");
			wardList.get(i).sumVotes("data/Finals/2002StateSenateFinal.xls");
			wardList.get(i).sumVotes("data/Finals/2002USCongressFinal.xls");
			wardList.get(i).sumVotes("data/Finals/2002StateTreFinal.xls");
			wardList.get(i).sumVotes("data/Finals/2002SecFinal.xls");
			wardList.get(i).sumVotes("data/Finals/2002AGFinal.xls");
			wardList.get(i).sumVotes("data/Finals/2002GovFinal.xls");
			wardList.get(i).sumVotes("data/Finals/2004USSenateFinal.xls");
			wardList.get(i).sumVotes("data/Finals/2004PresidentFinal.xls");
			wardList.get(i).sumVotes("data/Finals/2006USCongressFinal.xls");
			wardList.get(i).sumVotes("data/Finals/2006USSenateFinal.xls");
			wardList.get(i).sumVotes("data/Finals/2006StateSenateFinal.xls");
			wardList.get(i).sumVotes("data/Finals/2006StateTreasFinal.xls");
			wardList.get(i).sumVotes("data/Finals/2006SecStateFinal.xls");
			wardList.get(i).sumVotes("data/Finals/2006AssmFinal.xls");
			wardList.get(i).sumVotes("data/Finals/2006GovFinal.xls");
			wardList.get(i).sumVotes("data/Finals/2006DAFinal.xls");
			wardList.get(i).sumVotes("data/Finals/2006AGFinal.xls");
			wardList.get(i).sumVotes("data/Finals/2008USCongressFinal.xls");
			wardList.get(i).sumVotes("data/Finals/2008StateSenateFinal.xls");
			wardList.get(i).sumVotes("data/Finals/2008StateAssembFinal.xls");
			wardList.get(i).sumVotes("data/Compiled/2008FallPresidentCompiled.xls");
			wardList.get(i).sumVotes("data/Compiled/2010FallCompiled.xls");
			wardList.get(i).sumVotes("data/Compiled/2011SpringCompiled.xls");
			wardList.get(i).sumVotes("data/Compiled/2012Compiled.xls");
			wardList.get(i).sumVotes("data/Compiled/2012compiled.xls");
			wardList.get(i).sumVotes("data/Compiled/2014compiled.xls");
			wardList.get(i).sumVotes("data/Compiled/2016compiled.xls");

		}
	}

	public static void variance(){
		for(int i = 0; i<wardList.size(); i++){
			wardList.get(i).variance();
		}
		for(int z = 0; z <wardList.size(); z++){
			wardList.get(z).averageVol();
			System.out.println(wardList.get(z).getName() + " average variance from mean of: " + wardList.get(z).averageVariance);
		}
	}

	public static void voterData(){
		String [][] array = BehindTheScenesJosh.readData("Data/Wards/2016.xls");
		for(int i = 0; i<wardList.size(); i++){
			for(int j = 0; j <array[0].length; j++){
				String lol = wardSearch[i].toLowerCase();
				String lolz = array[0][j].toLowerCase();
				if(lolz.contains(lol)){
					Integer inte = new Integer(array[1][j]);
					wardList.get(i).voters2016 = inte;
				}
			}
		}

		array = BehindTheScenesJosh.readData("Data/Wards/2014.xls");
		for(int i = 0; i<wardList.size(); i++){
			for(int j = 8; j <array[0].length; j++){
				//String in = array[6][j];
				if(wardSearch[i].equalsIgnoreCase(array[7][j])){
					Integer inte = new Integer(array[8][j]);
					wardList.get(i).voters2014 = inte;
				}
			}
		}

		array = BehindTheScenesJosh.readData("Data/Wards/2014.xls");
		for(int i = 0; i<wardList.size(); i++){
			for(int j = 8; j <array[0].length; j++){
				//String in = array[6][j];
				if(wardSearch[i].equalsIgnoreCase(array[7][j])){
					Integer inte = new Integer(array[8][j]);
					wardList.get(i).voters2014 = inte;
				}
			}
		}

		for(int a = 0; a <wardList.size(); a++){
			System.out.println(wardList.get(a).voters2016);
		}

	}

	public static void addScores (String input1){

		//calculate the score
		for(int i = 0; i <wardList.size(); i ++){
			wardList.get(i).politicalScore(input1);
		}
	}

	public static void printScores(){	
		//show the score
		for(int i = 0; i < wardList.size(); i++){
			wardPartyScores[i][0] = wardList.get(i).getName();
			Double d = Double.valueOf((wardList.get(i).getPoliticalScore()));
			wardPartyScores[i][1] = d.toString();
			System.out.println(wardPartyScores[i][0] + " --> " + wardPartyScores[i][1]);
		}
	}

	public static void simulate(){
		double derr = 0;
		double demVote = 0;
		double repVote = 0;
		double totalPop = 0;
		double total = 0;
		double counter = 0;
		double yay = 0;
		Random rand = new Random();
		for(int k = 0; k<wardList.size(); k++){
			double hold = wardList.get(k).totalPop182014;
			totalPop = totalPop + hold;
		}
		for(int j = 0; j <wardList.size(); j++){
			double score = wardList.get(j).getPoliticalScore();
			//double volatility = wardList.get(j).averageVol();
			if(!(wardList.get(j).voters2016 == 0)){
				for(int i = 0; i <wardList.get(j).voters2016; i++){

					//System.out.println(wardList.get(j).getName() + " round " + i);
					double vote = rand.nextDouble();
					if(score > .5){
						if(vote <= score){
							demVote++;
						}
						else if(vote > score){
							repVote++;
						}
					}
					if(score < .5){
						if(vote >= score){
							repVote++;
						}
						else if(vote < score){
							demVote++;
						}
					}
					counter++;
				}
			}

			else{
				//System.out.println("whoops! We couldn't find a population for " + wardList.get(j).getName());
			}
			/*double ratio = 0;
			if(!(demVote + repVote == 0)){
			ratio = demVote/ (demVote + repVote);}
			double populationFraction = 0;
			if(wardList.get(j).totalPop182014 != 0){
				populationFraction = wardList.get(j).totalPop182014;

			double fraction = populationFraction/totalPop;
			double scaledFactor = ratio * fraction;
			total = total +scaledFactor;
			counter++;}*/

		}
		System.out.println(demVote / (demVote + repVote));
	}

	public static void optimize(int option){
		int choice = option;
		Random rand = new Random();

		if (choice == 1){
			for(int i = 0; i <targets.size(); i++){
				double increase = .1 * targets.get(i).voters2016;
				targets.get(i).voters2016 += increase;
			}
			simulate();}

		if(choice == 2){
			for(int i = 0; i <targets.size(); i++){
				targets.get(i).voters2016 -= .1 * targets.get(i).voters2016;
				double increase = 2 *targets.get(i).averageVariance;
				targets.get(i).politicalScore += increase;
			}
			simulate();}
		if(choice ==3){
			for(int i = 0; i <closeTargets.size(); i++){
				//targets.get(i).politicalScore -= 2 *targets.get(i).averageVariance;
				double yo  = .1*closeTargets.get(i).politicalScore;
				closeTargets.get(i).politicalScore += yo;
			}
			simulate();
		}
		if(choice ==4){
			int counter = 1;
			while(counter < 5){
				for(int i = 0; i <targets.size(); i++){
					//targets.get(i).politicalScore -= 2 *targets.get(i).averageVariance;
					int yo  = rand.nextInt(101);
					if(yo%2 == 0){
						targets.get(i).politicalScore += .1*targets.get(i).politicalScore;
						counter++;
					}

				}}
			simulate();
		}

	}

}


