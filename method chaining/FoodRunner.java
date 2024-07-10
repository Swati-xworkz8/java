public class FoodRunner{
	public static void main(String[] args){
	int[] quantity={1,2,6,7,3,8,2,9,5,6,8,9,4,3,1,3,8,11,30,20};
	boolean value=Food.food(quantity);
	System.out.println("quantity:"+value);
	
	
	String[] foodItems={"paneer rool","egg roll","veg roll","noodles","cake","kimchi","roti","egg puff","kurkure","chips","samosa","gobi","kachori","panipuri","mirchi","golgappa","sandwitch","tea","coffee","milkshake"};
	boolean values=Food.food(foodItems);
	System.out.println(values);
	//Food.food(foodItems);
	
	}

}