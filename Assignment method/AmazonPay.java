public class AmazonPay{
  public static boolean hope(int names[]){
	  
    for(int index = 0; index<names.length; index++){
        System.out.println("Welcome"+names[index]);
    }
        return true;
	}
  public static boolean amounts(float amount){
	 if(amount<=9.6f){
		System.out.println("your balance is low");
		return true;
	}else{
		System.out.println("balance maintance is good");
		return false;
	}
  }	 
}
  
  
