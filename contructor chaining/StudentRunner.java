public class StudentRunner{
public static void main(String []args){

Student value=new Student("swati");

double[] grade={9.5,8.5,7.8};
double name=value.avarage(grade);
System.out.println(name);

//double[] grades={80,50,47,90,70,60};
double name1=value.getHighestGrade(grade);
System.out.println("highest:"+name1);

double name2=value.getLowestGrade(grade);
System.out.println("lowest:"+name2);

}
}

















