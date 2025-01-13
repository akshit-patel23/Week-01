//Write a program to check if a number is divisible by 5


import java.util.Scanner;

class DivisibleBy5{
	public static void main(String args[]){
		Scanner input= new Scanner(System.in);
		System.out.println("Enter a number :");
		int num= input.nextInt();
		System.out.println("Is the number "+num+"  divisible by 5? ");
		if(num%5==0){   			// Number divisible by 5 leaves remainder as 0
			System.out.printf("Yes");
		}
		else{
			System.out.printf("No");
		}
	}
}