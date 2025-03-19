package programs;

import java.util.Scanner;

public class NestedIfElse {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your age: ");
		int age=sc.nextInt();
		
		System.out.println("Enter your weight: ");
		int weight=sc.nextInt();
		
		//condition
		if(age>20)
		{
			if(weight>50)
			{
				System.out.println("Both the age and weight is satisfied to donate blood");
			}
			else
			{
				System.out.println("But the weight is not satisfied yet to donate the blood");
			}
		}
		else
		{
			System.out.println("age is not satisfied to donate blood");
		}
	}

}
