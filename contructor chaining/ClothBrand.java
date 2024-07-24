public class ClothBrand{
public int index=0;

String[] arr=new String[4];

public int getArrayLength(){
return arr.length;
}

public void save(String element){
if(this.index<this.getArrayLength()){
System.out.println("array is not full");
arr[index]=element;
index++;
}else{
System.out.println("array is full");
}
}

public String read(){
for(int index=0;index<getArrayLength();index++){
System.out.println("index:"+index);
}
return "successfully";
}

public String search(String[] elements){
	for(int i=0;i<elements.length;i++){
	if(elements[i]=="nike"||elements[i]=="trends"||elements[i]=="max"){
		System.out.println("element is present");
}else{
	System.out.println("element is not present");
}
	}
return "present";
}

}