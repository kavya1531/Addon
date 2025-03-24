package Session5;

public class ConstructorClass {

	
	public ConstructorClass()
	{
		System.out.println("Default Constructor");
	
	
	}
	
	public ConstructorClass(String name,String age)
	{
		System.out.println("Name: "+name);
		System.out.println("age: "+age);
		System.out.println("Parameterised Constructor");
		
	
	
	}
	
	
	public int sum(int a,int b)
	{
		int res=a-b;
		return res;
	}
	
	
	
	
public static void main(String[] args) {
	ConstructorClass ec=new ConstructorClass();
	ConstructorClass cc=new ConstructorClass("MadhanKumar","45");
	System.out.println(cc.sum(5,10));
}

}

