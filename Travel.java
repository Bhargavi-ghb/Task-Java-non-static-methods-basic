public class Travel{
	public String getBookingDetails(String agency, String destination, int travellers){
	return 	"Agency :"+agency + "\nDestination:"+destination + 
"\nTravellers:" +travellers;
}
	public  static void main(String [] args){
		Travel travel=new Travel();
		String details=travel.getBookingDetails("Wanderlust Travels ","Paris",2);
		String details1=travel.getBookingDetails("Wanderlust","Tokyo",3);
		System.out.println(details);
		System.out.println("----------------------");
		System.out.println(details1);

	}
}