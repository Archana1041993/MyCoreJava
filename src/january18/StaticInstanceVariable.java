package january18;

public class StaticInstanceVariable {
	int counter=0;
	static int counter1=0;
	
	void increment(){
		counter++;
		counter1++;
	}
     void dispaly(){
    	 System.out.println("counter:" + counter);
    	 System.out.println("counter1:" + counter1);

    }
}

   