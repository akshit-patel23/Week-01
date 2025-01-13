
//Importing the Scanner class 
import java.util.Scanner;
//Create Class FootBallDetails for determining the short, tallest meam height of the football player 

public class FootBallDetails{
		//Creating the Function sumOfHeight to calculate the sum 
		public static int sumOfHeight(int[] height){
			int sum = 0 ;
			for (int i = 0 ; i < height.length ; i ++){
				sum += height[i];
			}
			return sum; 
		}
		
		//Creating the Function meanHeight to calculate the mean 
		public static double meanHeight(int sum,int[] height){
			return sum / height.length;
		}
		
		//Creating the Function shortestHeight to find the shortest player 
		
		public static int shortestHeight(int[] height){
			int shortestHeight = 968465416;
			for (int i = 0; i < height.length ; i++){
				
				if (height[i]<shortestHeight){
					shortestHeight = height[i];
				}
			
			}
			return shortestHeight;
		}
		
		//Creating the function tallestHeight to find the tallest player 
		
		public static int tallestHeight(int[] height){
			int tallestHeight = 0;
			for (int i = 0; i < height.length ; i++){
				
				if (height[i]>tallestHeight){
					tallestHeight = height[i];
				}
			}
			return tallestHeight;
		}
		
		public static void main(String args[]){
			//Initializing the array of size 11 to store the player heights
			
			int[] height = new int[11];
			
			//Storing the value By the user
			
			//Scanner class for reading the user input 
			
			Scanner input = new Scanner(System.in);
			
			for (int i = 0 ; i < height.length ; i++){
				
				System.out.println("Enter the player"+(i+1)+" Height");
				
				int elements = input.nextInt();
				
				height[i] = elements;
			}
			
			int sum = sumOfHeight(height);
			int shortestHeight = shortestHeight(height);
			int tallestHeight = tallestHeight(height);
			double meanHeight = meanHeight(sum,height);
			
			System.out.println("Sum of height : "+sum +
								"\nMean Height : "+meanHeight+
								"\nTallest height : " + tallestHeight+
								"\nShortest height : " + shortestHeight
								);
		}
	
	
}