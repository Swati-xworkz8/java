public class DoorRunner{
public static void main(String []args){

//static
Door.name="wooden door";
Door.color="chocolate";
Door.noOfDoor=8;
Door.noOfLayer=5;
Door.handlePresent=true;
Door.makeSound=true;
Door.serialNum=8765434567L;
Door.phPayNum=9875678766L;
Door.size=1.5f;
Door.height=2.8f;

System.out.println("door name:"+Door.name);
System.out.println("door color:"+Door.color);
System.out.println("no of doors:"+Door.noOfDoor);
System.out.println("no of layers:"+Door.noOfLayer);
System.out.println("handlePresent:"+Door.handlePresent);
System.out.println("makeSound:"+Door.makeSound);
System.out.println("serialNum:"+Door.serialNum);
System.out.println("phPayNum:"+Door.phPayNum);
System.out.println("size:"+Door.size);
System.out.println("height:"+Door.height);

new Door();

Door door = new Door();
System.out.println("door details:"+door);

door.names="wooden door";
door.colors="chocolate";
door.noOfDoors=8;
door.noOfLayers=5;
door.handlePresents=true;
door.makeSounds=true;
door.serialNums=8765434567L;
door.phPayNums=9875678766L;
door.sizes=1.5f;
door.heights=2.8f;


System.out.println("name:"+door.names);
System.out.println("color:"+door.colors);
System.out.println("noOfDoor:"+door.noOfDoors);
System.out.println("noOfLayers:"+door.noOfLayers);
System.out.println("handlePresent:"+door.handlePresents);
System.out.println("makeSound:"+door.makeSounds);
System.out.println("serialNum:"+door.serialNums);
System.out.println("phPayNum"+door.phPayNums);
System.out.println("size:"+door.sizes);
System.out.println("height:"+door.heights);
}
}