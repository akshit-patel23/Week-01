import java.util.Scanner;

 public class Vote{
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		int[] age;				//Declaring array age
		age=new int[10];		//Allocating memory for 10 integers
		
		for(int i=0;i<age.length;i++){
			System.out.println("Enter the age of "+(i+1)+" Student :");
			
			age[i]= input.nextInt();
		}
		
		
		//Checking Eligibility to Vote
		for(int i=0;i<age.length;i++){
			if(age[i]<0){
				System.out.println("Invalid age");
			}
			else if(age[i]>=18){
				System.out.println("The student with the age "+age[i]+" can vote");
			}
			else{
				System.out.println("The student with the age "+age[i]+" cannot vote");
			}
		}
	}
}