public class ShopRunner{
public static void main(String []args){
Shop value=new Shop();

value.shop();

String name=value.save("electronics shop");
System.out.println(name);

String name1=value.save("cloth shop");
System.out.println(name1);
String name2=value.save("bakary shop");
System.out.println(name2);
String name3=value.save("book shop");
System.out.println(name3);
String name4=value.save("make up shop");
System.out.println(name4);

String value1=value.read();
System.out.println(value1);

} 
}