public class Prices{
int index=0;
int[] arr=new int[6];

public int prices(){
return arr.length;
}

public String save(int element){
if(this.index<this.prices()){
arr[index]=element;
index++;

}else{
	System.out.println("array is full");
}
return "successfully created";
}

public String read(){
for(int index=0;index<prices();index++){

}
return "successfully read";
}
}