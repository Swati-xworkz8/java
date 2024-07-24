public class JobAppliction{
public String name;
public int noOfRows;
public char gender;
public float cgpa;
public double percentage;
public byte age;
public long adharNum;
public String qualification;
public String []skills;
public int marks;



public JobAppliction(){
System.out.println("Job application");
}

public JobAppliction(String name,
 int noOfRows,
 char gender,
 float cgpa,
 double perentage,
 byte age,
 long adharNum,String qualification,String []skills,int marks){
 this.name=name;
 this.noOfRows=noOfRows;
 this.gender=gender;
 this.cgpa=cgpa;
 this.percentage=percentage;
 this.age=age;
 this.adharNum=adharNum;
 this.qualification=qualification;
 this.marks=marks;
}


public void age(byte age){
	if(age<18){
		System.out.println("not eligible for job");
	}
}

public boolean age1(byte age,String qualification){
	if(age>21 && qualification=="B.E"){
				System.out.println("eligible for software engineer");
	
	}
	return true;
}

public int age2(String qualification,String []skills){
	for(int i=0;i<skills.length;i++){
	if(qualification=="B.E"&& skills[i]=="java"||skills[i]=="java script"||skills[i]=="spring boot"||skills[i]=="jira"||skills[i]=="css"||skills[i]=="sql"){
		System.out.println("eligible for java developer jobs");
	}else{
				System.out.println("not eligible for java developer jobs");

	}
	}
	return 0;
}
public void age3(int marks){
	if(marks>600){
		System.out.println("invalid marks");
	}else if(marks<=600 && marks>150){
		double percentage=marks*100/600;
		System.out.print("percentage:"+percentage);
	}else{
		System.out.print("not qualified");
		}
}

public void age4(float cgpa){
	if(cgpa>10.0f){
		System.out.println("invalid cgpa");
	}else if(cgpa>5.0f){
				System.out.print("  eligible for software job with cgpa:"+cgpa);
	}else{
				System.out.print("not qualified");

	}
} 

}