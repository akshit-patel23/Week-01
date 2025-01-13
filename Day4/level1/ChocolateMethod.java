//Import Scanner class for taking the user input in program.
import java.util.Scanner;

// Create a class ChocolateMethod for calculating the chocolates for each children and remaining chocolates.
public class ChocolateMethod{
	
	public static int[] findRemainderAndQuotient(int totalChocolates, int totalChildrens){
		
	//Create the variable chocolatesPerChildren for calculating chocolates for each children.
		int chocolatesPerChildren = totalChocolates / totalChildrens;
		
		//Create the variable remainingChocolates for calculating remaining chocolates after the distribution.
		int remainingChocolates = totalChocolates % totalChildrens;
		
		int arr[] = new int[2];
		
		arr[0] = chocolatesPerChildren;
		arr[1] = remainingChocolates;
		
		return arr;
		
		
	}
	
	public static void main(String args[]){
		
		//Create object of scanner class sc for taking input.
		Scanner sc = new Scanner(System.in);
		
		//Create the variable totalChocolates for the total number of chocolates.
		System.out.println("Enter the number of chocolates: ");
		int totalChocolates = sc.nextInt();
		
		//Create the variable totalChildrens for total number of childrens.
		System.out.println("Enter the number of childrens: ");
		int totalChildrens = sc.nextInt();
		
		int[] arr = new int[2];
		
		arr = findRemainderAndQuotient(totalChocolates,totalChildrens);
		
		//Print the remaining pen and pen per person
		System.out.println(" The number of chocolates each child gets is "+ arr[0]+" and the number of remaining chocolates are "+ arr[1]);
		
		
	}
}