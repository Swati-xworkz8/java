public class Marriage{
public String name;
public int age;
public String qulification;
public float height;

public Marriage(String name,int age,String qulification,float height){
	this.name=name;
	this.age=age;
	this.qulification=qulification;
	this.height=height;
}
public boolean getProfileDetails(String name){

if(this.name=="rashmi"){
System.out.println("bride found");
return true;
}else{
System.out.println("bride not found");
return false;
}
}

public String getProfileDetails(String name,int age){
	if(this.name=="rashmi" && this.age==23){
		System.out.println("bride found");
		return "founded!!";
	}else{
		System.out.println("bride not found");
		return "not founded??";

	}
	
}

}