public class TvChannelRunner{
public static void main(String []args){
TvChannel tvChannel=new TvChannel();
System.out.println(tvChannel);


short[] channelNo={1,3,6,7,8,3,6,10};
TvChannel tvChannel1= new TvChannel("pogo","black and white",80,channelNo);
System.out.println("tv channels nums :"+tvChannel1);
}

}