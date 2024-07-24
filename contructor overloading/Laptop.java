public class Laptop{
public String name;
public int noOfLaps;
public double version;
public char initial;
public String model;
public boolean isWorking;

public Laptop(){
System.out.println("laptopa are good");
}
public Laptop(String name){
System.out.println("name:"+name);
}
public Laptop(String name,int noOfLaps){
System.out.println("name:"+name+" "+"noOfLaps"+noOfLaps);
}
public Laptop(String name,int noOfLaps,double version){
System.out.println("name:"+name+" "+"noOfLaps"+noOfLaps+" "+"version:"+version);
}
public Laptop(String name,int noOfLaps,double version,char initial){
System.out.println("name:"+name+" "+"noOfLaps"+noOfLaps+" "+"version:"+version+" "+"initial:"+initial);
}
public Laptop(String name,int noOfLaps,double version,char initial,String model){
System.out.println("name:"+name+" "+"noOfLaps"+noOfLaps+" "+"version:"+version+" "+"initial:"+initial+" "+"model:"+model);
}
public Laptop(String name,int noOfLaps,double version,char initial,String model,boolean isWorking){
System.out.println("name:"+name+" "+"noOfLaps"+noOfLaps+" "+"version:"+version+" "+"initial:"+initial+" "+"model:"+model+" "+"isWorking:"+isWorking);
}

}