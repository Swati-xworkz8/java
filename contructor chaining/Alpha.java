public class Alpha{
int index=0;
char[] arr=new char[6];

public int alpha(){
return arr.length;
}

public String save(char element){
if(this.index<this.alpha()){
arr[index]=element;
index++;

}else{
	System.out.println("array is full");
}
return "successfully created";
}

public String read(){
for(int index=0;index<alpha();index++){

}
return "successfully read";
}
}