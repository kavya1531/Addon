package programs;

public class Operators {
	
	public static void main(String[] args) {
		
		int a=5,b=8;	
		
		
		//Arithmetic
		System.out.println("Addition" +(a+b));
		System.out.println("Subtraction" +(a-b));
		System.out.println("Multiplication" +(a*b));
		
		
		//Relational
		System.out.println("Equal to" +(a==b));
		System.out.println("Not Equal" +(a!=b));
		System.out.println("Greater than" +(a>b));
		System.out.println("less than equal to" +(a<=b));
		
		
		//Logical
		boolean condition1 = true,condition2 = false;
		System.out.println("Logical AND" +(condition1 && condition2));
		System.out.println("Logiacl OR" + (condition1 || condition2));
		System.out.println("Logical NOT" + (!condition1));

		//unary
		System.out.println("Pre increament" +(++a));
		System.out.println("Post dcreament" +(b--));
		System.out.println("Unary negation" +(~a));
		
		
		//Assignmnet
		a+=5; //a=a+5
		System.out.println("+=" +a);
		
		
		//Ternary
		String res=(a>b)?"a is a greater" : "b is a greater";
		System.out.println("result=" +res);
		
		
		//Bitwise
		System.out.println("AND " + (a&b));
		System.out.println("OR " +(a|b));
		System.out.println("NOT "+(~a));
		System.out.println("XOR " +(a^b));
	
	
	
	
	
	}
	
	

}
