public class GalaxyRunner{
public static void main(String []args){
System.out.println(Galaxy.nameOfGalaxy);
System.out.println(Galaxy.numOfGalaxy);
System.out.println(Galaxy.isMilkyWay);
System.out.println(Galaxy.lightYear);
System.out.println(Galaxy.presentElement);

Galaxy galaxy=new Galaxy("spiral",3000.89,true,1929,'M');
System.out.println(galaxy);
}
}







