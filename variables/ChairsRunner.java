public class ChairsRunner{
	public static void main(String []args){
		Chairs.chairs(1);//meter
		Chairs.chairs(2.6);
		Chairs.chairs("round");
		//System.out.println(Chairs.chairs(1));//meter
		//System.out.println(Chairs.chairs(2.8));
		//System.out.println(Chairs.chairs("round"));
	
	
	System.out.println("chairs deatils"+Chairs.name);
	System.out.println("chairs deatils"+Chairs.noOfChairs);
	System.out.println("chairs deatils"+Chairs.color);
	
	double returns=Chairs.chairs(2.8);
	System.out.println("weidth:"+returns);
	
	String value=Chairs.chairs("round");
	System.out.println("model:"+value);
	
	
	}

}