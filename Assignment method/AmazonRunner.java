public class AmazonRunner{
	public static void main(String []args){
	Amazon.cloths();
	Amazon.scenes("amazon is amazing");
	//Amazon.beautyProduct();
	
	System.out.println(Amazon.beautyProduct());
	String shopName[]={"nike","prada","bata"};
	int returnValue=Amazon.noOfShops(shopName);
	//String value="prada";
	System.out.println(returnValue);
	//Amazon.noOfShops("prada");
	
	}
}
