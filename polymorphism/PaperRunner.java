public class PaperRunner{
	public static void main(String []args){
	boolean value =Paper.type();
	System.out.println(value);
	boolean values =Paper.type(34);
	System.out.println(values);
	boolean returnValue =Paper.type(34,78);
	System.out.println(returnValue);
	boolean valuie =Paper.type(34,78,"good","writing");
	System.out.println(valuie);
	}
}