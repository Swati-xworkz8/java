public class Chips{
public String name;
public int noOfChips;
public String shape;
public boolean isSpice;
public char initial;
public short size;

public Chips(){
System.out.println("Chips details");
} 

public Chips(String name){
this.name=name;
System.out.println("name:"+name);
} 
public Chips(String name,int noOfChips){
this.name=name;
this.noOfChips=noOfChips;
System.out.println("name:"+name+" "+"noOfChips:"+noOfChips);
}
public Chips(String name,int noOfChips,String shape){
this.name=name;
this.noOfChips=noOfChips;
this.shape=shape;
System.out.println("name:"+name+" "+"noOfChips:"+noOfChips+"shape:"+shape);
}
public Chips(String name,int noOfChips,String shape,boolean isSpice){
this.name=name;
this.noOfChips=noOfChips;
this.shape=shape;
this.isSpice=isSpice;
System.out.println("name:"+name+" "+"noOfChips:"+noOfChips+"shape:"+shape+" "+"isSpice"+isSpice);
}
public Chips(String name,int noOfChips,String shape,boolean isSpice,char initial){
this.name=name;
this.noOfChips=noOfChips;
this.shape=shape;
this.isSpice=isSpice;
this.initial=initial;
System.out.println("name:"+name+" "+"noOfChips:"+noOfChips+"shape:"+shape+" "+"isSpice:"+isSpice+" "+"initial:"+initial);
}
public Chips(String name,int noOfChips,String shape,boolean isSpice,char initial,short size){
this.name=name;
this.noOfChips=noOfChips;
this.shape=shape;
this.isSpice=isSpice;
this.initial=initial;
this.size=size;
System.out.println("name:"+name+" "+"noOfChips:"+noOfChips+"shape:"+shape+" "+"isSpice:"+isSpice+" "+"initial:"+initial+" "+"size:"+size);
}
}