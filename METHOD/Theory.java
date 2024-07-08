public class Theory{
	public static boolean details(String paragraph){
	System.out.println("the theory contain paragraph:"+paragraph);
	return true;
	}
	public static int details(int pageNum,String paragraph){
	System.out.println("num of pages:"+pageNum+" "+paragraph);
	return 10;
	} 
	public static void details(int noOfDiagram){
	System.out.println("no Of Diagram:"+noOfDiagram);
	}
	public static void details(String subject,int noOfChapter){
	System.out.println("subject:"+subject+" "+noOfChapter);
	}
}