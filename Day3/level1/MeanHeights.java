

import java.util.Scanner;

public class MeanHeights {
	public static void main(String args[]){
		
		Scanner input = new Scanner(System.in);
		
		int[] heightValue = new int[11];
		
		int sum = 0 ;
		
		//Storing value of the height   
		
		for (int i = 0 ; i<heightValue.length; i++){
			
			System.out.println("Enter the height of the player"+(i+1)+": ");
			
			int height = input.nextInt();
			 
			heightValue[i] = height;
			
			sum += heightValue[i];			
			
		}
		
		//Printing Mean height of the football player 
		
		System.out.println("Mean Height: "+(sum/11));
	}
}