public class MiPayRunner{
	public static void main(String []args){
	String value = MiPay.details("swati");
	System.out.println("value:"+value);
	
	boolean values = MiPay.details(56776,"gowri");
	System.out.println("value:"+values);
	
	boolean valued = MiPay.details(5677687687L);
	System.out.println("value:"+valued);

	MiPay.details(true);
	}
}