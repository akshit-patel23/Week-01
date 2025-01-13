//Create a program to find all the multiple of a number taken as user input below 100.


import java.util.Scanner;

public class MultiplesUnder100 {
    public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);

         
		System.out.print("Enter a number to find its multiples below 100: ");
        int number = scanner.nextInt();

        System.out.println("Multiples of " + number + " below 100 are:");

        // Find all multiples of the number below 100
        int num=number;
		int count=1;
		int multiple=num*1;
		
		while(multiple<100){
			
			System.out.println(multiple);
			count++;
			multiple=num*count;
			
			}
			
    }
}



