public class Key{
public String name;
public int num;
public boolean isGood; 
public double keyNum;
public long qrNum;


public Key(String name){
	this((int)6);
	this.name=name;
	System.out.println("name:"+name);
}
public Key(int num){
	this(true);
	this.num=num;
	System.out.println("num:"+num);
}
public Key(boolean isGood){
	this(5.6);
	this.isGood=isGood;
	System.out.println("isGood:"+isGood);
}
public Key(double keyNum){
	this((long)9876543389L);
	this.keyNum=keyNum;
	System.out.println("keyNum:"+keyNum);
}
public Key(long qrNum){
	
	System.out.println("qrNum:"+qrNum);
}

public void key(double keyNum){
	System.out.println("products:"+keyNum);
} 
public void key1(String name){
	System.out.println("name:"+name);
}
public void key2(int num){
	System.out.println("num:"+num);
}
public void key3(boolean isGood){
	System.out.println("isGood:"+isGood);
} 


}