public class ThreadRunner{
public static void main(String [] args){

Thread thread=new Thread();

thread.getArrayLength();

System.out.println("=============save operation===========");

String name=thread.save("cotton");
System.out.println(name);
String name1=thread.save("thin");
System.out.println(name1);
String name2=thread.save("ullan");
System.out.println(name2);
String name3=thread.save("normal");
System.out.println(name3);

System.out.println("=============read operation===========");
String name4=thread.read();
System.out.println(name4);

System.out.println("=============update operation===========");

String name5=thread.update("cotton","polyester");
thread.read();
System.out.println(name5);

System.out.println("=============delete operation===========");
String name6=thread.delete("thin");
thread.read();
System.out.println(name6);

System.out.println("=============search operation===========");
String name7=thread.search("thin");
thread.read();
System.out.println(name7);

}
}