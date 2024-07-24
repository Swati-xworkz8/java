public class Pen{
public String name;
public int numOfPen;
public char initial;

public Pen(String name,int numOfPen,char initial){
this.name=name;
this.numOfPen=numOfPen;
this.initial=initial;
}

public  void library(String name){
	
System.out.println("name of book:"+name);
library("the brave",10);
}

public  void library(String name,int numOfPen){
	
System.out.println("name of book:"+name+" "+"numOfBooks:"+numOfPen);
library("the joker",10,'J');
}

public  void library(String name,int numOfPen,char initial){
System.out.println("name of book:"+name+" "+"numOfBooks:"+numOfPen+" "+"initial:"+initial);
}
}