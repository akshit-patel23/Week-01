import java.util.Scanner;

class NumArray{
	public static void main(String args[]){
		Scanner input= new Scanner(System.in);
		
		int [] arr;
		arr = new int[5];
		
		for(int i=0;i<arr.length;i++){
			System.out.println("Enter the "+(i+1)+" number");
			arr[i]= input.nextInt();
			
		}
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]>0){
				System.out.println(arr[i] +" is a positive number");
				if(arr[i]%2==0){
				System.out.println(arr[i] +" is an even number");
				}
				else{
					System.out.println(arr[i]+" is an odd number");
				}
			}
			else if(arr[i]<0){
				System.out.println(arr[i]+" is a negative number");
				
			}
			else{
				System.out.println(arr[i]+" is zero");
			}
			
		}
		
		System.out.println("Comparison between the 1st element and the last element");
		
		if(arr[0]>arr[arr.length-1]){
			System.out.println("The first element is greater than the last elements ");
		}
		else if(arr[0]<arr[arr.length-1]){
			System.out.println("The last element is greater than the first element ");
		}
		else{
			System.out.println("The first and last elememts are equal");
		}
		
	}
}