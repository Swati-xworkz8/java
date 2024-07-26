public class PlaneRunner{
public static void main(String [] args){

Plane value=new Plane();

value.getArrayLength();

System.out.println("=============save operation===========");

String name=value.save("cessna");
System.out.println(name);
String name1=value.save("Lockheed c-130");
System.out.println(name1);
String name2=value.save("bomber");
System.out.println(name2);
String name3=value.save("airbus");
System.out.println(name3);

System.out.println("=============read operation===========");
String name4=value.read();
System.out.println(name4);

System.out.println("=============update operation===========");

String name5=value.update("airbus","bell");
value.read();
System.out.println(name5);

System.out.println("=============delete operation===========");
String name6=value.delete("bell");
value.read();
System.out.println(name6);


System.out.println("=============search operation===========");
String name7=value.search("bomber");
value.read();
System.out.println(name7);
}
}