public class AppleRunner{
public static void main(String []args){
Apple apple=new Apple();
System.out.println(apple);
Apple apple1=new Apple("gala");
 System.out.println("Apple feature:"+apple1);
Apple apple2=new Apple("gala",8);
 System.out.println("Apple feature:"+apple2);
Apple apple3=new Apple("gala",8,'A');
 System.out.println("Apple feature:"+apple3);
Apple apple4=new Apple("gala",8,'A',2.5f);
 System.out.println("Apple feature:"+apple4);
 Apple apple5=new Apple("gala",8,'A',2.5f,65);
 System.out.println("Apple feature:"+apple5);
 Apple apple6=new Apple("gala",8,'A',2.5f,65);
 System.out.println("Apple feature:"+apple6);
  Apple apple7=new Apple("gala",8,'A',2.5f,65,(byte)9);
 System.out.println("Apple feature:"+apple7);
 Apple apple8=new Apple("gala",8,'A',2.5f,65,(byte)9,(short)10);
 System.out.println("Apple feature:"+apple8);
   Apple apple9=new Apple("gala",8,'A',2.5f,65,(byte)9,(short)10,true);
 System.out.println("Apple feature:"+apple9);
 Apple apple10=new Apple("gala",8,'A',2.5f,65,(byte)9,(short)10,true,false);
 System.out.println("Apple feature:"+apple10);
}

}