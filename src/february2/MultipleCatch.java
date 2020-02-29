package february2;

import java.util.Scanner;

public class MultipleCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a string");
		String a = obj.nextLine();
		
		try{
			System.out.println(a.charAt(6));
		}
		catch(StringIndexOutOfBoundsException s){
			System.out.println("Exception"+ s.getMessage());
			int length = a.length();
			System.out.println("max length" +length);
		}
		catch(NullPointerException n){
			System.out.println("Exception"+ n.getMessage());
			a = "pune";
		}
	}

}
