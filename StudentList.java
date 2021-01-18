import java.util.Iterator;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;
//import java.util.Arrays;
public class StudentList 

{
	void displayList(ArrayList<String> std)
		{
		
		 /*
		 for(int i=0;i<std.size();i++)  //simple for loop
		 	{
			 System.out.println(std.get(i));
		 	}
		 */
		
		 /* 
		  for(String i : std)  //adv for
		  
		 	{
			 System.out.println(i);
		 	}
		 	
		 	*/
		  Iterator<String> itr=std.iterator();
		  while(itr.hasNext())
		  	{
			  System.out.println(itr.next());
		  	}
		 
		}
	
	void updateList(ArrayList<String> std,int pos,String value)
		{
		 std.set(pos-1,value);
		}
	
	void addToList(ArrayList<String> std,int pos,String value)
	{
	 std.add(pos-1,value);
	}
	
	void deleteByIndex(ArrayList<String> std,int pos)
	{
	 std.remove(pos-1);
	}
	
	void deleteByValue(ArrayList<String> std,String value) 
	{
	// std.remove(value);				//delete 1st occurance only
	 std.removeAll(Collections.singleton(value));		////delete all occurances
	}
	
	public static void main(String[] args) 
	{
		StudentList sl=new StudentList();
		int n,ch,pos,size;
		String arr[];
		String s,value;
		ArrayList<String> std=new ArrayList<>();  //ArrayList std=new ArrayList(); for all datas
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of elements to add");
		n=sc.nextInt();
		System.out.println("Enter elements");
		for(int i=0;i<n;i++)
			{
			 s=sc.next();
			 std.add(s);
			}
		
		do
		{
			System.out.println("Enter Choice\n1.Display\n2.Update\n3.Add\n4.Delete By Index\n5.Delete By Value\n6.RemoveAll\n7.Sort\n8.Copy Array\n9.Exit");
			ch=sc.nextInt();
			switch(ch)
				{
				 case 1: sl.displayList(std);
				 break;
				 
				 case 2: System.out.println("Enter position & value to update");
				 		 pos=sc.nextInt();
				 		 value=sc.next();
				 		 sl.updateList(std,pos,value);
				 		System.out.println("Updated\n\n");
				 break;
				 
				 case 3: System.out.println("Enter position & value to add");
						 pos=sc.nextInt();
				 		 value=sc.next();
				 		 sl.addToList(std,pos,value);
				 		System.out.println("Addes\n\n");
				 break;
				 
				 case 4: System.out.println("Enter position to delete");
				 		 pos=sc.nextInt();
				 		 sl.deleteByIndex(std,pos);
				 		System.out.println("Deleted\n\n");
				 break;
				 
				 case 5: System.out.println("Enter value to delete");
				 		 value=sc.next();
				 		 sl.deleteByValue(std,value);
				 		System.out.println("Deleted\n\n");
				 break;
				 
				 case 6: std.removeAll(std);   //1stds ele. gonna remove.. which are in 2nd std
				 		// std.clear();			//remove whole list
				 break;
				 
				 case 7: Collections.sort(std);
				 		 // Collections.sort(std); Collections.reverse(std); //desending
				 		 // Collections.reverseOrder(std,Collections.sort(std));
				 break;
				 
				 case 8:System.out.println("Enter array size");
				 		size=sc.nextInt();
				 		arr=new String[size];
				 		System.out.println("Enter String array");
				 		for(int i=0;i<size;i++)
				 			{
				 				arr[i]=sc.next();
				 			}
				 		Collections.addAll(std, arr);//efficient than addlist
				 		//std=Arrays.asList(arr);   //ref. of arraylist must be impl. from list interface
				 		//ArrayList<String> std= new ArrayList<String>(Arrays.asList(arr));
				 break;
				} 
		 std.trimToSize();  //trim to current size for memory opt... (new size=cs*(3/2)+1)..when new element exeeds size
		}while(ch!=9);
		sc.close();
	}

}
