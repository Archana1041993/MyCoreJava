package january12;

public class NewBike {
	
	String name;
	int speed;
	int gears;
	 
	NewBike(String iname,int ispeed,int igears){
		
		name=iname;
		speed=ispeed;
		gears=igears;
	}
	void displayName(){
		System.out.println("The name of the Bike is:" + name);
	}
	
	void displaySpeed(){
		System.out.println("The max speed is:" + speed);
	}
	
	int returngear(){
		return gears;
		
	}

}
