public class Positive{
public static void main(String [] args){
int p=0;
int n=0;
int[] num={1,-3,-5,3,5,9,-1,3,0};
for(int i=0;i<num.length;i++){
if(num[i]<0){
n++;
}else{
p++;
}
}
System.out.println("positive:"+p+"negative:"+n);
}
}