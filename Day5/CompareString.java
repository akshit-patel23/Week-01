import java.util.Scanner;

class CompareString{
	public static boolean isEqual(String first,String second){
			
			if(first.length()!=second.length()){     //Comparing Lengths of String
				 return false;
			}
			for(int i=0;i<first.length();i++){
				if(first.charAt(i)!= second.charAt(i)){    //Comparing Characters of string
					return false;
				}
			}
			return true;
	}
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter string 1:");
		String first=input.next();
		System.out.println("Enter string 2:");
		String second =input.next();
		
		boolean  res= isEqual(first,second);
		res= first.equals(second);					//Comparing strings using equals() method
		
		if(res){
			System.out.println("Strings are equal");
		}
		else{
			System.out.println("Strings are not equal");
		}
		
}
}