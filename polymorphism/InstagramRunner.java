public class InstagramRunner{
	public static void main(String []args){
	String userNames[]={"swati","seema","ramya","rashmi","nellu"};
	boolean name=Instagram.features(userNames);
	//System.out.println(userNames);
	
	boolean value=Instagram.features(34567888);
	System.out.println(value);
	
	char values =Instagram.features(2345678,true);
	System.out.println(values);
	
	double valued=Instagram.features(2345678,true,"Swati");
	System.out.println(valued);
	
	int returns=Instagram.features(2345678,true,"Swati",'S');
	System.out.println(returns);
	
	float returned=Instagram.features(2345678,true,"Swati",'S',987654321L);
	System.out.println(returned);
	
	boolean returnValue=Instagram.features(2345678,true,"Swati",'S',987654321L,89);
	System.out.println(returnValue);
	
	boolean valueReturn=Instagram.features(2345678,true,"Swati",'S',987654321L,89,210);
	System.out.println(valueReturn);


	}
}