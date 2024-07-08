public class MiPay{
public static String details(String name){
	System.out.println("user name:"+name);
	return "mipay user name";
}
public static boolean details(int balance,String holderName){
	System.out.println("balance:"+balance+" "+holderName);
	return true;
}
public static boolean details(long transferId){
	System.out.println("transfer Id:"+transferId);
	return true;
}
public static void details(boolean isOnlineMethod){
	System.out.println("online mode:"+isOnlineMethod);

}
}