public class Air{
	public static void pure(boolean filter){
		if(filter){
			System.out.println("it's filter air");
		}else{
			System.out.println("not a filter air");
		}
	}
	public static void source(String fan){
		if(fan=="havells"){
			System.out.println("it is useable");
		}else{
			System.out.println("it is not useable");
		}
	}
}