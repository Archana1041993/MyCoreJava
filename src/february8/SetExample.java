package february8;

import java.util.HashSet;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set = new HashSet<>();
		
		set.add("Maharashtra");
		set.add("Karnataka");
		set.add("Gujarat");
		set.add("Maharashtra");
		set.add("Gujrat");
		set.add(null);
		set.add(null);
		
		System.out.println(set);
		
	for (String s : set) {
		
		System.out.println(s);
		
	}

	}

}
