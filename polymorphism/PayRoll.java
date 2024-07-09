public class PayRoll{
public static int roll(int noOfList){
System.out.println("total num of list");
return noOfList;
}
public static boolean roll(int noOfList,boolean taxHold){
if(noOfList<=50||taxHold){
System.out.println("out source and wide range");
return taxHold;
}else{
	System.out.println("narrow range");
	return false;
}
}
public static int roll(int noOfList,boolean taxHold,int employee){
System.out.println("list of employee"+noOfList+" "+"tax Hold:"+taxHold+" "+"no of empolyee"+employee);
return 10;
}
public static int roll(int noOfList,boolean taxHold,int employee,double workingHours){
System.out.println("list of employee"+noOfList+" "+"tax Hold:"+taxHold+" "+"no of empolyee"+employee+" "+"working Hours"+workingHours);
return 10;
}
public static int roll(int noOfList,boolean taxHold,int employee,double workingHours,boolean salaryOnTime){
System.out.println("list of employee:"+noOfList+" "+"tax Hold:"+taxHold+" "+"no of empolyee:"+employee+" "+"working Hours:"+workingHours+" "+"salary On Time:"+salaryOnTime);
return 10;
}
}