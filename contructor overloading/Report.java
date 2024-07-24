public class Report{
public String reportName;
public int noOfReport;
public String testName;
public char bloodGroup;
public boolean iscurable;

public Report(){
	
	System.out.println("Hospital Report");
}
public Report(String reportName){
	
	System.out.println("name:"+reportName);
}
public Report(String reportName,int noOfReport){
	
	System.out.println("name:"+reportName+" "+"noOfReport:"+noOfReport);
}
public Report(String reportName,int noOfReport,String testName){
	
	System.out.println("name:"+reportName+" "+"noOfReport:"+noOfReport+" "+"testName:"+testName);
}
public Report(String reportName,int noOfReport,String testName,char BloodGroup){
	
	System.out.println("name:"+reportName+" "+"noOfReport:"+noOfReport+" "+"testName:"+testName+" "+"bloodGroup:"+bloodGroup);
}
public Report(String reportName,int noOfReport,String testName,char BloodGroup,boolean iscurable){
	
	System.out.println("name:"+reportName+" "+"noOfReport:"+noOfReport+" "+"testName:"+testName+" "+"bloodGroup:"+bloodGroup+" "+"iscurable:"+iscurable);
}
}