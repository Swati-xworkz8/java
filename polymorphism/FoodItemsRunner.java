public class FoodItemsRunner{
	public static void main(String []args){
	int value =FoodItems.items(35);
	System.out.println("no of food items:"+value);
	int values =FoodItems.items(35,"sea food");
	System.out.println("items and type"+values);
	boolean valued =FoodItems.items(35,"sea food","swati");
	System.out.println("items and type"+valued);
	byte b =10;
	boolean returns =FoodItems.items(35,"sea food","swati",b);
	System.out.println("items and type"+returns);
	boolean returned =FoodItems.items(35,"sea food","swati",b,"6/7");
	System.out.println("items and type"+returned);
	}
}