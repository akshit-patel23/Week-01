//Import Scanner class for taking the user input in program.
import java.util.Scanner;


public class SinCoseTheta{
	
	public static double[] calculateTrigonometricFunctions(double angle){
		double[] result = new double[3];
		
		double Radians = Math.toRadians(angle);

        // Calculate sine, cosine, and tangent of the angle
        result[0]  = Math.sin(Radians);
        result[1]  = Math.cos(Radians);
        result[2]  = Math.tan(Radians); 
		
		return result;
			
	}
	
	public static void main(String args[]){
		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the angle: ");
		double angle = sc.nextDouble();
		
		
		//Function call
		double[] result = new double[3];
		result= calculateTrigonometricFunctions(angle);
		
		//Print result
		 System.out.printf("\nTrigonometric Functions for %.2f degrees:\n", angle);
         System.out.printf("Sine: %.4f\n", result[0]);
         System.out.printf("Cosine: %.4f\n", result[1]);

            // Handle undefined tangent for angles like 90° or 270°
            if(Double.isInfinite(result[2])){
                System.out.println("Tangent: Undefined (infinite)");
            } 
			else{
                System.out.printf("Tangent: %.4f\n", result[2]);
            }
	}
}