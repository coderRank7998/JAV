import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

import javafx.print.Collation;
class Details implements Comparable<Details>
	{
	 String name;
	 int roll;
	 int age;
	 
	 Details(String name, int roll, int age)
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

public class SortByComparable
	{

	void displayDetails(List<Details> info)
		{
		Iterator<Details> itr = info.iterator();
		while(itr.hasNext())
			{
			 System.out.println(itr.next()+"\n-----\n");
			}
		}
	
	public static void main(String[] args) 
	
	{
		int ch,method;
		Scanner sc=new Scanner(System.in);
		SortByComparable sdl=new SortByComparable();
		
		Details d1=new Details("ram",02,25); 
		Details d2=new Details("shyam",03,35);
		Details d3=new Details("raghav",01,20);
		
		List<Details> info=new ArrayList<>();
		info.add(d1);
		info.add(d2);
		info.add(d3);
		
		do
		{
		 System.out.println("************\nEnter choice\n1.Display\n2.Sort By Age\n3.Exit\n*********\n\n");
		 ch=sc.nextInt();
		 
		 switch (ch) 
		 	{
		 	 case 1 : sdl.displayDetails(info);
			 break;
			 
		 	 case 2 : Collections.sort(info);
		 	 break;
		 	 
		 	}
		}while(ch!=3);
		
		
	}

}
