package january18;

public class Excecution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		Car Ciaz = new Car("Maruti Ciaz","Gear",2019);
        Ciaz.ChangeGear(2);
       int speed= Ciaz.accelerate();
        System.out.println("Maximum speed is"+speed);

	}

}
