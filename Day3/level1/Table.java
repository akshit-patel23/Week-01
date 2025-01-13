import java.util.Scanner;

class Table{
	public static void main(String args[]){
		Scanner input= new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = input.nextInt();
		
		int [] product ;
		product =new int [10];										//calculating product
		
		for(int i=0;i<10;i++){
			product[i]=num*(i+1);
			
			System.out.println(num +"*"+ (i+1)+" = "+product[i]);   //printing table
		}
		
		
	}
}