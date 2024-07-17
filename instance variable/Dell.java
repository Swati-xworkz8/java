public class Dell{
public String company;
public float storage;
public short version;
public int price;
public double[] series;
public Dell(String company,float storage,short version,int price,double[] series){
this.company=company;
this.storage=storage;
this.version=version;
this.price=price;
System.out.println("company:"+company);
System.out.println("storage:"+storage);
System.out.println("version:"+version);
System.out.println("price:"+price);
System.out.println("series:");

for(int i=0;i<series.length;i++){
System.out.println(series[i]);
}

}
}