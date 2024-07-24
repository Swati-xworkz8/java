public class ChipsRunner{
public static void main(String[] args){
Chips chips=new Chips();
System.out.println("chips character:"+chips);

Chips chips1=new Chips("alo chips");
System.out.println("chips character:"+chips1);

Chips chips2=new Chips("alo chips",10);
System.out.println("chips character:"+chips2);

Chips chips3=new Chips("alo chips",10,"round");
System.out.println("chips character:"+chips3);
Chips chips4=new Chips("alo chips",10,"round",true);
System.out.println("chips character:"+chips4);
Chips chips5=new Chips("alo chips",10,"round",true,'C');
System.out.println("chips character:"+chips5);
Chips chips6=new Chips("alo chips",10,"round",true,'C');
System.out.println("chips character:"+chips6);
Chips chips7=new Chips("alo chips",10,"round",true,'C',(short)6);
System.out.println("chips character:"+chips7);
}
}