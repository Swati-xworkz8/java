public class QuantumRunner{
	public static void main(String []args){
	Quantum.Measure("Qubit");
	
	boolean value =Quantum.Measure("Qubit","Quregister");
	System.out.println(" "+value);
	//Quantum.Measure("Qubit","Quantum register");
	
	double values =Quantum.Measure("Qubit","Quregister",0.1);
	System.out.println(" "+values);
	
	//boolean valued =Quantum.Measure(0.5);
	//System.out.println(" "+valued);
	System.out.println(Quantum.Measure(0.5f));
	}
}