import java.util.Scanner;

class calculator{
public static void main(String args[]){
	Scanner input= new Scanner(System.in);
	
	System.out.println("Enter two numbers :");
	
	float x=input.nextFloat();
	float y=input.nextFloat();
	
	System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "+x+" and "+y+" is "+(x+y)+" , "+(x-y)+" , "+(x*y)+" and "+x/y);
	
}
}