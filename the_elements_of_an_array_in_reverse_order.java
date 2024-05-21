//print the elements of an array in reverse order
package Day_3;

public class the_elements_of_an_array_in_reverse_order 
{
	public static void main(String[] args) 
	{   
		int[] a = {9,8,7,6,-2,5,4,3,2,1,-1};
		{   
			System.out.println(a.length-1);
			for(int i = a.length-1;i>=0;i--)
			{
				System.out.print(a[i] + " ");
			}
		}
	}

}
//Algorithm:
//Start: Begin the algorithm.
//Initialize an integer array a with the given values.
//Print the length of the array a.
//Loop through each element a[i] in the array from i = length of a - 1 to i = 0.
//Print each element a[i].
//End

//Procedure PrintArrayInReverse()
//Let a be an integer array with the given values
//Print "Length of the array: " + length of a
//
//For i := length of a - 1 to 0 step -1 do
//    Print a[i]
//End For
//End Procedure
