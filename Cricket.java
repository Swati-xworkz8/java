public class Cricket{
	public static void runRate(float rate,String playerName){
	int overs=9;
	float runRate=rate/overs;
	System.out.println("run rate of the player:"+runRate+" "+"player Name:"+playerName);
	}
	public static void match(int team1,int team2){
	
	if(team1<team2){
	System.out.println("team2 will be the winner"+team2);
	}else{
	System.out.println("team1 will be the winner"+team1);
	}
	}
	public static void player(int num){
	System.out.println("total number of players"+num);
	
	}
	public static void playerDetails(String name,int age,float height,double weight,String education,int numOfMatches,int totalScore){
	System.out.println("name of the player:"+name+" "+"age:"+age+" "+"height:"+height+" "+"weight:"+weight+" "+"education:"+education+" "+"no of match:"+numOfMatches+" "+"total score:"+totalScore);
	}
	
}