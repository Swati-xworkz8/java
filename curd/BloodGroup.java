public class BloodGroup{
int index =0;

char[] group=new char[4];

public int getArrayLength(){
return group.length;
}

public String save(char element){
if(this.index<this.getArrayLength()){
group[index]=element;
index++;
}
return "save successfully";
}

public String read(){
for(int index=0;index<getArrayLength();index++){
System.out.println("index of element:"+group[index]);
}
return "read successfully";
}

public String update(char oldElement,char newElement){
for(int index=0;index<getArrayLength();index++){
if(group[index]==oldElement){
group[index]=newElement;
return "update successfully";
}

}
return "not upadated";
}

public String delete(char element){
for(int index=0;index<getArrayLength();index++){
if(group[index]==element){
group[index]=' ';
return "delete successfully";
}
}
return "not deleted";
}
public String search(char element){
	for(int index=0;index<getArrayLength();index++){
		if(group[index]==element){
			index++;
			return "searched";
		}
	}
	return "not searched";
	
}


}