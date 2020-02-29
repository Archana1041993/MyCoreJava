package february2;

import java.util.Scanner;

public class DivideByZeroException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a number");
		int x = obj.nextInt();
		
		int z = 0;

		
		System.out.println("Enter another number");
		int y = obj.nextInt();
		
		try{
	
			z = x/y;//two exception cant handled in only one try catch block
					//multiple catch can be possible in one try
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("Exception occured" + e.getMessage());
			z = 5;
			
		}
		
		System.out.println("value of z" +z);
		for(int i=1;i<=z;i++){
			System.out.println(i);
		}
		
		

	}

}
