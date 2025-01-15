import java.util.Scanner;

class ExceptionNullPointer{

public static void generateException(){
	String text=null;
	
	System.out.println("Length of text :"+text.length());
}


public static void handleException(){
	String text=null;
	try{
		System.out.println("Length of text :"+text.length());
	}
	catch(NullPointerException e){
		System.out.println("Caught a NullPointerException. The variable 'text' is null.");
		
	}
}


	
public static void main(String args[]){
	
	try{
		generateException();
	}
	catch(NullPointerException e){
		System.out.println("Exception occurred: " + e);
	}
	
	
	
	System.out.println("Handling NullPointerException:");

        // Call the method that handles the exception
        handleException();
	
	
}
}