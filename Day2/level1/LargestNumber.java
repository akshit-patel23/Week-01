//a program to check if the first, second, or third number is the largest of the three.

import java.util.Scanner;

class LargestNumber{
	public static void main(String args[]){
		
		Scanner input= new Scanner (System.in);
			
			System.out.println("Enter the first number :");
			int num1=input.nextInt();
			
			System.out.println("Enter the Second number :");
			int num2= input.nextInt();
			
			
			System.out.println("Enter the Third number :");
			int num3= input.nextInt();
			
			
			System.out.println("Is the first number the largest?");
			if((num1>num2) && (num1>num3)){
				System.out.println("Yes");
			}
			else{
				System.out.println("No");
			}
			
			System.out.println("Is the second number the largest?");
			
			if((num2>num1)&& (num2>num3)){
				System.out.println("Yes");
			}
			else{
				System.out.println("No");
			}
			
			System.out.println("Is the third number the largest?");
			if((num3>num1)&& (num3>num2)){
				System.out.println("Yes");
			}
			else{
				System.out.println("No");
			}
			
		
	}
}