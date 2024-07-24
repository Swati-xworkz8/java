public class Charger{
public boolean isGood;
public String name;
public int noOfCharger;

public Charger(boolean isGood){
	this("poco");
	this.isGood=isGood;
System.out.println("Phone are good");
}
public Charger(String name){
	this(7,"vivo");
	this.name=name;
System.out.println("name:"+name);
}
public Charger(int noOfCharger,String name){
		this.noOfCharger=noOfCharger;
		this.name=name;

System.out.println("noOfCharger:"+noOfCharger+" "+"name:"+name);
}
}