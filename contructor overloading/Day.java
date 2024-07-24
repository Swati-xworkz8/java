public class Day{
public static void main(String [] args){
String[] day={"Sunday","monday","Saturday"};
for(int i=0;i<day.length;i++){
if (day[i]=="Saturday" || day[i]=="Sunday"){
System.out.println("it's a weekend:"+day[i]);
}else{
	System.out.println("it's not a weekend:"+day[i]);
}
}
}
}