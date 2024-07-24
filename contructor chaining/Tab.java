public class Tab{
public boolean isGood;
public String name;
public int noOftabs;

public Tab(boolean isGood){
	this("poco");
	this.isGood=isGood;
System.out.println("Phone are good");
}
public Tab(String name){
	this(7,"vivo");
	this.name=name;
System.out.println("name:"+name);
}
public Tab(int noOftabs,String name){
		this.noOftabs=noOftabs;
		this.name=name;

System.out.println("noOftabs:"+noOftabs+" "+"name:"+name);
}
}