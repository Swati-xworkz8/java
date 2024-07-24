public class Employee{
public String name;
public double sum;
public double a;
public double annual;
public Employee(String name){
	this.name=name;
}

public double avarage(double[] salary){
for(int i=0;i<salary.length;i++){
	annual=salary[i]*12;
sum=sum+salary[i];
 a=sum/salary.length;
}
return a;
}
}