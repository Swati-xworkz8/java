public class Plane{
int index =0;

String[] plane=new String[4];

public int getArrayLength(){
return plane.length;
}

public String save(String element){
if(this.index<this.getArrayLength()){
plane[index]=element;
index++;
}
return "save successfully";
}

public String read(){
for(int index=0;index<getArrayLength();index++){
System.out.println("index of element:"+plane[index]);
}
return "read successfully";
}

public String update(String oldElement,String newElement){
for(int index=0;index<getArrayLength();index++){
if(plane[index]==oldElement){
plane[index]=newElement;
return "update successfully";
}

}
return "not upadated";
}

public String delete(String element){
for(int index=0;index<getArrayLength();index++){
if(plane[index]==element){
plane[index]=null;
return "delete successfully";
}
}
return "not deleted";
}
public String search(String element){
	for(int index=0;index<getArrayLength();index++){
		if(plane[index]==element){
			index++;
			return "searched";
		}
	}
	return "not searched";
	
}


}