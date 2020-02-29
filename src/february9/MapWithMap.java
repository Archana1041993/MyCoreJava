package february9;

import java.util.ArrayList;
import java.util.HashMap;

public class MapWithMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, HashMap<Integer,ArrayList<String>>> map = new HashMap<>();
		ArrayList<String> list1 = new ArrayList<>();
		ArrayList<String> list2 = new ArrayList<>();
		ArrayList<String> list3 = new ArrayList<>();
		
		HashMap<Integer,ArrayList<String>> details = new HashMap<>();
		HashMap<Integer,ArrayList<String>> details1 = new HashMap<>();
		HashMap<Integer,ArrayList<String>> details2 = new HashMap<>();
		
		list1.add("Archana");
		list1.add("Tester");
		list1.add(".net");
		
		list2.add("Mangesh");
		list2.add("Developer");
		list2.add(".net");
		
		list3.add("Hitesh");
		list3.add("Developer");
		list3.add("Ajax");
		
		details.put(101, list1);
		details1.put(102, list2);
		details2.put(103, list3);
		
		map.put("SBU", details);
		map.put("FSG", details1);
		map.put("Sales", details2);
		
		System.out.println(map);
		
		
		

	}

}
