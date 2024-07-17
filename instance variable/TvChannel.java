public class TvChannel{
public String name;
public String color;
public int noOfChnnael;
public short[] channelNo;

public TvChannel(){
System.out.println("tv channel is pogo");
}

public TvChannel(String name,String color,int noOfChnnael,short[] channelNo){
this.name=name;
this.color=color;
this.noOfChnnael=noOfChnnael;
this.channelNo=channelNo;

System.out.println("name:"+name);
System.out.println("color:"+color);
System.out.println("noOfChnnael:"+noOfChnnael);
System.out.println("channelNo:");

for(int i=0;i<channelNo.length;i++){
System.out.println(channelNo[i]);

}

}
}