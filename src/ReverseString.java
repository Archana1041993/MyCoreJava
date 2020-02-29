import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Please Enter a String");
		String value = obj.nextLine();
		reverseString(value);
		
		}
	
	static void reverseString(String input){
		String reverse="";
		int length = input.length();
		for(int i = length-1;i>=0;i--){
			reverse = reverse + input.charAt(i);//passing an index in char at and it start with 0
		}
		System.out.println("reverse String"+" "+reverse);
			
		}
		
		

	}


