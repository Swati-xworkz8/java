public class BankRunner{
public static void main(String []args){

Bank bank=new Bank();

int name=bank.getLength();
System.out.println("length:"+name);

System.out.println("=============save operation===========");
String name1=bank.arraySave(true);
System.out.println(name1);
String name11=bank.arraySave(false);
System.out.println(name11);
String name12=bank.arraySave(true);
System.out.println(name12);
String name13=bank.arraySave(false);
System.out.println(name13);

System.out.println("=============read operation===========");
String name2=bank.arrayRead();
System.out.println(name2);

System.out.println("=============delete operation===========");
String name3=bank.arrayDelete(true);
bank.arrayRead();
System.out.println(name3);

System.out.println("=============update operation===========");
String name4=bank.arrayUpdate(false,true);
bank.arrayRead();
System.out.println(name4);

System.out.println("=============search operation===========");
String name5=bank.arraySearch(true);
bank.arrayRead();
System.out.println(name5);



}
}