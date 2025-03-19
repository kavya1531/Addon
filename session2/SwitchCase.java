package programs;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("5.Modulus");
		
		
		System.out.println("Enter your option: ");
		int option=sc.nextInt();
		
		//inputs
		System.out.println("Enter the first number: ");
		double num1=sc.nextDouble();
		System.out.println("Enter your second number: ");
		double num2=sc.nextDouble();
		
		double result;
		
		
		//condition
		switch(option)
		{
		case 1:
			result=num1+num2;
			System.out.println("Result:" +result );
	        break;	
		case 2:
			result=num1-num2;
			System.out.println("Result:" +result );
		    break;
		
		case 3:
			result=num1*num2;
			System.out.println("Result:" +result );
			break;
		case 4:
			if(num2 !=0) 
			{
		    result=num1/num2;
		    System.out.println("Result:" +result );	
			}
			else
			{
				System.out.println("Division by 0 is not allowed");
			}
			break;
			
		case 5:
			result=num1%num2;
			System.out.println("Result:" +result );	
            break;		
		
		default:
			System.out.println("Invalid option");
		
		
		}
		
		
		
	}
	
	
	
}
