public class Ball{
public static void main(String []args){
	int count0=0;
	int count1=0;
	int[] array={0,1,0,0,1,0,1,0,1};
	for (int i=0;i<array.length;i++){
	if(array[i]==0){
		count0++;
		
	}else{
		count1++;
			//	System.out.println("total count of 1 is:"+count1);

	}
	}
			System.out.println("total count of 0 is:"+count0+" "+"total count of 1 is:"+count1);


}




}