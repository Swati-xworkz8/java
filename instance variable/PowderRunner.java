public class PowderRunner{
public static void main(String []args){
Powder.name="whitetone";
Powder.company="whitetone";

Powder.noOfContent=9;
Powder.height=16;//cm

Powder.weight=0.1f;
Powder.liter=0.05f;

System.out.println("powder name:"+Powder.name);
System.out.println("powder company:"+Powder.company);
System.out.println("noOfContent"+Powder.noOfContent);
System.out.println("height"+Powder.height);
System.out.println("weight"+Powder.weight);
System.out.println("liter"+Powder.liter);

new Powder();

Powder powder=new Powder();
System.out.println("power:"+powder);

powder.names="whitetone";
powder.companys="whitetone";

powder.noOfContents=9;
powder.heights=16;//cm

powder.weights=0.1f;
powder.liters=0.05f;

System.out.println("name"+powder.names);
System.out.println("company"+powder.companys);
System.out.println("noOfContent"+powder.noOfContents);
System.out.println("height"+powder.heights);
System.out.println("weight"+powder.weights);
System.out.println("liter"+powder.liters);

}
}