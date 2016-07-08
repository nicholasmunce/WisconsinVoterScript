import java.awt.List;
import java.util.ArrayList;

public class Ward {

	private String name;
	
	int voters2016;
	boolean target;
	boolean newTarget;
	int voters2014;
	double politicalScore;
	double averageVariance;
	private double demVotes2000 = 0;
	private double votes2000 = 0;
	private double demVotes2001 = 0;
	private double votes2001 = 0;
	private double demVotes2002 = 0;
	private double votes2002 = 0;
	private double demVotes2003 = 0;
	private double votes2003 = 0;
	private double demVotes2004 = 0;
	private double votes2004 = 0;
	private double demVotes2005 = 0;
	private double votes2005 = 0;
	private double demVotes2006 = 0;
	private double votes2006 = 0;
	private double demVotes2007 = 0;
	private double votes2007 = 0;
	private double demVotes2008 = 0;
	private double votes2008 = 0;
	private double demVotes2009 = 0;
	private double votes2009 = 0;
	private double demVotes2010 = 0;
	private double votes2010 = 0;
	private double demVotes2011 = 0;
	private double votes2011 = 0;
	private double demVotes2012 = 0;
	private double votes2012 = 0;
	private double demVotes2013 = 0;
	private double votes2013 = 0;
	private double demVotes2014 = 0;
	private double votes2014 = 0;
	private double demVotes2015 = 0;
	private double votes2015 = 0;
	private double demVotes2016 = 0;
	private double votes2016 = 0;
	double voteDem;
	double voteRep;
	double overallVariance2000;
	double overallVariance2001;
	double overallVariance2002;
	double overallVariance2003;
	double overallVariance2004;
	double overallVariance2005;
	double overallVariance2006;
	double overallVariance2007;
	double overallVariance2008;
	double overallVariance2009;
	double overallVariance2010;
	double overallVariance2011;
	double overallVariance2012;
	double overallVariance2013;
	double overallVariance2014;
	double overallVariance2015;
	double overallVariance2016;
	double totalPop2004 = 0;
	double totalPop182004 = 0;
	double whitePop2004 = 0;
	double blackPop2004 = 0;
	double hispanicPop2004 = 0;
	double asianPop2004 = 0;
	double amIndianPop2004 = 0;
	double pIslandPop2004 = 0;
	double otherPop2004 = 0;
	double whitePop182004 = 0;
	double blackPop182004 = 0;
	double hispanicPop182004 = 0;
	double asianPop182004 = 0;
	double amIndianPop182004 = 0;
	double pIslandPop182004 = 0;
	double otherPop182004 = 0;
	double totalPop2006 = 0;
	double totalPop182006 = 0;
	double whitePop2006 = 0;
	double blackPop2006 = 0;
	double hispanicPop2006 = 0;
	double asianPop2006 = 0;
	double amIndianPop2006 = 0;
	double pIslandPop2006 = 0;
	double otherPop2006 = 0;
	double whitePop182006 = 0;
	double blackPop182006 = 0;
	double hispanicPop182006 = 0;
	double asianPop182006 = 0;
	double amIndianPop182006 = 0;
	double pIslandPop182006 = 0;
	double otherPop182006 = 0;
	double totalPop2008 = 0;
	double totalPop182008 = 0;
	double whitePop2008 = 0;
	double blackPop2008 = 0;
	double hispanicPop2008 = 0;
	double asianPop2008 = 0;
	double amIndianPop2008 = 0;
	double pIslandPop2008 = 0;
	double otherPop2008 = 0;
	double whitePop182008 = 0;
	double blackPop182008 = 0;
	double hispanicPop182008 = 0;
	double asianPop182008 = 0;
	double amIndianPop182008 = 0;
	double pIslandPop182008 = 0;
	double otherPop182008 = 0;
	double totalPop2010 = 0;
	double totalPop182010 = 0;
	double whitePop2010 = 0;
	double blackPop2010 = 0;
	double hispanicPop2010 = 0;
	double asianPop2010 = 0;
	double amIndianPop2010 = 0;
	double pIslandPop2010 = 0;
	double otherPop2010 = 0;
	double whitePop182010 = 0;
	double blackPop182010 = 0;
	double hispanicPop182010 = 0;
	double asianPop182010 = 0;
	double amIndianPop182010 = 0;
	double pIslandPop182010 = 0;
	double otherPop182010 = 0;
	double totalPop2012 = 0;
	double totalPop182012 = 0;
	double whitePop2012 = 0;
	double blackPop2012 = 0;
	double hispanicPop2012 = 0;
	double asianPop2012 = 0;
	double amIndianPop2012 = 0;
	double pIslandPop2012 = 0;
	double otherPop2012 = 0;
	double otherPop182012 =0;
	double whitePop182012 = 0;
	double blackPop182012 = 0;
	double hispanicPop182012 = 0;
	double asianPop182012 = 0;
	double amIndianPop182012 = 0;
	double pIslandPop182012 = 0;
	double totalPop2002 = 0;
	double totalPop182002 = 0;
	double whitePop2002 = 0;
	double blackPop2002 = 0;
	double hispanicPop2002 = 0;
	double asianPop2002 = 0;
	double amIndianPop2002 = 0;
	double pIslandPop2002 = 0;
	double otherPop2002 = 0;
	double whitePop182002 = 0;
	double blackPop182002 = 0;
	double hispanicPop182002 = 0;
	double asianPop182002 = 0;
	double amIndianPop182002 = 0;
	double pIslandPop182002 = 0;
	double otherPop182002 = 0;
	double totalPop2014 = 0;
	double totalPop182014 = 0;
	double whitePop2014 = 0;
	double blackPop2014 = 0;
	double hispanicPop2014 = 0;
	double asianPop2014 = 0;
	double amIndianPop2014 = 0;
	double pIslandPop2014 = 0;
	double otherPop2014 = 0;
	double whitePop182014 = 0;
	double blackPop182014 = 0;
	double hispanicPop182014 = 0;
	double asianPop182014 = 0;
	double amIndianPop182014 = 0;
	double pIslandPop182014 = 0;
	double otherPop182014 = 0;
	double votingFraction2014;





	public Ward (String name){
		this.name = name;
	}

	public void politicalScore(String input){
		String[][] array = BehindTheScenesJosh.readData(input);
		double fractionDem = 0;

		double totalVote = 0;
		for(int j = 0; j <array[0].length; j++){

			String fun = array[0][j].toLowerCase();
			String funn = this.name.toLowerCase();
			if(fun.contains(funn) && !array[1][j].isEmpty() && !array[2][j].isEmpty()){

				if(array[3][j].contains("REP")){
					this.voteDem += Integer.parseInt(array[2][j]);
					this.voteRep += Integer.parseInt(array[1][j]);
				}

				else if(array[3][j].contains("DEM")){

					this.voteDem += Integer.parseInt(array[1][j]);

					this.voteRep += Integer.parseInt(array[2][j]);}

			}
		}
		totalVote = (this.voteDem + this.voteRep);

		fractionDem=  (voteDem/totalVote);
		this.politicalScore = fractionDem;
	}





	public void sumVotes(String input){
		String inputString = input;
		String[][] array = BehindTheScenesJosh.readData(inputString);
		Integer year = 0;
		for(int j = 0; j <array[0].length; j++){
			String fun = array[0][j].toLowerCase();
			String funName = this.name.toLowerCase();
			if(fun.contains(funName)){

				if(!(array[5][j].equals("")) && !(array[5][j].equals(null))){
					year = Integer.parseInt(array[5][j]);

					switch (year) {

					case 2000:
						if(!array[1][j].isEmpty() && !array[2][j].isEmpty()){
							votes2000 += Double.parseDouble(array[1][j]) + Double.parseDouble(array[2][j]);

							if(array[3][j].contains("DEM")){
								demVotes2000 +=  Double.parseDouble(array[1][j]);
							}
							else{
								demVotes2000 += Double.parseDouble(array[2][j]);
							}}
						break;

					case 2002:
						if(!array[1][j].isEmpty() && !array[2][j].isEmpty()){
							votes2002 += Double.parseDouble(array[1][j]) + Double.parseDouble(array[2][j]);

							if(array[3][j].contains("DEM")){
								demVotes2002 +=  Double.parseDouble(array[1][j]);
							}
							else{
								demVotes2002 += Double.parseDouble(array[2][j]);
							}}
						break;


					case 2004:
						if(!array[1][j].isEmpty() && !array[2][j].isEmpty()){
							votes2004 += Double.parseDouble(array[1][j]) + Double.parseDouble(array[2][j]);

							if(array[3][j].contains("DEM")){
								demVotes2004 +=  Double.parseDouble(array[1][j]);
							}
							else{
								demVotes2004 += Double.parseDouble(array[2][j]);
							}}
						break;

					case 2006:
						if(!array[1][j].isEmpty() && !array[2][j].isEmpty()){
							votes2006 += Double.parseDouble(array[1][j]) + Double.parseDouble(array[2][j]);

							if(array[3][j].contains("DEM")){
								demVotes2006 +=  Double.parseDouble(array[1][j]);
							}
							else{
								demVotes2006 += Double.parseDouble(array[2][j]);
							}}
						break;



					case 2008:
						if(!array[1][j].isEmpty() && !array[2][j].isEmpty()){
							votes2008 += Double.parseDouble(array[1][j]) + Double.parseDouble(array[2][j]);

							if(array[3][j].contains("DEM")){
								demVotes2008 +=  Double.parseDouble(array[1][j]);
							}
							else if(array[3][j].contains("REP")){
								demVotes2008 += Double.parseDouble(array[2][j]);
							}}
						break;



					case 2010:
						if(!array[1][j].isEmpty() && !array[2][j].isEmpty()){
							votes2010 += Double.parseDouble(array[1][j]) + Double.parseDouble(array[2][j]);

							if(array[3][j].contains("DEM")){
								demVotes2010 +=  Double.parseDouble(array[1][j]);
							}
							else{
								demVotes2010 += Double.parseDouble(array[2][j]);
							}}
						break;

					case 2011:
						if(!array[1][j].isEmpty() && !array[2][j].isEmpty()){
							votes2011 += Double.parseDouble(array[1][j]) + Double.parseDouble(array[2][j]);

							if(array[3][j].contains("DEM")){
								demVotes2011 +=  Double.parseDouble(array[1][j]);
							}
							else{
								demVotes2011 += Double.parseDouble(array[2][j]);
							}}
						break;

					case 2012:
						if(!array[1][j].isEmpty() && !array[2][j].isEmpty()){
							votes2012 += Double.parseDouble(array[1][j]) + Double.parseDouble(array[2][j]);

							if(array[3][j].contains("DEM")){
								demVotes2012 +=  Double.parseDouble(array[1][j]);
							}
							else if (array[3][j].contains("REP")){
								demVotes2012 += Double.parseDouble(array[2][j]);
							}}
						break;

					case 2014:
						if(!array[1][j].isEmpty() && !array[2][j].isEmpty()){
							votes2014 += Double.parseDouble(array[1][j]) + Double.parseDouble(array[2][j]);
						}
						if(array[3][j].contains("DEM")){
							demVotes2014 +=  Double.parseDouble(array[1][j]);
						}
						else{
							demVotes2014 += Double.parseDouble(array[2][j]);
						}
						break;

					case 2015:
						votes2015 += Double.parseDouble(array[1][j]) + Double.parseDouble(array[2][j]);
						if(array[3][j].contains("DEM")){
							demVotes2015 +=  Double.parseDouble(array[1][j]);
						}
						else{
							demVotes2015 += Double.parseDouble(array[2][j]);
						}
						break;

					case 2016:
						votes2016 += Double.parseDouble(array[1][j]) + Double.parseDouble(array[2][j]);
						if(array[3][j].contains("DEM")){
							demVotes2016 +=  Double.parseDouble(array[1][j]);
						}
						else if (array[3][j].contains("REP")){
							demVotes2016 += Double.parseDouble(array[2][j]);
						}
						break;
					}
				}

			}
		}


	}

	public void variance(){

		double totalDem = demVotes2000+demVotes2002+demVotes2004+
				+demVotes2006+demVotes2008+demVotes2010+demVotes2012+demVotes2014
				+demVotes2016;
		double total = votes2000+votes2002+votes2004
				+votes2006+votes2008+votes2010+votes2012
				+votes2014+votes2016;
		double totalScore = totalDem/total;

		if(votes2000!= 0){
			overallVariance2000 = totalScore- (demVotes2000/votes2000);
		}
		
		if(votes2002!= 0){
			overallVariance2002 = totalScore- (demVotes2002/votes2002);
		}
		
		if(votes2004!= 0){
			overallVariance2004 = totalScore- (demVotes2004/votes2004);
		}
		if(votes2006!= 0){
			overallVariance2006 = totalScore- (demVotes2006/votes2006);
		}
		if(votes2008!= 0){
			overallVariance2008 = totalScore- (demVotes2008/votes2008);
		}
		if(votes2010!= 0){
			overallVariance2010 = totalScore- (demVotes2010/votes2010);
		}
		if(votes2012!= 0){
			overallVariance2012 = totalScore- (demVotes2012/votes2012);
		}
		if(votes2014!= 0){
			overallVariance2014= totalScore- (demVotes2014/votes2014);
		}


	}



	public void printVol(){
		System.out.println(this.name + " 2000 varied " + this.overallVariance2000);
		//System.out.println(this.overallVariance2001);
		System.out.println(this.name + " 2002 varied " + this.overallVariance2002);
		//System.out.println(this.overallVariance2003);
		System.out.println(this.name + " 2004 varied " + this.overallVariance2004);
		//System.out.println(this.overallVariance2005);
		System.out.println(this.name + " 2006 varied " + this.overallVariance2006);
		//System.out.println(this.overallVariance2007);
		System.out.println(this.name + " 2008 varied " + this.overallVariance2008);
		//System.out.println(this.overallVariance2009);
		System.out.println(this.name + " 2010 varied " + this.overallVariance2010);
		System.out.println(this.name + " 2011 varied " + this.overallVariance2011);
		System.out.println(this.name + " 2012 varied " + this.overallVariance2012);
		//System.out.println(this.name + " 2013 varied " + this.overallVariance2013);
		System.out.println(this.name + " 2014 varied " + this.overallVariance2014);
		//System.out.println(this.overallVariance2015);
		System.out.println(this.name + " 2016 varied " + this.overallVariance2016);
	}

	public String getName(){
		return this.name;
	}

	public double getPoliticalScore(){
		return this.politicalScore;
	}

	public void averageVol(){
		double total = this.overallVariance2000 + this.overallVariance2002 + this.overallVariance2004 + this.overallVariance2006 
				+ this.overallVariance2008 + this.overallVariance2010 + this.overallVariance2012 + this.overallVariance2014;
		double result = total/8;
		this.averageVariance = result;
	}

	public void population(String input, int year){
		String[][] array = BehindTheScenesJosh.readData(input);
		int nameIndex = 0;
		int totalIndex = 0;
		int totalIndex18 = 0;
		int whiteIndex = 0;
		int blackIndex = 0;
		int hispanicIndex = 0;
		int asianIndex = 0;
		int amIndianIndex = 0;
		int pIslandIndex = 0;
		int otherIndex = 0;
		int whiteIndex18 = 0;
		int blackIndex18 = 0;
		int hispanicIndex18 = 0;
		int asianIndex18 = 0;
		int amIndianIndex18 = 0;
		int pIslandIndex18 = 0;
		int otherIndex18 = 0;

		for(int i = 0; i <array.length; i++){
			if(array[i][0].equals("JVTD2")){
				nameIndex = i;
			}
			if(array[i][0].equals("TOTAL") || array[i][0].equals("PERSONS")){
				totalIndex = i;
			}
			if(array[i][0].equals("TOTAL18") || array[i][0].equals("PERSONS18")){
				totalIndex18 = i;
			}
			if(array[i][0].equals("WHITE")){
				whiteIndex = i;
			}
			if(array[i][0].equals("BLACK")){
				blackIndex = i;
			}
			if(array[i][0].equals("HISPANIC")){
				hispanicIndex = i;
			}
			if(array[i][0].equals("ASIAN")){
				asianIndex = i;
			}
			if(array[i][0].equals("AMINDIAN")){
				amIndianIndex = i;
			}
			if(array[i][0].equals("PISLAND")){
				pIslandIndex = i;
			}
			if(array[i][0].equals("OTHER") || array[i][0].contains("OTHERMLT")){
				otherIndex = i;
			}
			if(array[i][0].equals("WHITE18")){
				whiteIndex18 = i;
			}
			if(array[i][0].equals("BLACK18")){
				blackIndex18 = i;
			}
			if(array[i][0].equals("HISPANIC18")){
				hispanicIndex18 = i;
			}
			if(array[i][0].equals("ASIAN18")){
				asianIndex18 = i;
			}
			if(array[i][0].equals("AMINDIAN18")){
				amIndianIndex18 = i;
			}
			if(array[i][0].equals("PISLAND18")){
				pIslandIndex18 = i;
			}
			if(array[i][0].equals("OTHER18") || array[i][0].contains("OTHERMLT18")){
				otherIndex18 = i;
			}
		}

		switch (year){

		case 2002:

			for(int j = 0; j < DriverClass.wardPop.length; j++){
				for(int k = 0; k <array[nameIndex].length; k++){
					if(DriverClass.wardPop[j].equals(array[nameIndex][k])){
						this.totalPop2002 = Double.parseDouble(array[totalIndex][k]);
						this.totalPop182002 = Double.parseDouble(array[totalIndex18][k]);
						this.whitePop2002 = Double.parseDouble(array[whiteIndex][k]);
						this.blackPop2002 = Double.parseDouble(array[blackIndex][k]);
						this.hispanicPop2002 = Double.parseDouble(array[hispanicIndex][k]);
						this.asianPop2002 = Double.parseDouble(array[asianIndex][k]);
						this.amIndianPop2002 = Double.parseDouble(array[amIndianIndex][k]);
						this.pIslandPop2002 = Double.parseDouble(array[pIslandIndex][k]);
						this.otherPop2002 = Double.parseDouble(array[otherIndex][k]);
						this.whitePop182002 = Double.parseDouble(array[whiteIndex18][k]);
						this.blackPop182002 = Double.parseDouble(array[blackIndex18][k]);
						this.hispanicPop182002 = Double.parseDouble(array[hispanicIndex18][k]);
						this.asianPop182002 = Double.parseDouble(array[asianIndex18][k]);
						this.amIndianPop182002 = Double.parseDouble(array[amIndianIndex18][k]);
						this.pIslandPop182002 = Double.parseDouble(array[pIslandIndex18][k]);
						this.otherPop182002 = Double.parseDouble(array[otherIndex18][k]);}}}

		case 2004:
			for(int j = 0; j < DriverClass.wardPop.length; j++){
				for(int k = 0; k <array[nameIndex].length; k++){
					if(DriverClass.wardPop[j].equals(array[nameIndex][k])){
						this.totalPop2004 = Double.parseDouble(array[totalIndex][k]);
						this.totalPop182004 = Double.parseDouble(array[totalIndex18][k]);
						this.whitePop2004 = Double.parseDouble(array[whiteIndex][k]);
						this.blackPop2004 = Double.parseDouble(array[blackIndex][k]);
						this.hispanicPop2004 = Double.parseDouble(array[hispanicIndex][k]);
						this.asianPop2004 = Double.parseDouble(array[asianIndex][k]);
						this.amIndianPop2004 = Double.parseDouble(array[amIndianIndex][k]);
						this.pIslandPop2004 = Double.parseDouble(array[pIslandIndex][k]);
						this.otherPop2004 = Double.parseDouble(array[otherIndex][k]);
						this.whitePop182004 = Double.parseDouble(array[whiteIndex18][k]);
						this.blackPop182004 = Double.parseDouble(array[blackIndex18][k]);
						this.hispanicPop182004 = Double.parseDouble(array[hispanicIndex18][k]);
						this.asianPop182004 = Double.parseDouble(array[asianIndex18][k]);
						this.amIndianPop182004 = Double.parseDouble(array[amIndianIndex18][k]);
						this.pIslandPop182004 = Double.parseDouble(array[pIslandIndex18][k]);
						this.otherPop182004 = Double.parseDouble(array[otherIndex18][k]);			
					}
				}
			}

		case 2006:
			for(int j = 0; j < DriverClass.wardPop.length; j++){
				for(int k = 0; k <array[nameIndex].length; k++){
					if(DriverClass.wardPop[j].equals(array[nameIndex][k])){
						this.totalPop2006 = Double.parseDouble(array[totalIndex][k]);
						this.totalPop182006 = Double.parseDouble(array[totalIndex18][k]);
						this.whitePop2006 = Double.parseDouble(array[whiteIndex][k]);
						this.blackPop2006 = Double.parseDouble(array[blackIndex][k]);
						this.hispanicPop2006 = Double.parseDouble(array[hispanicIndex][k]);
						this.asianPop2006 = Double.parseDouble(array[asianIndex][k]);
						this.amIndianPop2006 = Double.parseDouble(array[amIndianIndex][k]);
						this.pIslandPop2006 = Double.parseDouble(array[pIslandIndex][k]);
						this.otherPop2006 = Double.parseDouble(array[otherIndex][k]);
						this.whitePop182006 = Double.parseDouble(array[whiteIndex18][k]);
						this.blackPop182006 = Double.parseDouble(array[blackIndex18][k]);
						this.hispanicPop182006 = Double.parseDouble(array[hispanicIndex18][k]);
						this.asianPop182006 = Double.parseDouble(array[asianIndex18][k]);
						this.amIndianPop182006 = Double.parseDouble(array[amIndianIndex18][k]);
						this.pIslandPop182006 = Double.parseDouble(array[pIslandIndex18][k]);
						this.otherPop182006 = Double.parseDouble(array[otherIndex18][k]);		
					}
				}
			}

		case 2008:
			for(int j = 0; j < DriverClass.wardPop.length; j++){
				for(int k = 0; k <array[nameIndex].length; k++){
					if(DriverClass.wardPop[j].equals(array[nameIndex][k])){
						this.totalPop2008 = Double.parseDouble(array[totalIndex][k]);
						this.totalPop182008 = Double.parseDouble(array[totalIndex18][k]);
						this.whitePop2008 = Double.parseDouble(array[whiteIndex][k]);
						this.blackPop2008 = Double.parseDouble(array[blackIndex][k]);
						this.hispanicPop2008 = Double.parseDouble(array[hispanicIndex][k]);
						this.asianPop2008 = Double.parseDouble(array[asianIndex][k]);
						this.amIndianPop2008 = Double.parseDouble(array[amIndianIndex][k]);
						this.pIslandPop2008 = Double.parseDouble(array[pIslandIndex][k]);
						this.otherPop2008 = Double.parseDouble(array[otherIndex][k]);
						this.whitePop182008 = Double.parseDouble(array[whiteIndex18][k]);
						this.blackPop182008 = Double.parseDouble(array[blackIndex18][k]);
						this.hispanicPop182008 = Double.parseDouble(array[hispanicIndex18][k]);
						this.asianPop182008 = Double.parseDouble(array[asianIndex18][k]);
						this.amIndianPop182008 = Double.parseDouble(array[amIndianIndex18][k]);
						this.pIslandPop182008 = Double.parseDouble(array[pIslandIndex18][k]);
						this.otherPop182008 = Double.parseDouble(array[otherIndex18][k]);			
					}
				}
			}

		case 2010:
			for(int j = 0; j < DriverClass.wardPop.length; j++){
				for(int k = 0; k <array[nameIndex].length; k++){
					if(DriverClass.wardPop[j].equals(array[nameIndex][k])){
						this.totalPop2010 = Double.parseDouble(array[totalIndex][k]);
						this.totalPop182010 = Double.parseDouble(array[totalIndex18][k]);
						this.whitePop2010 = Double.parseDouble(array[whiteIndex][k]);
						this.blackPop2010 = Double.parseDouble(array[blackIndex][k]);
						this.hispanicPop2010 = Double.parseDouble(array[hispanicIndex][k]);
						this.asianPop2010 = Double.parseDouble(array[asianIndex][k]);
						this.amIndianPop2010 = Double.parseDouble(array[amIndianIndex][k]);
						this.pIslandPop2010 = Double.parseDouble(array[pIslandIndex][k]);
						this.otherPop2010 = Double.parseDouble(array[otherIndex][k]);
						this.whitePop182010 = Double.parseDouble(array[whiteIndex18][k]);
						this.blackPop182010 = Double.parseDouble(array[blackIndex18][k]);
						this.hispanicPop182010 = Double.parseDouble(array[hispanicIndex18][k]);
						this.asianPop182010 = Double.parseDouble(array[asianIndex18][k]);
						this.amIndianPop182010 = Double.parseDouble(array[amIndianIndex18][k]);
						this.pIslandPop182010 = Double.parseDouble(array[pIslandIndex18][k]);
						this.otherPop182010 = Double.parseDouble(array[otherIndex18][k]);			
					}
				}
			}

		case 2012:
			for(int j = 0; j < DriverClass.wardPop.length; j++){
				for(int k = 0; k <array[nameIndex].length; k++){
					if(DriverClass.wardPop[j].equals(array[nameIndex][k])){
						this.totalPop2012 = Double.parseDouble(array[totalIndex][k]);
						this.totalPop182012 = Double.parseDouble(array[totalIndex18][k]);
						this.whitePop2012 = Double.parseDouble(array[whiteIndex][k]);
						this.blackPop2012 = Double.parseDouble(array[blackIndex][k]);
						this.hispanicPop2012 = Double.parseDouble(array[hispanicIndex][k]);
						this.asianPop2012 = Double.parseDouble(array[asianIndex][k]);
						this.amIndianPop2012 = Double.parseDouble(array[amIndianIndex][k]);
						this.pIslandPop2012 = Double.parseDouble(array[pIslandIndex][k]);
						this.otherPop2012 = Double.parseDouble(array[otherIndex][k]);
						this.whitePop182012 = Double.parseDouble(array[whiteIndex18][k]);
						this.blackPop182012 = Double.parseDouble(array[blackIndex18][k]);
						this.hispanicPop182012 = Double.parseDouble(array[hispanicIndex18][k]);
						this.asianPop182012 = Double.parseDouble(array[asianIndex18][k]);
						this.amIndianPop182012 = Double.parseDouble(array[amIndianIndex18][k]);
						this.pIslandPop182012 = Double.parseDouble(array[pIslandIndex18][k]);
						this.otherPop182012 = Double.parseDouble(array[otherIndex18][k]);					
					}
				}
			}

		case 2014:
			for(int j = 0; j < DriverClass.wardPop.length; j++){
				for(int k = 0; k <array[nameIndex].length; k++){
					if(DriverClass.wardPop[j].equals(array[nameIndex][k])){
						this.totalPop2014 = Double.parseDouble(array[totalIndex][k]);
						this.totalPop182014 = Double.parseDouble(array[totalIndex18][k]);
						this.whitePop2014 = Double.parseDouble(array[whiteIndex][k]);
						this.blackPop2014 = Double.parseDouble(array[blackIndex][k]);
						this.hispanicPop2014 = Double.parseDouble(array[hispanicIndex][k]);
						this.asianPop2014 = Double.parseDouble(array[asianIndex][k]);
						this.amIndianPop2014 = Double.parseDouble(array[amIndianIndex][k]);
						this.pIslandPop2014 = Double.parseDouble(array[pIslandIndex][k]);
						this.otherPop2014 = Double.parseDouble(array[otherIndex][k]);
						this.whitePop182014 = Double.parseDouble(array[whiteIndex18][k]);
						this.blackPop182014 = Double.parseDouble(array[blackIndex18][k]);
						this.hispanicPop182014 = Double.parseDouble(array[hispanicIndex18][k]);
						this.asianPop182014 = Double.parseDouble(array[asianIndex18][k]);
						this.amIndianPop182014 = Double.parseDouble(array[amIndianIndex18][k]);
						this.pIslandPop182014 = Double.parseDouble(array[pIslandIndex18][k]);
						this.otherPop182014 = Double.parseDouble(array[otherIndex18][k]);					
					}
				}
			}

		}

	}
	
	public void targetWard(){
		this.target = false;
		if(this.politicalScore < .6 && this.politicalScore > .4){
			if(this.voters2016 > 300){
				this.target=true;
				DriverClass.targets.add(this);
			}
		}
	}
	
	public void newTarget(){
		this.newTarget = false;
		if(this.voters2016 > 750){
			if(this.averageVariance > .05){
				this.newTarget = true;
				DriverClass.closeTargets.add(this);
			}
		}
	}
}
