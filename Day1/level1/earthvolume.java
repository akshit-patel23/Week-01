// A Program to compute the volume of Earth in km^3 and miles^3


import java.lang.Math;

class earthvolume {
public static void main(String args[]){
	double r= 6378;
	double volumekm= (4/3)* Math.PI *(r*(r*r)); // Volume of sphere = (4/3) * pi * r^3 
	double rmiles= r*0.62; 						// 1km = 0.62 miles
	double volumemiles= (4/3)*Math.PI *(rmiles*(rmiles*rmiles));
	System.out.println("The volume of earth in cubic kilometers is "+volumekm+" and cubic miles is "+volumemiles);
	
}

}