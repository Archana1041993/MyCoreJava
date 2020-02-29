package january12;

public class execution2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		
	   Bike obj = new Bike();
          obj.display();
          obj.displayspeed(100);
          int gear = obj.returnGear();
          System.out.println("The number of gear is" +gear);
          
          
	}

}
