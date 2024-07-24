public class Scooty{
public String name;
public int numOfScooty;
public char initial;
public double noOfKm;
public float mileage;
public boolean ispetrol;
public byte kmPerHr;

public Scooty(){
System.out.println("scooty is pleasure");
}
public Scooty(
 String name,
 int numOfScooty,
 char initial,
 double noOfKm,
 float mileage,
 boolean ispetrol,
 byte kmPerHr){
 this.name=name;
 this.numOfScooty=numOfScooty;
 this.initial=initial;
 this.noOfKm=noOfKm;
 this.mileage=mileage;
 this.ispetrol=ispetrol;
 this.kmPerHr=kmPerHr;
}

public void ride(){
	System.out.println("ride the scooty");
}
public void ride1(String name){
	System.out.println("name:"+name);
}
public String ride2(){
	System.out.println("ride the scooty");
	return "scooty";
}
public boolean ride3(int numOfScooty){
	System.out.println("numOfScooty:"+numOfScooty);
	return true;
}

}