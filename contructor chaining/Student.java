public class Student{
String name;
double sum=0;
double a;
int b;
public Student(String name){
	this.name=name;
	System.out.println("name:"+name);
}
public double avarage(double[] grade){
for(int i=0;i<grade.length;i++){
sum=sum+grade[i];
 a=sum/grade.length;
}
return a;
}

public double getHighestGrade(double[] grade){
	double max=grade[0];
for(int x=0;x>grade.length;x++){
	
	if(grade[x]>max){
		max=grade[x];
	}

}
return max;
}

public double getLowestGrade(double[] grade){
	double min = grade[0];
for(int y=0;y<grade.length;y++){
	
	if(grade[y]<min){
		min=grade[y];
	}

}
return min;
}
}

