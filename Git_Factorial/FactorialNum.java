import java.util.Scanner;

public class FactorialNum {

	public static void main(String[] args) {
		int i;
		int fact;
		Scanner sc= new Scanner(System.in);
	
			fact=1;  
			System.out.println("Enter a number");
			  int number= sc.nextInt();   
			  for(i=1;i<=number;i++){    
			      fact=fact*i;    
			  }    
			  System.out.println("Factorial of "+number+" is: "+fact);    
			 }  
	}


