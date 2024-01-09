package Class_Period;

class  Parrent_practice
{
	private String name;
	private int age;
	Parrent_practice(String name,int age)
	{
	   this.name=name;
		this.age=age;
	}
   public String getname()
   {
	   return name;
	   
   }
   public int getage()
   {
	   return age;
   }
	
public void print_result_parrent() 
    {
		
		System.out.println("name value: "+name);
		System.out.println("age : "+age);
		
		
	}
}


class Child_practice extends Parrent_practice 
{
	
	private String address;
	private int salary;
	//extra methods  
	private String  StudentRollNo;
	private int StudentID;
	
	
	public String  getStudentRollNo()
	{
		return StudentRollNo;
	}
	public int  getStudentID()
	{
		return StudentID;
		
	}
	public void setStudentRollNo(String StudentRollNo )
	{
		this.StudentRollNo=StudentRollNo;  //this keyword refers to Current Object
	}
	public void setStudentID( int StudentID) 
	{
		this.StudentID=StudentID;
	}
		public String getaddress()
		{
			return address;
		}
           public int getsalary()
           {
        	   return salary;
           }
	
	Child_practice(String name,int age,String address,int salary,String StudentRollNo,int StudentID)
	{
		super(name, age);
		this.address=address;
		this.salary=salary;
		this.StudentRollNo=StudentRollNo;
		this.StudentID=StudentID;
		
		
	}


	
	public void print_result() 
	{
		
		System.out.println("address value: "+address);
		System.out.println("salary : "+salary);
		System.out.println("stdrollnum :"+StudentRollNo);
		System.out.println("StudentID "+StudentID);
		
	}
}

public class Demo_11 
{

	
	public static void main(String[] args)
	{
		
		Child_practice c=new Child_practice("nani",20,"Andhra",13700,"Ammu",250550);
		c.print_result_parrent();
		c.print_result();
		c.setStudentID(6540);
		c.setStudentRollNo("12345@");
		c.getStudentID();
		c.getStudentRollNo();
		System.out.println(c.getStudentID()+" :"+c.getStudentRollNo());
		
	}

}
