import java.util.Scanner;
class totalprice{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the unit price :");
		int unitprice= input.nextInt();
		
		System.out.println("Enter the quantity :");
		int quantity= input.nextInt();
		
		int total= unitprice*quantity; // Total = Unit Price * Quantity
		
		System.out.println("The total purchase price is INR "+total+" if the quantity "+quantity+" and unit price is INR "+unitprice);
		
}
}