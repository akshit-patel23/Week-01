import java.util.Scanner;

class CharacterArray{
	
	public static char[] stringToCharArr(String s){		// User defined Method to convert strings to array of characters 
		char[]arr= new char[s.length()];
		
		for (int i=0;i<s.length();i++){
			arr[i]=s.charAt(i);
			
		}
		return arr;
	}
	
	static boolean isEqual(char[] arr1, char[] chararr){ //method to check both character arrays are equal or not
		if(arr1.length!=chararr.length){
			System.out.println(chararr.length);
			
			return false;
		}
		for(int i=0;i<chararr.length;i++){
				if(arr1[i]!= chararr[i]){
					return false;
				}
		}
		
		return true;
	}
	
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a string :"); 
		String s=input.next();					//taking string input
		
		
		char[]arr1 =stringToCharArr(s);			
		System.out.println("char array without using user defined method ");
		for(char x:arr1){
			System.out.println(x);
		}
		
		char[]chararr=s.toCharArray();
		System.out.println("char array without using toCharArray() ");
		for(char ch:chararr){
			System.out.println(ch);
		}
		
		
		boolean res=isEqual(arr1,chararr);			
		if(res){
			System.out.println("character array from user defined method and toCharArray() method is equal");
		}
		else{
			System.out.println("character array from user defined method and toCharArray() method is not equal");
		}
		
}
}