package Saturday19;

public class If3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 30;
		int y = 60;
		int z = 40;
		 
		/*if(x>y && x>z){
			System.out.println("x is greater than y and z");
			}
		if(y>x && y>z){
			System.out.println("y is greater than x and z");
			}//
		else{
			System.out.println("z is greater than x and y");
		}*/
		
		if(x>y && x>z){
			System.out.println("x is greater than y and z");
			}
		else if(y>z){//else is using for first all condition mentioned if not mention here condition  
			System.out.println("Y is greater than x and z");
		}	
			else{
				System.out.println("z is greater than x and y");
			}
			
		

	}

}
