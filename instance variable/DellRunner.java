public class DellRunner{
public static void main(String []args){
double[] series={11.2,11.3,11.4,11.6,12.0,13.0};
Dell dell = new Dell("dell",13.1f,(short)13,39000,series);
System.out.println("series:"+dell);
}
}