// A program to convert distance in kilometers to miles.


import java.util.Scanner;

class milesconvert{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the distance in kilometres: ");
		double km= input.nextInt();
		
		double miles= km*0.62;    //1 km = 0.62 miles
		
		System.out.println("The total miles is "+miles+" mile for the given "+km+" km");
	}
}