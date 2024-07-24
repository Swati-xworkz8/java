public class WashingPower{
public String name;
public int weight;
public float price;
public boolean isGood;
public char initial;
public WashingPower(String name){
this((int)20);
this.name=name;
	System.out.println("name:"+name);
}
public WashingPower(int weight){
this(7.5f);
this.weight=weight;
	System.out.println("weight:"+weight);
}
public WashingPower(float price){
this(true);
this.price=price;
	System.out.println("price:"+price);
}
public WashingPower(boolean isGood){
this('W');
this.isGood=isGood;
	System.out.println("isGood:"+isGood);
}
public WashingPower(char initial){
this.initial=initial;
	System.out.println("initial:"+initial);
}



public void washing(char initial){
	System.out.println("washing powder"+initial);
} 
public void washing1(String name){
	System.out.println("name:"+name);
}
public void washing2(int weight){
	System.out.println("weight:"+weight);
}
public void washing3(float price){
	System.out.println("price:"+price);
} 



}