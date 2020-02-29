package Saturday19;

public class IfElseEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 10;
		int y = 20;
		int z = 30;
		
	/*	if( x<y){
			System.out.println("X is smaller than y");
			
			if(x<z){
				System.out.println("X is smaller than z as well");//nesting of if loop
			}
			}*/
		
		if(x<y && x<z){
			System.out.println("x is smaller than y and z");
			
		}
        if(x>y){
	System.out.println("X is greater than Y");
	}
	}

}
