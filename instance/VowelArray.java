public class VowelArray{
public static void main(String []args){
char[] array={'a','d','c','v','g','i','o','y'};
for(int i=0;i<array.length;i++){
if(array[i]=='a' || array[i]=='e' || array[i]=='i' || array[i]=='o' || array[i]=='u' ){
System.out.println("it is a vowel:"+array[i]);
}else{
System.out.println("it is a consonents:"+array[i]);
}
}

}

}