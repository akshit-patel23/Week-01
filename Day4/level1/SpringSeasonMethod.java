// Create SpringSeasonMethod class to check if the given date falls in the Spring season
import java.util.Scanner;

class SpringSeasonMethod {

	public String springChecker(int month , int day){
		// Check if the date is within the Spring season (March 20 to June 20)
        if ((month == 3 && day >= 20) || (month > 3 && month < 6) || (month == 6 && day <= 20)) {
            return "It's a Spring Season.";
        } else {
            return "Not a Spring Season."; 
        }
	}
    public static void main(String[] args) {
        
        // Declare variables for month and day
        int month, day;
        
        // Create a Scanner object to read input from the user
        Scanner input = new Scanner(System.in);
        
        // Taking input for the month and day
        System.out.print("Enter month (1-12): ");
        month = input.nextInt();
        
        System.out.print("Enter day (1-31): ");
        day = input.nextInt();
        
		//Initializing the class SpringSeasonMethod 
		
		SpringSeasonMethod spring = new SpringSeasonMethod();
		
		System.out.println(spring.springChecker(month,day));
        
    }
}
