public class BloodGroupRunner{
public static void main(String [] args){

BloodGroup value=new BloodGroup();

value.getArrayLength();

System.out.println("=============save operation===========");

String name=value.save('A');
System.out.println(name);
String name1=value.save('B');
System.out.println(name1);
String name2=value.save('O');
System.out.println(name2);
String name3=value.save('A');
System.out.println(name3);

System.out.println("=============read operation===========");
String name4=value.read();
System.out.println(name4);

System.out.println("=============update operation===========");

String name5=value.update('A','O');
value.read();
System.out.println(name5);

System.out.println("=============delete operation===========");
String name6=value.delete('O');
value.read();
System.out.println(name6);


System.out.println("=============search operation===========");
String name7=value.search('O');
value.read();
System.out.println(name7);
}
}