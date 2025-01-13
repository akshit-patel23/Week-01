import java.util.Scanner;

class Nchocolates{
	public static void main(String args[]){
		Scanner input= new Scanner(System.in);
		
		System.out.println("Enter the number of chocolates :");
		int chocolates=input.nextInt();
		
		System.out.println("Enter the number of Students :");
		int students= input.nextInt();
		
		System.out.println("The number of chocolates each child gets is"+chocolates/students+"and the number of remaining chocolates are"+chocolates%students);
	}
}