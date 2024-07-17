public class Pen{
public String name;
public int price;
public float capSize;
public short noOfPens;
public String[] names;

public Pen(String name,int price,float capSize,short noOfPens,String[] names){
this.name=name;
this.price=price;
this.capSize=capSize;
this.noOfPens=noOfPens;
System.out.println("name:"+name);
System.out.println("price:"+price);
System.out.println("capSize:"+capSize);
System.out.println("noOfPens:"+noOfPens);
System.out.println("names:");
for(int i=0;i<names.length;i++){
System.out.println(names[i]);
}

}
}