import java.util.Scanner;

class Multiplication{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number :");
		int x= input.nextInt();
		int [] multiples;
		multiples = new int[10];
		
		if(x>=6 && x<9){
			for(int i=0;i<multiples.length;i++){
				multiples[i]=x*(i+1);					
				
				System.out.println(x+" * "+(i+1)+" = " +multiples[i]);
			}
		}
		else{
		System.out.println("Enter a number from 6 to 9");
		}
		
	}
}