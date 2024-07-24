public class Hotel{
String nameHotel;
int numOfTables;
char initial; 

public Hotel(String nameHotel){
	this("Swati hotel",9);
this.nameHotel=nameHotel;
	System.out.println("name of the hotel:"+nameHotel);
}
public Hotel(String nameHotel,int numOfTables){
	this("Swati Hotel",9,'S');
this.nameHotel=nameHotel;
this.numOfTables=numOfTables;
	System.out.println("name of the hotel:"+nameHotel+" "+"num of tables:"+numOfTables);
}

public Hotel(String nameHotel,int numOfTables,char initial){
this.nameHotel=nameHotel;
this.numOfTables=numOfTables;
this.initial=initial;
	System.out.println("name of the hotel:"+nameHotel+" "+"num of tables:"+numOfTables+" "+"initial:"+initial);
}

}