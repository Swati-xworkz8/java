public class PerfectNumber{
public static void main(String[] args){
int sum=0;
int num=28;
for (int i=1;i<=num-1;i++){
//int value = num%i;
if(num%i==0){
System.out.println("multiples:"+i);
sum +=i;
System.out.println("total sum:"+sum);
}

}
if(sum==num){
	System.out.println("it is perfect square number:"+num);

}else{
	System.out.println("it is not perfect square number:"+num);
	
}

}

}