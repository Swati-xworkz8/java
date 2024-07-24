public class House{
	public String name;
	public int houseNo;
	public boolean isSeaSide;
	//public char initial;
	//public double height;
	
	
	public House(String name){
	this((int)18);
	this.name=name;
	System.out.println("house name:"+name);
	}
	public House(int houseNo){
	this.name=name;
    this.houseNo=houseNo;
	System.out.println("house name:"+name+" "+"houseNo:"+houseNo);
	}
	
    public House(String name,int houseNo,boolean isSeaSide){
	this((int)56);

	this.name=name;
    this.houseNo=houseNo;
	this.isSeaSide=isSeaSide;
	System.out.println("house name:"+name+" "+"houseNo:"+houseNo+" "+"is SeaSide:"+isSeaSide);
	}
	  
	
}