public class FoodItems{
	public static int items(int noOfItems){
	System.out.println("no of items:");
	return noOfItems;
	}
	public static int items(int noOfItems,String foodType){
		if(noOfItems<=35&&foodType=="sea food"){
			System.out.println("type of food:"+foodType);
			return noOfItems;
		}else{
			System.out.println("food is not found");
			return noOfItems;
		}
	}
	public static boolean items(int noOfItems,String foodType,String name){
		if(noOfItems<=35&&foodType=="sea food"&&name=="swati"){
			System.out.println("and operation is satified");
			return true;
		}else{
			System.out.println("and operation is not satisfied");
			return false;
		}
	}
	public static boolean items(int noOfItems,String foodType,String name, byte ratings){
		if(noOfItems<=35&&foodType=="sea food"&&name=="swati" && ratings<=10){
			System.out.println("and operation is satified");
			return true;
		}else{
			System.out.println("and operation is not satisfied");
			return false;
		}
	}
	public static boolean items(int noOfItems,String foodType,String name,byte ratings,String manufacture){
		if(noOfItems<=35&&foodType=="sea food"&&name=="swati" && ratings<0||manufacture=="5/7"){
			System.out.println("and operation is satified");
			return true;
		}else{
			System.out.println("and operation is not satisfied");
			return false;
		}
	}
	
}