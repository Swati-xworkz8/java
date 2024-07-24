public class Sort{
public static void main(String []args){

int[] num={2,4,5,1,3};
for(int i=0;i<num.length;i++){
	for(int index=num.length;index<num.length-1;index++){
		if(num[i]>num[index+1]){
			int n=num[index];
			num[index]=num[index+1];
			num[index+1]=n;
		}
	}
}
for (int j=num.length-1;j>=0;j--){
	System.out.println("order:"+num[j]);
	
}
}			
			



}