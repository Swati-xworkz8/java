public class TheoryRunner{
	public static void main(String []args){
	boolean value =	Theory.details("3 paragraph");
	System.out.println("no of paragraph :"+value);
	
	int values =Theory.details(128,"3rd paragraph");
	System.out.println("page num:"+values);
	
	Theory.details(67);
	Theory.details("information coding and theory",10);

	}
}