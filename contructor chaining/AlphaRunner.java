public class AlphaRunner{
public static void main(String []args){
Alpha value=new Alpha();

value.alpha();

String name=value.save('S');
System.out.println(name);

String name1=value.save('W');
System.out.println(name1);
String name2=value.save('A');
System.out.println(name2);
String name3=value.save('T');
System.out.println(name3);
String name4=value.save('I');
System.out.println(name4);

String value1=value.read();
System.out.println(value1);

} 
}