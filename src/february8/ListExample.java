package february8;

import java.util.ArrayList;
import java.util.List;



public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> obj = new ArrayList<>();
		
		
		
		obj.add("Pune");
		obj.add("Mumbai");
		obj.add("Nashik");
		obj.add("Solapur");
		obj.add("Akluj");
		obj.add("Pune");
		
		System.out.println(obj);
		
		System.out.println(obj.size());
		
		System.out.println(obj.get(3));
		
		System.out.println(obj.contains("Pune"));
		
		System.out.println(obj.indexOf("Pune"));
		
		List<String> newList = obj.subList(0,3);
		newList.add("Delhi");
		System.out.println(newList);
		
		System.out.println(obj);
		obj.remove("Akluj");
		System.out.println(obj);
		
		for(int i = 0; i<obj.size(); i++){
			System.out.println(obj.get(i) + " ");
		}
		
		for (String value : obj) {
			System.out.println(value);
			
		}
		
		
		
		
		

	}

}
