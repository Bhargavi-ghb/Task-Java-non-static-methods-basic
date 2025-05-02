public class Mobile{
	public void showDetails(String storeName, String brand, int price){
	System.out.println("Store Name  :"+storeName);
	System.out.println("Mobile Brand :"+brand);
	System.out.println("Mobile Price : :"+price);
	}
	public  static void main(String [] args){
		Car car=new Car();
		car.displayDetails("Tech World","Apple",1200);
		car.displayDetails("Tech World","Samsung",900);

	}
}