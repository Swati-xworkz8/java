public class Galaxy{
static String nameOfGalaxy="milky way";
static long numOfGalaxy=98767898765L;
static boolean isMilkyWay=true;
static  double lightYear= 9.461e12;
static String presentElement="hydrogen";

public String galaxyType;
public double diameter;
public boolean blackHolePresence;
public int discoveredYear;
public char initial;

public Galaxy(String galaxyType,double diameter,boolean blackHolePresence,int discoveredYear,char initial){
	this.galaxyType=galaxyType;
	this.diameter=diameter;
	this.blackHolePresence=blackHolePresence;
	this.discoveredYear=discoveredYear;
	this.initial=initial;
	System.out.println("galaxy Type:"+galaxyType+"   "+"diameter:"+diameter+"   "+"blackHole is Presence:"+blackHolePresence+"   "+"discovered Year:"+discoveredYear+"   "+"initial:"+initial);
}

}