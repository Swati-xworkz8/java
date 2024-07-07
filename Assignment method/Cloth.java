public class Cloth{
	public static void pure(boolean fall){
		if(fall){
			System.out.println("it's cloth falling on ground");
		}else{
			System.out.println("not a rain is coming");
		}
	}
	public static void wash(String washing){
		if(washing=="water"){
			System.out.println("it is useable");
		}else{
			System.out.println("it is not useable");
		}
	}
}