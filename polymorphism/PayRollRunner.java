public class PayRollRunner{
	public static void main(String []args){
	int value=PayRoll.roll(8);
	System.out.println(value);
	
	boolean values=PayRoll.roll(8,true);
	System.out.println(values);
	
	int valued=PayRoll.roll(8,true,200);
	System.out.println(valued);
	
	int returns=PayRoll.roll(8,true,200,8.5);
	System.out.println(returns);
	
	int returnValue=PayRoll.roll(8,true,200,8.5,false);
	System.out.println(returnValue);
	}
}