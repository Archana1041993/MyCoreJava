package february9;

import java.util.HashMap;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, Integer> map = new HashMap<>();//Key,value=String,Integer
		HashMap<Integer, String> map1 = new HashMap<>();
		
		map1.put(1, "archana");
		
		System.out.println(map1);
		
		
		map.put("Pune", 411028);
		map.put("Solapur", 411011);
		map.put("Mumbai", 400001);
		
		
		map.keySet();
		System.out.println(map.keySet());
		
		System.out.println(map);
		
		System.out.println(map.values());
		
		System.out.println(map.size());
		System.out.println(map.replace("Pune", 411012));
		System.out.println(map);
		
		map.remove("Pune");
		System.out.println(map);
		
		System.out.println(map.containsKey("Solapur"));
		System.out.println(map.containsValue(411015));
		
		System.out.println(map.get("pune"));
		System.out.println(map.get("Pune"));
		System.out.println(map.get("Solapur"));
		map.put("Nashik", 123456);
		System.out.println(map);
		
		for (String key : map.keySet()) {
			System.out.println("Key: " + key +" " + "value: " + map.get(key)) ;
			
		}
		
		for (String Name : args) {
			
		}
		
		
		
		
		
	}

}
