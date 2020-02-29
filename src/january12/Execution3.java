package january12;

public class Execution3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NewBike pulsar = new NewBike("pulsar",10,5);
		pulsar.displayName();
		pulsar.displaySpeed();
		
		int gear = pulsar.returngear();
		System.out.println("the max gear is" + gear);
		

	}

}
