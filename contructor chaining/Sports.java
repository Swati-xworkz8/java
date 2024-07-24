public class Sports{
public String name;
public int numOfPlayers;
public String coachName;
public char teamInitial;
public short numOfBalls;
public boolean isWon;
public byte shirtNum;

public Sports(){
System.out.println("basket ball is also one outdoor sport");
}

public Sports(String name,int numOfPlayers,String coachName,char teamInitial,
short numOfBalls,boolean isWon,byte shirtNum){
this.name=name;
this.numOfPlayers=numOfPlayers;
this.coachName=coachName;
this.teamInitial=teamInitial;
this.numOfBalls=numOfBalls;
this.isWon=isWon;
this.shirtNum=shirtNum;
//System.out.println("name:"+name+" "+"numOfPlayers:"+numOfPlayers+" "+"coachName:"+coachName+" "+"teamInitial");
}


public void play(){
	System.out.println("paly a basket ball");
}
public void play1(String name){
	System.out.println("name:"+name);
}
public String play2(){
	System.out.println("playing a cricket");
	return "cricket";
}
public int play3(int numOfPlayers){
	System.out.println("num of players:"+numOfPlayers);
	return numOfPlayers;
}
}
