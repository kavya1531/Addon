package programs;

public class Bitwise {
	public static void main(String[] args) {
		
		int a=5,b=3; //binary-->0101, 3-->0011
		
		System.out.println("Bitwise AND " + (a&b)); 
		
		System.out.println("Bitwise OR " +(a|b));
		System.out.println("Bitwise NOT " + (~a));
		System.out.println("Bitwise XOR " +(a^b));
	}

}
