public class ClipsRunner{
	public static void main(String []args){
	//
	Clips.clips("video clips");
	Clips.clips(20);
	Clips.clips(5.9);
	
	
	System.out.println("clipvideo details:"+Clips.name);
	System.out.println("clipvideo details:"+Clips.duration);
	System.out.println("clipvideo details:"+Clips.noOfPhoto);
	String returns=Clips.clips("swati");
	
	System.out.println("clipvideo details"+returns);
	int value=Clips.clips(35);
	System.out.println("clipvideo details"+value);

	}

}