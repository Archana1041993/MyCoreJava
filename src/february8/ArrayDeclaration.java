package february8;

public class ArrayDeclaration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers = new int[10];
		
		// System.out.println(numbers[1]);
		
		numbers[0] = 1;
		numbers[1] = 2;
		numbers[2] = 3;
		
		for(int i = 0; i < numbers.length; i++){
			System.out.println(numbers[i]);
		}

	}

}
