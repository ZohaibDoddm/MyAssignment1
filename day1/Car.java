package week1.day1;

public class Car {
	
	String carename ="hyundai";
	int count= 75;
	String counte = "yooo";
	
	public void driveCar() {
     System.out.println(count);
     System.out.println(counte);
	}
	
	public void applybrake() {
		//int count= 88;
     System.out.println("apply brakes");
  //   System.out.println("count is " +count);
  
	}
	
	public static void main(String[] args) {
		Car myCar = new Car();
	}

}
