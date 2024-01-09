package Practice_pack;
public class Loops {
public static void main(String[] args) {
	for(int a=1;a<=10;a++)
		{
			if(a==7)
			{
				System.out.println("BOKKI"+" "+a);
			}	
			
		}		
//		Arrays
		String [] names={"phani","kalyan","gopal","Budda","Gani"};
		System.out.println(names.length);
		names[0]="Naruto";//if you want to change the name we will use the change Array element
		System.out.println(names[0]);
		System.out.println(names[3]);
		System.out.println(names[2]);
//		if you want to print all names 
    	for(int b=0;b<names.length;b++)
		{
			System.out.println(names[b]);
		}   	
//		Another type for print all Array element	
		String [] names1= {"NARUTO","HINATA","SAKURA","GAARA","SASUKE UCHIHA"};
		for(String kakashi : names1)//for(Type variable : ArrayName)
		{
			System.out.println(kakashi);
			
		}
		String[] name2= {"Phani","Gopal","NAni"};
		for (String ammu:name2)
		{
			System.out.println(ammu);
		}
//		Even number	
		for(int i=1;i<=10;i++)
		{
			if (i%2==0)
			{
				System.out.println(i);
			}
		}		
//		Odd numbers
		for(int i=1;i<=20;i++)
		{
			if (i%3==0)
			{
			System.out.println(i);
			}
		}	
//		if else if	
		int value=17;
		if(value>19)
		{
			System.out.println("nothing");
		}
		else
		{
			System.out.println("say any thing");
		}		
		}
	}


