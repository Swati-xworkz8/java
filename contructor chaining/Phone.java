public class Phone{
public boolean isGood;
public String name;
public int noOfPhs;

public Phone(boolean isGood){
	this("poco");
	this.isGood=isGood;
System.out.println("Phone are good");
}
public Phone(String name){
	//this(true);
	this.name=name;
System.out.println("name:"+name);
}
public Phone(int noOfPhs,String name){
		this("apple");
		this.noOfPhs=noOfPhs;
		this.name=name;

System.out.println("noOfPhs:"+noOfPhs+" "+"name:"+name);
}
}