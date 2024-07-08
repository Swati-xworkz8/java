public class Quantum{
public static String Measure(String name){
	System.out.println("Qubit is basic component of Qunatum"+name);
	return "QUANTUM";
}
public static boolean Measure(String name,String register){
	System.out.println("qubit and quregister are components"+name+" "+register);
	return true;
}
public static double Measure(String name,String register,double mass){
	double speedOfLight=300000000;
	System.out.println("qubit and quregister are components and energy will be Strong"+name+" "+register+" "+mass);
	return mass * speedOfLight * speedOfLight;
}
public static boolean Measure(float spin){
	if(spin==0.5f || spin==-0.5f){
		System.out.println("the spin of the qubit:"+spin);
	    return true;
	}else{
		System.out.println("range exceeds");
		return false;
	}
	
}
}