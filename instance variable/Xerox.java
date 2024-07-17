public class Xerox{
public Xerox(){
System.out.println("near by Xerox shop name is Student Xerox");
}
public int noOfXerox;
public float sizeOfPaper;
public String name;
public short price;
public int[] noOfPages;

public Xerox(int noOfXerox,float sizeOfPaper,String name,short price,int[] noOfPages){
this.noOfXerox=noOfXerox;
this.sizeOfPaper=sizeOfPaper;
this.name=name;
this.price=price;

System.out.println("noOfXerox:"+noOfXerox);
System.out.println("sizeOfPaper:"+sizeOfPaper);

System.out.println("name:"+name);
System.out.println("price:"+price);

System.out.println("noOfPages:");
for(int i=0;i<noOfPages.length;i++){
System.out.println(noOfPages[i]);
}

} 
}