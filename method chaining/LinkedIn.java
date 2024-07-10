public class LinkedIn{
	public static void profileDetails(String details){
	System.out.println("profile Details:"+details);
	LinkedIn.educationDetails("qualification");
	LinkedIn.profileDetails(10);
	LinkedIn.skills(5);
	LinkedIn.percentageOfDegree("85%");
	}
	public static void educationDetails(String details){
			System.out.println("educationDetails:"+details);
			LinkedIn.profileDetails(details);
	}
	public static void profileDetails(int noOfDetails){
		System.out.println("profile Details:"+noOfDetails);
		LinkedIn.profileDetails(noOfDetails);
	}
	public static void skills(int noOfSkill){
		System.out.println("skills"+noOfSkill);
		LinkedIn.profileDetails(noOfSkill);
	}
	public static void percentageOfDegree(String percentage){
		System.out.println("percentage Of Degree:"+percentage);
		LinkedIn.profileDetails(percentage);
	}
}