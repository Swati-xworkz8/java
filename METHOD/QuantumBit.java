public class QuantumBit{
	public static boolean features(String accuracy){
	System.out.println("accuracy of qubits:"+accuracy);
	return true;
	}
	public static int features(float probability){
	if (probability>=0 && probability<=1){
	System.out.println("total probability:"+probability);
	return 10;
	}else{
	System.out.println("does not consider as probability");
	return 11;
	}
	} 
	public static void features(int noOfQuBit){
	System.out.println("no Of Quantum Bit:"+noOfQuBit);
	}
	public static void features(String feature,String content){
	System.out.println("main feature:"+feature+" "+"and"+" "+content);
	}
}