package february8;

import java.util.ArrayList;

public class ArrayExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> obj = new ArrayList<>();
		
		obj.add(1);
		obj.add(2);
		obj.add(2, 3);
		obj.add(3,4);
		System.out.println(obj.clone());
		
		//obj.clone();

	}

}
