import java.util.Scanner;

class handshakes{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of students :");
		
		int n= input.nextInt();
		int handshakes = (n * (n - 1)) / 2;
		
		System.out.println("Number of possible handshakes :"+handshakes);
	}
}