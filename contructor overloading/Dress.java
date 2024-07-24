public class Dress{
public String name;
public int noOfdress;
public boolean correctSize;
public short size;
public char sizes;

public Dress(){
System.out.println("dress is beautiful");
} 
public Dress(String name){
this.name=name;
System.out.println("name:"+name);
} 
public Dress(String name,int noOfdress){
this.name=name;
this.noOfdress=noOfdress;
System.out.println("name:"+name+" "+"noOfdress:"+noOfdress);
} 
public Dress(String name,int noOfdress,boolean correctSize){
this.name=name;
this.noOfdress=noOfdress;
this.correctSize=correctSize;
System.out.println("name:"+name+" "+"noOfdress:"+noOfdress+" "+"correctSize:"+correctSize);
}
public Dress(String name,int noOfdress,boolean correctSize,short size){
this.name=name;
this.noOfdress=noOfdress;
this.correctSize=correctSize;
this.size=size;
System.out.println("name:"+name+" "+"noOfdress:"+noOfdress+" "+"correctSize:"+correctSize+" "+"size:"+size);
}
public Dress(String name,int noOfdress,boolean correctSize,short size,char sizes){
this.name=name;
this.noOfdress=noOfdress;
this.correctSize=correctSize;
this.size=size;
this.sizes=sizes;
System.out.println("name:"+name+" "+"noOfdress:"+noOfdress+" "+"correctSize:"+correctSize+" "+"size:"+size+" "+"sizes"+sizes);
}

}