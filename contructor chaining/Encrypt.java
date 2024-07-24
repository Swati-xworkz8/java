import java.util.Scanner;

public class Encrypt{
public static void main(String []args){
Scanner scanner=new Scanner(System.in);
System.out.println("encrypt data:");
String inuput=scanner.nextLine();
String output=decrypt(input);
System.out.println("output:"+output);
scanner.close();
}

public static String decrypt(String input){
char input=50;
for(int i=0;input[i]!='\0';i++){
input[i]=input[i]+3;
if(input[i]>'z'){
input[i]=input[i]-26;
}
}
System.out.println(input[i]);
return input;
}
}