package Class_Period;



class Laddu
{
	 public  String Name;
	 private long phonum;
	 Laddu(String Name,long phonum)
	 {
		 this.Name=Name;
		 this.phonum=phonum;
	 }
	 public void Print_class()
	 {
		 System.out.println("Name is "+Name);
		 System.out.println("phonum is +"+phonum);
	 }
	 
}
class Jalebi extends Laddu{
	Jalebi(String name1,long phone1){
		super(name1,phone1);
	}
}
public class Laadu_Demo 
{
	public static void main(String[] args)
	{
		Jalebi j=new Jalebi("Sweet",995599599l);
		j.Print_class();
		
	}
}
