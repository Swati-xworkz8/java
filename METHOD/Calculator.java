public class Calculator{
	public static void operator(int age){
	int birthdayYear=2024-age;
	System.out.println("calculator:"+birthdayYear);
	}
	public static void operator(float division){
	System.out.println("division:"+division);
	}
	public static void operator(char[] hexanumber){
	System.out.println("hexa number:"+hexanumber);
	}
	public static void operator(double price){
	double gst = 0.18*price;
	System.out.println("total gst:"+gst);
	}
}