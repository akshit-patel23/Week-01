import java.util.Scanner;

class MultipleValues {
	public static void main(String args[]){
		Scanner input= new Scanner(System.in);
		
		double [] numbers ;						//Declaring Array 
		numbers =new double [10];										
		
		int i=0;
		while(true){
			System.out.printfs("Enter value"+(i+1)+" :");   
			double n=input.nextInt();
			if(n<=0){
				break;
			}
			numbers[i]=n;
			i++;
		}
		double total=0;
		for(int j=0;j<numbers.length;j++){
			total+= numbers[j];		             //Calculating total
		}
		System.out.println("Total sum of numbers :"+total);
		
	}
}