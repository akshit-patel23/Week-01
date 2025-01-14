import java.util.Scanner;

class SubString{
	
	public static String subStringmethod(String s,int start, int end){
		String res="";
		for(int i=start;i<end;i++){
			res+=s.charAt(i);
		}
		return res;
	}
	public static void main(String args[]){
		Scanner input= new Scanner(System.in);
		System.out.println("Enter a String :");
		String s= input.next();
		
		
		System.out.printf("Enter starting index :");
		int start= input.nextInt();
		
		System.out.printf("Enter ending index :");
		int end=input.nextInt();
		
		String substr1=subStringmethod(s,start,end);
		String substr2=s.substring(start,end);
		
		if(substr1.equals(substr2)){
			System.out.println("Both substrings are equal :"+substr1 +" & " +substr2);
		}
		else{
			System.out.println("Both substrings "+ substr1+" & " +substr2+" are not equal");
		}
		
		
	}
}