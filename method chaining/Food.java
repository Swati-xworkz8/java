public class Food{
	public static boolean food(int[] quality){
	int price=10;
	for(int i=0;i<quality.length;i++){
	int total=price*quality[i];
	//System.out.println("price:"+price+" "+"quality:"+quality[i]+" "+"total:"+total);
	}
	System.out.println("price:"+price+" "+"quality:"+quality[i]+" "+"total:"+total);
	return true;
	}
	public static boolean food(String[] foodItems){
	for(int index=0;index<foodItems.length;index++){
	
	System.out.println("foodItems:"+foodItems[index]);
	}
	//System.out.println("foodItems:"+foodItems[index]+" "+"price:"+price+" "+"quality:"+quality[i]+" "+"total:"+total);
	return true;
	}
}