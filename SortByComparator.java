import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

class StudentInfo
	{
	 String name;
	 int roll;
	 int age;
	 
	 StudentInfo(String name, int roll, int age)
	 	{
		 this.age=age;
		 this.name=name;
		 this.roll=roll;
	 	}
	 @Override
	 public String toString()
	 	{
		 return "Name : "+this.name+"\nRoll No. : "+this.roll+"\nAge : "+this.age;
	 	}
	 
	 public int compareTo(Details dt)
	 	{
		 if(age==dt.age)
			 return 0;
		 
		 else if(age>dt.age)
			 return 1;
		 
		 else
			 return -1;
	 	}
	}

public class SortByComparator
	{

	void displayDetails(List<SortByComparator> info)
		{
		Iterator<SortByComparator> itr = info.iterator();
		while(itr.hasNext())
			{
			 System.out.println(itr.next()+"\n-----\n");
			}
		}
	
	public static void main(String[] args) 
	
	{
		int ch,method;
		Scanner sc=new Scanner(System.in);
		SortByComparator sdl=new SortByComparator();
		
		StudentInfo d1=new StudentInfo("ram",02,25); 
		StudentInfo d2=new StudentInfo("shyam",03,35);
		StudentInfo d3=new StudentInfo("raghav",01,20);
		
		List<StudentInfo> info=new ArrayList<>();
		info.add(d1);
		info.add(d2);
		info.add(d3);
		
		do
		{
		 System.out.println("************\nEnter choice\n1.Display\n2.Sort By Age\n3.Sort by Name\n4.Exit\n*********\n\n");
		 ch=sc.nextInt();
		 
		 switch (ch) 
		 	{
		 	 case 1 : sdl.displayDetails(info);
			 break;
			 
		 	 case 2 : Collections.sort(info);
		 	 break;
		 	 
		 	 case 3:
		 	 
		 	}
		}while(ch!=4);
		
		
	}

}
