public class QuantumBitRunner{
	public static void main(String []args){
	boolean value =QuantumBit.features("99.9%");
	System.out.println("accracy of qubit:"+value);
	int values =QuantumBit.features(0.9f);
	System.out.println("probability value:"+values);
	QuantumBit.features(8);
	QuantumBit.features("Entangled","superposition");
	}
}