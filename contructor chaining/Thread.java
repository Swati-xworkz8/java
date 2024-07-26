public class Thread{
int index =0;

String[] arr=new String[4];

public int getArrayLength(){
return arr.length;
}

public String save(String element){
if(this.index<this.getArrayLength()){
arr[index]=element;
index++;
}
return "save successfully";
}

public String read(){
for(int index=0;index<getArrayLength();index++){
System.out.println("index of element:"+arr[index]);
}
return "read successfully";
}

public String update(String oldElement,String newElement){
for(int index=0;index<getArrayLength();index++){
if(arr[index]==oldElement){
arr[index]=newElement;
System.out.println("upadated element:"+newElement);
return "update successfully";
}

}
return "not upadated";
}

public String delete(String element){
for(int index=0;index<getArrayLength();index++){
if(arr[index]==element){
arr[index]=null;
return "delete successfully";
}
}
return "not deleted";
}

public String search(String element){
	for(int index=0;index<getArrayLength();index++){
		if(arr[index]==element){
			index++;
			return "searched";
		}
	}
	return "not searched";
	
}


}