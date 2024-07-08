public class ShareMe{
	public static void share(int numOfFile){
	System.out.println("num of files:"+numOfFile);
	}
	public static void share(String send){
	System.out.println("send:"+send);
	}
	public static void share(String receive,int numOfFile){
	System.out.println("receive"+receive+" "+numOfFile);
	}
	public static void share(boolean historyPresent){
	System.out.println("is history present:"+historyPresent);
	}
}