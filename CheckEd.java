public class CheckEd{
	public static void main(String[] args){
	int[] numbers={34,19,13,27,86,94,64};
	int evenCount=0;
	int oddCount=0;
	for(int i=0;i<numbers.length;i++){
		if(numbers[i] % 2 == 0){
		//evenCount=evenCount+numbers[i];
		System.out.println("even numbers:"+numbers[i]);
		
	}else{
		//oddCount=oddCount+numbers[i];
		System.out.println("odd numbers:"+numbers[i]);
	}
	}
	//System.out.println("even numbers:"+evenCount[i]);
	//System.out.println("odd numbers:"+oddCount[i]);
	}
}