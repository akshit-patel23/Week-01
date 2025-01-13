import java.util.Scanner;
class unidiscount{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter fee :");
		
		double fee= input.nextInt();
		
		System.out.println("Enter Discount Percentage:");
		
	    double discountPercent = input.nextInt();
		
		double discount = (discountPercent/100)*fee; 
		
		System.out.println("The discount amount is INR  "+discount+" and final discounted fee is INR "+(fee-discount));
	}
}