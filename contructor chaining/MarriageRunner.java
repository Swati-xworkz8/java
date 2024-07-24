public class MarriageRunner{
public static void main(String []args){
Marriage marriage = new Marriage("gouri",23,"B.E",4.8f);
System.out.println(marriage);


boolean value=marriage.getProfileDetails("gouri");
System.out.println(value);
marriage.getProfileDetails("rashmi");

String value1=marriage.getProfileDetails("gouri",23);
marriage.getProfileDetails("gouri",23);

}
}