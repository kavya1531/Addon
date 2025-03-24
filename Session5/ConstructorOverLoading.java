package Session5;

public class ConstructorOverLoading {
	
	
	private String empname;
	private int empid;
	private String location;
	
	public ConstructorOverLoading(String empname,int empid,String location)
	{
		System.out.println("Displaying all the info's");
		this.empname=empname;
		this.empid=empid;
        this. location=location;		
	}
	
	
	public ConstructorOverLoading(String empname,String location)
	{
		
		this(empname,0,location); //call invoke using this keyword
		
	}
	
	public ConstructorOverLoading(String empname,int empid)
	{
		
		this(empname,empid,null); //call invoke using this keyword
		
	}
	
	
	public void displayInfo()
	{
		System.out.println("Employee Name: " +this.empname);
		System.out.println("Employee ID: " +this.empid);
		System.out.println("Employee Location: " +this.location);
	}
	
	public static void main(String[] args) {
		ConstructorOverLoading col=new ConstructorOverLoading("Madhan",21,"Tirupur");
		ConstructorOverLoading col1=new ConstructorOverLoading("Kumar","Thirumurugan Poondi");
		ConstructorOverLoading col2=new ConstructorOverLoading("Kumar",12);
		col .displayInfo();
		col1 .displayInfo();
		col2.displayInfo();
		
	}

}
