public class DressRunner{
public static void main(String []args){
Dress dress= new Dress();
System.out.println("dress:"+dress);
Dress dress1= new Dress("t shirt");
System.out.println("dress:"+dress1);
Dress dress2= new Dress("t shirt",50);
System.out.println("dress:"+dress2);
Dress dress3= new Dress("t shirt",50,true);
System.out.println("dress:"+dress3);
Dress dress4= new Dress("t shirt",50,true,(short)32);
System.out.println("dress:"+dress4);
Dress dress5= new Dress("t shirt",50,true,(short)32,'M');
System.out.println("dress:"+dress5);
}
}