public class TicTacRunner{

public static void main(String []args){
	new TicTac();
	new TicTac();
	new TicTac();
	new TicTac();
	
TicTac ticTac=new TicTac();
System.out.println("instance:"+ticTac);

System.out.println("tablets:"+ticTac.tablets);
System.out.println("no of packets:"+ticTac.noOfPackets);

System.out.println("price of the packets:"+ticTac.price);
System.out.println("weight:"+ticTac.weight);

System.out.println("ref num:"+ticTac.refNo);
System.out.println("expired year:"+ticTac.expiredYear);

System.out.println("Price per box:"+ticTac.pricePerBox);
System.out.println("QR num:"+ticTac.qrNum);

System.out.println("height:"+ticTac.height);
System.out.println("weights:"+ticTac.weights);

System.out.println("suger content:"+ticTac.sugerContent);
System.out.println("Protein content:"+ticTac.proteinContent);

System.out.println("initial:"+ticTac.initial);
System.out.println("flavour:"+ticTac.flavour);
System.out.println("isMintType:"+ticTac.isMintType);
System.out.println("isSweet:"+ticTac.isSweet);
}
}