// a program to calculate the profit and loss in number and percentage based on the cost price of INR 129 and the selling price of INR 19

class profitnloss{
	
public static void main(String args[]){
	int cp=129;
	int sp=191;
	int profit=sp-cp;    // Profit = Selling Price - Cost Price
	int profit_percentage=(profit/cp)*100;   //Profit percentage = (Profit/Cost Price)*100;
	
	System.out.println("The Cost Price is INR "+cp+" and Selling Price is INR "+sp+"\nThe Profit is INR "+profit+" and the Profit Percentage is "+ profit_percentage);
}

}   
