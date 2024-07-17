public class MenthoPlus{
public int noOfBoxes;
public float price;
public String company;
public short dateOfmanufacture;
public String[] contents;

public MenthoPlus(int noOfBoxes,float price,String company,short dateOfmanufacture,String[] contents){
	this.noOfBoxes=noOfBoxes;
	this.price=price;
	this.company=company;
	this.dateOfmanufacture=dateOfmanufacture;
	
	System.out.println("noOfBoxes:"+noOfBoxes);
	System.out.println("price:"+price);
	System.out.println("company:"+company);
	System.out.println("dateOfmanufacture:"+dateOfmanufacture);
	System.out.println("contents:");
	for(int i=0;i<contents.length;i++){
		System.out.println(contents[i]);
		
	}
	

}
}