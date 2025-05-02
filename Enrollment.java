public class Enrollment {
	public String getEnrollmentInfo(String platform, String course, String student){
	return 	"Platform:"+platform + "\ncourse:"+course+ 
"\nstudent:" +student;
}
	public  static void main(String [] args){
		Enrollment enroll=new Enrollment();
		String details=enroll.getEnrollmentInfo("Udemy","Java Programming","Alice");
		String details1=enroll.getEnrollmentInfo("udemy","Web Development","Bob");
		System.out.println(details);
		System.out.println("----------------------");
		System.out.println(details1);

	}
}