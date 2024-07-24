public class SportRunner{
public static void main(String []args){
Sports sport=new Sports();
System.out.println(sport);

Sports sport1=new Sports("basket ball",5,"PT Sir",'A',(short)2,true,(byte)12);

sport.play();
sport.play1("basket ball");
String value = sport1.play2();
System.out.println(value);
int number=sport1.play3(6);
System.out.println(number);
}
}




