//Write a program to find the discounted amount and discounted price the student will pay for the course.

class unifee{
	public static void main(String args[]){
		int fee= 12500;
	    double discountPercent = 10;
		double discount = (discountPercent/100)*fee;  //Discount = (Discount Percent/100) * Price
		
		System.out.println("The discount amount is INR  "+discount+" and final discounted fee is INR "+(fee-discount));
	}
}
