public class Ticket{
	public String getTicketInfo(String theaterName, String movieName, String seatNo){
	return 	"Theater Name:"+theaterName + "\nMovie Name:"+movieName + 
"\nSeatNo:" +seatNo;
}
	public  static void main(String [] args){
		Ticket ticket=new Ticket();
		String details=ticket.getTicketInfo("Galaxy Cinemas","Interstellar","A10");
		String details1=ticket.getTicketInfo("Galaxy Cinemas","Inception","B12");
		System.out.println(details);
		System.out.println("----------------------");
		System.out.println(details1);

	}
}