// to divide 14 pens among 3 students equally. Write a program to find how many pens each student will get if the pens must be divided equally. Also, find the remaining non-distributed pens.

class dividepens{
	public static void main(String args[]){
		int pens=14;
		int students=3;
		
		int quantity = pens/students; 
		
		int remaining = pens%students;
		
		System.out.println("The Pen Per Student is "+quantity+" and the remaining pen not distributed is "+remaining);
	}
}