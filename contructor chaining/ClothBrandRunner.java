public class ClothBrandRunner{
public static void main(String []args){
ClothBrand cloth=new ClothBrand();

cloth.getArrayLength();

cloth.save("Nike");
cloth.save("trends");
cloth.save("max");
cloth.save("prada");
cloth.save("zara");

String name=cloth.read();
System.out.println(name);

String[] value={"nike","trends","max","prada"};
String name1=cloth.search(value);
System.out.println(name1);
}

}