package january18;

public class Car {
	String name;
	String color;
	int year;
	
	Car(String iname,String icolor,int iyear){
		name=iname;
		color=icolor;
		year=iyear;
	}
	void ChangeGear(int GearNo){
		System.out.println("Changing to gear"+ GearNo);
	}

	int accelerate(){
		int speed=10; //local variables-variables declared in only one method.we cant acces in other method
		return speed;
		
	}
}
