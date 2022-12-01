package oopD3;

class Vehicle {
	int wheels = 4;
}
public class Demo {
	int x = 5;

	public static void main(String[] args) {
		Vehicle myObject = new Vehicle();
		System.out.println(myObject.wheels);
		interface Vehicle { 
			void changeGear(int a); 
			void accelerate(int a); 
			void brake(int a); 
			class Motorcycle implements Vehicle{ 

				} 
			} 


		} 
	}
}