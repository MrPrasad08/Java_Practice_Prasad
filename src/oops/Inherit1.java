package oops;

class Vehicle {

	Vehicle(){
		
	}
	void Gears() {
		System.out.println("Parent Gears Method...!!");
	}

	void VehicleType() {
		System.out.println("Vehicle Type Parent Class method...!!");
	}
}

class Car extends Vehicle {
	
	void msg() {
		System.out.println("Heyy this is Car Class...!!");
	}
}

public class Inherit1 {
	public static void main(String[] args) {
//		Car c = new Car();
//		c.Gears();
	}
}
