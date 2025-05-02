public class Patient{
	public void printDetails(String hospitalName, String patientName, int age) {
	System.out.println("Hospital Name  :"+hospitalName);
	System.out.println("Patient Name :"+patientName);
	System.out.println("Patient Age:"+age);
	}
	public  static void main(String [] args){
		Car car=new Car();
		car.displayDetails("City Care Hospital","John Doe",45);
		car.displayDetails("City Care Hospital","Emma Watson",30);

	}
}