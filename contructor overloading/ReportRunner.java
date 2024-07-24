public class ReportRunner{
public static void main(String []args){
Report report=new Report();
System.out.println("report details:"+report);
Report report1=new Report("hospital report");
System.out.println("report name:"+report1);
Report report2=new Report("hospital report",10);
System.out.println("no of report:"+report2);
Report report3=new Report("hospital report",10,"blood test");
System.out.println("test name"+report3);
Report report4=new Report("hospital report",10,"blood test",'o');
System.out.println("blood group:"+report4);
Report report5=new Report("hospital report",10,"blood test",'o',true);
System.out.println("is curable:"+report5);
}
}