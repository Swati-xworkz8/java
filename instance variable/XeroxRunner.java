public class XeroxRunner{
public static void main(String[] args){
Xerox xerox=new Xerox();
System.out.println("Xerox"+xerox);

int[] noOfPages={2,5,6,8,9,3};
Xerox xerox1=new Xerox(9,4.5f,"Student xerox",(short)7,noOfPages);
System.out.println("Xerox"+xerox1);
}
}