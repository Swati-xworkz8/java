public class PricesRunner{
public static void main(String []args){
Prices value=new Prices();

value.prices();

String name=value.save(60);
System.out.println(name);

String name1=value.save(20);
System.out.println(name1);
String name2=value.save(30);
System.out.println(name2);
String name3=value.save(10);
System.out.println(name3);
String name4=value.save(50);
System.out.println(name4);

String value1=value.read();
System.out.println(value1);

} 
}