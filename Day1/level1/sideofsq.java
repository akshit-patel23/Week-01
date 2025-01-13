import java.util.Scanner;

class sideofsq{
	public static void main(String args[]){
		Scanner input=new Scanner (System.in);
		System.out.println("Enter the perimeter of square :");
		
		int perimeter= input.nextInt();
		
		int side=perimeter/4;
		
		System.out.println("The length of the side of square is "+side+" whose perimeter is "+perimeter);
	}
}