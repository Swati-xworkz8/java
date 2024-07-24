public class Shop{
int index=0;
String[] arr=new String[5];

public int shop(){
return arr.length;
}

public String save(String element){
if(this.index<this.shop()){
arr[index]=element;
index++;

}else{
	System.out.println("array is full");
}
return "successfully created";
}

public String read(){
for(int index=0;index<shop();index++){

}
return "successfully read";
}
}