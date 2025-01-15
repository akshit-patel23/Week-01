import java.util.*;
public class Test{

public static void array2d(String v, String c){

// creating 2d array to store vowels and consonants;

String ans[][]=new String[1][2];

ans[0][0]=v;
ans[0][1]=c;


System.out.println("Vowels \t Consonants");
System.out.println(ans[0][0]+ "\t" + ans[0][1]);

}


public static void string(String s){ // vowels method 

String vowels="";
String conso="";

int v=0;
int c=0;
String upper="";
for(int i=0;i<s.length();i++){
if((s.charAt(i)=='a') || (s.charAt(i)=='e') || (s.charAt(i)=='i') || (s.charAt(i)=='o') || (s.charAt(i)=='u') || (s.charAt(i)=='A') ||(s.charAt(i)=='E') || (s.charAt(i)=='I') || (s.charAt(i)=='O') || (s.charAt(i)=='U')){

vowels+=s.charAt(i);
v++;

if((int)s.charAt(i)<97 && s.charAt(i)!=' '){
int t=(int)s.charAt(i)+32; //changing Upper to Lower
upper+=(char)(t);
}

if((int)s.charAt(i)>=97 && s.charAt(i)!=' '){
int t=(int)s.charAt(i)-32; //changing Upper to Lower
upper+=(char)(t);
}

}

else{ c++;
conso+=s.charAt(i);
if((int)s.charAt(i)>=97 && s.charAt(i)!=' '){
int t=(int)s.charAt(i)-32;  //changing Upper to Lower
upper+=(char)(t);
}

if((int)s.charAt(i)<97 && s.charAt(i)!=' '){
int t=(int)s.charAt(i)+32;  //changing Upper to Lower
upper+=(char)(t);
}


}

}   
System.out.println("The vowels in the given string is: "+v+ " Consonants :"+c);
System.out.println("the modified string is: "+upper);

array2d(vowels,conso);

}


// driver function 
public static void main(String args[]){

System.out.println("Enter the text: ");
Scanner sc=new Scanner(System.in);

String s=sc.nextLine();

string(s);


}
}