public class PerfectNumber{
public static void main(String[] args){
int sum=0;
int num=6;
for (int i=1;i<=num-1;i++){

if(num%i==0){
System.out.println("multiples:"+i);
sum =i+sum;
System.out.println("total sum:"+sum);
}

}
if(sum==num){
	System.out.println("it is perfect number:"+num);

}else{
	System.out.println("it is not perfect number:"+num);
	
}

}

}