
import java.util.Scanner;

public class TallestAndYoungest {
    public static void main(String[] args) {
		
         Scanner scanner = new Scanner(System.in);

        //Taking age input
        System.out.print("Enter Amar's age: ");
        int ageAmar = scanner.nextInt();
		
        System.out.print("Enter Akbar's age: ");
        int ageAkbar = scanner.nextInt();
		
        System.out.print("Enter Anthony's age: ");
        int ageAnthony = scanner.nextInt();

        //Taking height input
        System.out.print("Enter Amar's height (in cm): ");
        int heightAmar = scanner.nextInt();
		
        System.out.print("Enter Akbar's height (in cm): ");
        int heightAkbar = scanner.nextInt();
		
        System.out.print("Enter Anthony's height (in cm): ");
        int heightAnthony = scanner.nextInt();

      
	   
	   
	   //Checking the youngest one
	   if(ageAnthony<ageAmar&&ageAnthony<ageAkbar){
        System.out.println("The youngest friend is Anthony with age "+ageAnthony+" years.");
	   }
	   else if(ageAmar<ageAnthony&&ageAmar<ageAkbar){
        System.out.println("The youngest friend is Amar with age "+ageAmar+" years.");
	   }
	   else{
        System.out.println("The youngest friend is Amar with age "+ageAkbar+" years.");
	   }
	   
	   //Checking the tallest one
	   if(heightAnthony>heightAmar&&heightAnthony>heightAkbar){
        System.out.println("The tallest friend is Anthony with height "+heightAnthony+" in cm.");
	   }
	   else if(heightAmar>heightAnthony&&heightAmar>heightAkbar){
        System.out.println("The tallest friend is Amar with height "+heightAmar+" in cm.");
	   }
	   else{
        System.out.println("The tallest friend is Akbar with height "+heightAkbar+" in cm.");
	   }
	   
	   
	}
}












