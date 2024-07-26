public class Bank{
int index =0;
boolean[] toss=new boolean[4];

public int getLength(){
return toss.length;
}

public String arraySave(boolean tosses){
if(this.index<this.getLength()){
toss[index]=tosses;
index++;
return "saved successfully";
}
return "not saved";
}

public String arrayRead(){
for(int index=0;index<getLength();index++){
System.out.println("index of element:"+toss[index]);
}
return "read successfully";
}

public String arrayUpdate(boolean oldToss,boolean newToss){
for(int index=0;index<getLength();index++){
if(toss[index]==oldToss){
toss[index]=newToss;
index++;
return "update successfully";
}
}
return "not updated";
}

public  String arrayDelete(boolean tosses){
for(int index=0;index<getLength();index++){
if(toss[index]==tosses){
toss[index]=false;
index++;
return "Successfully deleted";
}
}
return "not deleted";
}

public String arraySearch(boolean tosses){
	for(int index=0;index<getLength();index++){
		if(toss[index]==tosses){
			index++;
			return "searched";
		}
		
	}
	return "not searched";
	
}
}