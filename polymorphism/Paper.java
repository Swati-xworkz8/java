public class Paper{
	public static boolean type(){
	System.out.println("paper is a class");
	return true;
	}
	public static boolean type(int noOfPapers){
	System.out.println("number of paper:"+noOfPapers);
	return true;
	}
	public static boolean type(int noOfPapers,int pages){
	System.out.println("paper and pages:"+noOfPapers+" "+pages);
	return true;
	}
	public static boolean type(int noOfPapers,int pages,String quality){
	System.out.println("paper and pages and quality:"+noOfPapers+" "+pages+" "+quality);
	return true;
	}
	public static boolean type(int noOfPapers,int pages,String quality,String use){
	System.out.println("paper and pages and quality,use:"+noOfPapers+" "+pages+" "+quality+" "+use);
	return true;
	}
}