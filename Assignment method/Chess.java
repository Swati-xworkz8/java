public class Chess{
	public static void queen(){
		int score =78;
		if(score <= 90){
			System.out.println("grade A");
	    }
		if(75<=score|| score>90){
			System.out.println("grade B");
		}
		if(50<=score|| score>75){
			System.out.println("grade C");
		}
		if(30<=score|| score>50){
			System.out.println("grade D");
		}
		if(score <30){
			System.out.println("fail");
		}
	}
	public static void horse(){
		int number=9;
		if(number>=0){
		System.out.println("number is positive");
		}else{
		System.out.println("number is negative");
		}
	}
	public static void elephant(){
		String move="Stright";
		if(move=="Stright"){
			System.out.println("the elephant is move stright");
		}else{
			System.out.println("the elephant is not move stright");
		}
		
	}
	}