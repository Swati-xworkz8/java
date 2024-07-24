public class Bottel{
public String name;
public int weight;
public float price;
public boolean isGood;
public char initial;
public Bottel(String name){
this((int)1);
this.name=name;
	System.out.println("name:"+name);
}
public Bottel(int weight){
this(7.5f);
this.weight=weight;
	System.out.println("weight:"+weight);
}
public Bottel(float price){
this(true);
this.price=price;
	System.out.println("price:"+price);
}
public Bottel(boolean isGood){
this('B');
this.isGood=isGood;
	System.out.println("isGood:"+isGood);
}
public Bottel(char initial){
this.initial=initial;
	System.out.println("initial:"+initial);
}



public void Bottel(char initial){
	System.out.println("washing powder"+initial);
} 
public void Bottel(String name){
	System.out.println("name:"+name);
}
public void Bottel(int weight){
	System.out.println("weight:"+weight);
}
public void Bottel(float price){
	System.out.println("price:"+price);
} 



}