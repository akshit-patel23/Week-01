import java.util.Scanner;

class trianglearea{
	public static void main(String args[]){
	Scanner input= new Scanner(System.in);
	
	System.out.println("Enter the base :");
	int base = input.nextInt();
	System.out.println("Enter the height :");
	int height = input.nextInt();
	
	double area= 0.5*(base*height);			//Area of Triangle= 0.5*base*height
	
	System.out.println("Area of triangle is :"+area);
	
	}
	
	
}