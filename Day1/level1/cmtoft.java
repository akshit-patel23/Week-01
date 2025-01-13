import java.util.Scanner;

class cmtoft{
public static void main(String args[]){
	Scanner input= new Scanner(System.in);
	System.out.println("Enter height in cm :");
	
	double cm= input.nextFloat();
	
	double ft= cm/(2.54*12);
	
	double inches = (ft-(int)ft)*12;    
	
	
	
	
	System.out.println(" Your Height in cm is "+cm+" while in feet is "+(int)ft+" and inches is "+(int)inches);
	
}
}