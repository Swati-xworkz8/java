public class Ship{
int index =0;

String[] ship=new String[4];

public int getArrayLength(){
return ship.length;
}

public String save(String element){
if(this.index<this.getArrayLength()){
ship[index]=element;
index++;
}
return "save successfully";
}

public String read(){
for(int index=0;index<getArrayLength();index++){
System.out.println("index of element:"+ship[index]);
}
return "read successfully";
}

public String update(String oldElement,String newElement){
for(int index=0;index<getArrayLength();index++){
if(ship[index]==oldElement){
ship[index]=newElement;
//System.out.println("upadated element:"+newElement);
return "update successfully";
}

}
return "not upadated";
}

public String delete(String element){
for(int index=0;index<getArrayLength();index++){
if(ship[index]==element){
ship[index]=null;
return "delete successfully";
}
}
return "not deleted";
}
public String search(String element){
	for(int index=0;index<getArrayLength();index++){
		if(ship[index]==element){
			index++;
			return "searched";
		}
	}
	return "not searched";
	
}


}