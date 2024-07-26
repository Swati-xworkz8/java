public class ShipRunner{
public static void main(String [] args){

Ship ship=new Ship();

ship.getArrayLength();

System.out.println("=============save operation===========");

String name=ship.save("titanic");
System.out.println(name);
String name1=ship.save("bark");
System.out.println(name1);
String name2=ship.save("brig");
System.out.println(name2);
String name3=ship.save("caravel");
System.out.println(name3);

System.out.println("=============read operation===========");
String name4=ship.read();
System.out.println(name4);

System.out.println("=============update operation===========");

String name5=ship.update("titanic","cutter");
ship.read();
System.out.println(name5);

System.out.println("=============delete operation===========");
String name6=ship.delete("cutter");
ship.read();
System.out.println(name6);


System.out.println("=============search operation===========");
String name7=ship.search("cutter");
ship.read();
System.out.println(name7);
}
}