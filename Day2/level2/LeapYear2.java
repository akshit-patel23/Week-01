import java.util.Scanner;

public class LeapYear{
	public static void main(String []args){
		System.out.println("Enter a year to check for Leap Year: ");  
									
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();

		
		if(year>=1582){
			if((year%400==0)||((year%4==0) && (year%100!=0))){
				System.out.println(year+ " Year is a leap year");
			}
		}
		else {
			System.out.println(year+ " year it is not a leap year");
		}
		sc.close();
	}
}