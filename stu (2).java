import java.util.*;
class Student
{
	int mark;
	String name;
	
	void read(int m1,String n)
	{
		mark = m1;
		name = n;
	}
	
	void display()
	{
		System.out.println("\nName: "+name+"\nMark: "+mark+"\n");
	}
}

class stu
{
	public static void main(String args[])
	{
		int i,num,mar;
		String nam;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of students: ");
		num = s.nextInt();
		Student s1[] = new Student[num];
			
		for(i=0;i<num;i++)
		{
			System.out.println("Enter the name and mark: ");
			nam = s.next();
			mar = s.nextInt();
			
			s1[i] = new Student();	
			s1[i].read(mar,nam);
		}
		
		for(i=0;i<num;i++)
		{
			s1[i].display();
	    }
	}
} 
		
	
	
