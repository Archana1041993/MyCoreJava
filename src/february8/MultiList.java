package february8;

import java.util.ArrayList;

public class MultiList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<ArrayList<Integer>> lists = new ArrayList<>();

		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		ArrayList<Integer> list3 = new ArrayList<>();
		
		list1.add(1);
		list1.add(2);
		list1.add(3);
		
		list2.add(4);
		list2.add(5);
		list2.add(6);
		list2.add(7);
		
		list3.add(8);
		list3.add(9);
		list3.add(10);
		list3.add(11);
		list3.add(12);
		
		System.out.println(list1);
		System.out.println(list2);
		System.out.println(list3);
		
		lists.add(list1);
		
		
		
		
		
		
	}

}
