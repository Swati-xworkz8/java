public class GeminiRunner{
	public static void main(String []args){
	char value=Gemini.features("G");
	System.out.println("initial of gemini:"+value);
	double values =Gemini.features("g","Gemini 1");
	System.out.println("version of gemini:"+values);
	boolean returned =Gemini.features("g","Gemini 1","no");
	System.out.println("translate to other language:"+returned);
	boolean returnedvalue=Gemini.features("g","Gemini 1","yes","yes");
	System.out.println("initial of gemini:"+returnedvalue);
	}
}