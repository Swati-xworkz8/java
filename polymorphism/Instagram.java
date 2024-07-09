public class Instagram{
	public static boolean features(String userNames[]){
	for(int index=0;index<userNames.length;index++){
	System.out.println("names"+userNames[index]);
	}
	return true;
	}
	public static boolean features(int id){
		System.out.println("id is"+id);
		return true;
	}
	public static char features(int id,boolean profilePhoto){
		System.out.println("id and profile Photo:"+id+" "+profilePhoto);
		return 'A';
	}
	public static double features(int id,boolean profilePhoto,String user){
		System.out.println("id and profile Photo user:"+id+" "+profilePhoto+" "+user);
		return 0.0;
	}
	public static int features(int id,boolean profilePhoto,String user,char initial){
		System.out.println("id and profile Photo user:"+id+" "+profilePhoto+" "+user+" "+initial);
		return 50;
	}
	public static float features(int id,boolean profilePhoto,String user,char initial,long followers){
		System.out.println("id and profile Photo user:"+id+" "+profilePhoto+" "+user+" "+initial+" "+followers);
		return 50.9f;
	}
	public static boolean features(int id,boolean profilePhoto,String user,char initial,long followers,int blockedId){
		System.out.println("id and profile Photo user:"+id+" "+profilePhoto+" "+user+" "+initial+" "+followers+" "+blockedId);
		return true;
	}
	public static boolean features(int id,boolean profilePhoto,String user,char initial,long followers,int blockedId,int following){
		System.out.println("id and profile Photo user:"+id+" "+profilePhoto+" "+user+" "+initial+" "+followers+" "+blockedId+" "+following);
		return true;
	}
	
}