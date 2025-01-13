import java.util.Scanner;

class NaturalNumber{
 public static void main(String args[]){
	 Scanner input=new Scanner(System.in);
	 
	 System.out.println("Enter n :");
	 int n= input.nextInt();
	 
	 int sum = n * (n+1) / 2 ;
	 
	 if(n>0){
		 System.out.println("The sum of "+n+"natural numbers is "+sum);
	 }
	 else{
		 System.out.println("The number "+n+" is not a natural number");

	 }

	 
 }
}