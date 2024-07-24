public class JobApplictionRunner{
public static void main(String[] args){
JobAppliction value = new JobAppliction();
System.out.println(value);

String[] arr={"java","jira","spring boot","java script","css","sql","SAP"};


JobAppliction value1=new JobAppliction("qualcomm",5,'Q',8.5f,85.6,(byte)22,23456765L,"B.E",arr,556);
System.out.println(value1);


value1.age((byte)16);

boolean value2= value1.age1((byte)22,"B.E");
System.out.println(value2);

int value3=value1.age2("B.E",arr);
System.out.println(value3);

value1.age3(565);

value1.age4(8.5f);




}
}




