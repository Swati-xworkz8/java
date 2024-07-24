public class Apple{
public String name;
public int noOfApple;
public char vitamin;
public float appleSize;
public double pricePerApple;
public byte seeds;
public short quality;
public boolean isSweet;
public  boolean isSmall;

public Apple(){
System.out.println("Apple is red");
} 
public Apple(String name){
this.name=name;
System.out.println("name:"+name);
}
public Apple(String name,int noOfApple){
this.name=name;
this.noOfApple=noOfApple;
System.out.println("name:"+name+" "+"noOfApple:"+noOfApple);
}
public Apple(String name,int noOfApple,char vitamin){
this.name=name;
this.noOfApple=noOfApple;
this.vitamin=vitamin;
System.out.println("name:"+name+" "+"noOfApple:"+noOfApple+" "+"vitamin:"+vitamin);
}
public Apple(String name,int noOfApple,char vitamin,float appleSize){
this.name=name;
this.noOfApple=noOfApple;
this.vitamin=vitamin;
this.appleSize=appleSize;
System.out.println("name:"+name+" "+"noOfApple:"+noOfApple+" "+"vitamin:"+vitamin+" "+"appleSize:"+appleSize);
}
public Apple(String name,int noOfApple,char vitamin,float appleSize,double pricePerApple){
this.name=name;
this.noOfApple=noOfApple;
this.vitamin=vitamin;
this.appleSize=appleSize;
this.pricePerApple=pricePerApple;
System.out.println("name:"+name+" "+"noOfApple:"+noOfApple+" "+"vitamin:"+vitamin+" "+"appleSize:"+appleSize+" "+"pricePerApple:"+pricePerApple);
}
public Apple(String name,int noOfApple,char vitamin,float appleSize,double pricePerApple,byte seeds){
this.name=name;
this.noOfApple=noOfApple;
this.vitamin=vitamin;
this.appleSize=appleSize;
this.pricePerApple=pricePerApple;
this.seeds=seeds;
System.out.println("name:"+name+" "+"noOfApple:"+noOfApple+" "+"vitamin:"+vitamin+" "+"appleSize:"+appleSize+" "+"pricePerApple:"+pricePerApple+" "+"seeds:"+seeds);
}
public Apple(String name,int noOfApple,char vitamin,float appleSize,double pricePerApple,byte seeds,short quality){
this.name=name;
this.noOfApple=noOfApple;
this.vitamin=vitamin;
this.appleSize=appleSize;
this.pricePerApple=pricePerApple;
this.seeds=seeds;
this.quality=quality;
System.out.println("name:"+name+" "+"noOfApple:"+noOfApple+" "+"vitamin:"+vitamin+" "+"appleSize:"+appleSize+" "+"pricePerApple:"+pricePerApple+" "+"seeds:"+seeds+" "+" quality:"+quality);
}
public Apple(String name,int noOfApple,char vitamin,float appleSize,double pricePerApple,byte seeds,short quality,boolean isSweet){
this.name=name;
this.noOfApple=noOfApple;
this.vitamin=vitamin;
this.appleSize=appleSize;
this.pricePerApple=pricePerApple;
this.seeds=seeds;
this.quality=quality;
this.isSweet=isSweet;
System.out.println("name:"+name+" "+"noOfApple:"+noOfApple+" "+"vitamin:"+vitamin+" "+"appleSize:"+appleSize+" "+"pricePerApple:"+pricePerApple+" "+"seeds:"+seeds+" "+" quality:"+quality+" "+"isSweet:"+isSweet);
}
public Apple(String name,int noOfApple,char vitamin,float appleSize,double pricePerApple,byte seeds,short quality,boolean isSweet,boolean isSmall){
this.name=name;
this.noOfApple=noOfApple;
this.vitamin=vitamin;
this.appleSize=appleSize;
this.pricePerApple=pricePerApple;
this.seeds=seeds;
this.quality=quality;
this.isSweet=isSweet;
this.isSmall=isSmall;
System.out.println("name:"+name+" "+"noOfApple:"+noOfApple+" "+"vitamin:"+vitamin+" "+"appleSize:"+appleSize+" "+"pricePerApple:"+pricePerApple+" "+"seeds:"+seeds+" "+" quality:"+quality+" "+"isSweet:"+isSweet+" "+"isSmall:"+isSmall);
}
}