public class Xworkz{
	
public static void method(String name,int price,double discount){
	if(name=="laptop"||name=="plant"||name=="chair"||name=="bag"||name=="pen"||name=="cloth"){
		double total;
        total=price-(price*discount);
		System.out.println(name+" "+"price:"+price+" "+"discount:"+discount+" "+"total:"+total);
	}else{
		System.out.println("name is not given");
	}
}

}
