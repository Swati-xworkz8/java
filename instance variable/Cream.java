public class Cream{
public String name;
public int price;
public float waterContent;
public short noOfPac;
public String[] names;
public Cream(String name,int price,float waterContent,short noOfPac,String[] names){
this.name=name;
this.price=price;
this.waterContent=waterContent;
this.noOfPac=noOfPac;
System.out.println("name:"+name);
System.out.println("price:"+price);
System.out.println("waterContent:"+waterContent);
System.out.println("noOfPac:"+noOfPac);
System.out.println("names:");
for(int i=0;i<names.length;i++){
System.out.println(names[i]);
}

}
}