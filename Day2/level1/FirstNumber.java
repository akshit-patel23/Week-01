import java.util.Scanner;

class FirstNumber{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the first number :");
		int num1= input.nextInt();
		
		System.out.println("Enter the Second number :");
		int num2= input.nextInt();
		
		System.out.println("Enter the third number :");
		int num3= input.nextInt();
		
		System.out.println("Is the first number the smallest? ");
		
		if(num1<num2){
			if(num1<num3){
				System.out.println("Yes");
			}
			else{
				System.out.println("No");
			}
		}
		
		
		
	}
}