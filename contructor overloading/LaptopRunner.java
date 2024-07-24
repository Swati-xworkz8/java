public class LaptopRunner{
public static void main(String []args){
Laptop laptop=new Laptop();
System.out.println("laptop details:"+laptop);

Laptop laptop1=new Laptop("dell");
System.out.println("laptop details:"+laptop1);

Laptop laptop2=new Laptop("dell",12);
System.out.println("laptop details:"+laptop2);
Laptop laptop3=new Laptop("dell",12,13.0);
System.out.println("laptop details:"+laptop3);

Laptop laptop4=new Laptop("dell",12,13.0,'D');
System.out.println("laptop details:"+laptop4);

Laptop laptop5=new Laptop("dell",12,13.0,'D',"dell");
System.out.println("laptop details:"+laptop5);

Laptop laptop6=new Laptop("dell",12,13.0,'D',"dell",true);
System.out.println("laptop details:"+laptop6);
}
}