//create an array and insert array as an argument
//using method 
package Day_3;

public class Sorting_In_Ascending_Order 
{
	public static void printArray(int a[])
	{                                      
		for(int i=0;i<a.length;i++) //for printing the array 
		{
			System.out.println(a[i] + " ");
		}
	}
	public static void main(String[] args) 
	{
		int [] a= {8,6,3,1};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}	
		printArray (a);
	}
}