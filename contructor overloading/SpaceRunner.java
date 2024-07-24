public class SpaceRunner{
public static void main(String []args){
Space space =new Space();
System.out.println("space details:"+space);
Space space1 =new Space("milkyway");
System.out.println("space details:"+space1);
Space space2 =new Space("milkyway",8);
System.out.println("space details:"+space2);
Space space3 =new Space("milkyway",8,"sirius");
System.out.println("space details:"+space3);
Space space4 =new Space("milkyway",8,"sirius",true);
System.out.println("space details:"+space4);
Space space5 =new Space("milkyway",8,"sirius",true,'E');
System.out.println("space details:"+space5);
Space space6 =new Space("milkyway",8,"sirius",true,'E',(short)10);
System.out.println("space details:"+space6);
Space space7 =new Space("milkyway",8,"sirius",true,'E',(short)10,987654234567L);
System.out.println("space details:"+space7);

}
}