public class CoffeeRunner{
	public static void main(String[] args){
	Coffee.coffeeDetails();
	String[] coffee ={"Black coffee","cold coffee"};
	Coffee.coffeeMake(coffee);
	String returnedValue=Coffee.coffees(coffee);
	System.out.println("return value"+returnedValue);
	}

}