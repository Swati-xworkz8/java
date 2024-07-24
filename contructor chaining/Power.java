import java.util.Scanner;
public class Power{
public static void main(String []args){
	Scanner scanner=new Scanner(System.in);
	System.out.println("enter the number:");
		int n=scanner.nextInt();

	System.out.println(n);
if(power(n)){
System.out.println("yes");
}else{
System.out.println("no");

}
}


public static boolean power(int n){
if(n<=0){
	return false;
	}
	return (n&(n-1))==0;
	}



}