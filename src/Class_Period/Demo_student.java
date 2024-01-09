package Class_Period;

class Student{
	private String name;
	private String surname;
               int rollNo; 
Student(String studentName, String studentSurname, int studentRollNo){ 
	this.name= studentName; 
	this.surname = studentSurname; 
	this.rollNo= studentRollNo; 
} 
public void getStudentDetails(){ 
	System.out.println("The name of the student is "+ this.name +" "+ this.surname); 
	System.out.println("The roll no of the student is "+ this.rollNo); 
} 
} 
class Demo_student{ 
public static void main(String args[]) { 
	Student a1=new Student("Ammu","Laddu",143143);
	a1.getStudentDetails();
} 
}