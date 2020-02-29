package february9;

import java.util.ArrayList;
import java.util.HashMap;

public class MapWithList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, ArrayList<String>> map = new HashMap<>();
		ArrayList<String> list1 = new ArrayList<>();
		
		list1.add("Ampl Palekar");
		list1.add("Finance");
		list1.add("Tester");
		list1.add("Java");
		
		map.put(11111, list1);
		
		System.out.println(map);
		
		ArrayList<String> list2 = new ArrayList<>();
		
		list2.add("Archana");
		list2.add("SBU");
		list2.add("Tester");
		
		map.put(22222, list2);
		System.out.println(map);
		System.out.println(map.get(11111));
		System.out.println(map.get(11111).get(2));
		System.out.println(map.get(22222).get(0));
		

	}

}
