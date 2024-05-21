package Day_3;

public class duplicate_elements_of_an_array 
{
	public static void main(String[] args) 
	{
		int[] a = {4,5,6,3,5,1};
		for(int i = 0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{   
					System.out.println(a[j]);
				}
			}
		}
	}
}
//Algorithm:
//Start: Begin the algorithm.
//Input: Take an integer array a.
//Loop: Iterate over each element a[i] in the array from i = 0 to i = length of a - 1.
//For each a[i], start another loop to compare it with all subsequent elements a[j] from j = i + 1 to j = length of a - 1.
//If a[i] is equal to a[j], print a[j] as it's a duplicate element.
//End Loop
//End

//PsedoCode
//Procedure FindDuplicates(arr: array of integers)
//For i := 0 to length of arr - 1 do
//    For j := i + 1 to length of arr - 1 do
//        If arr[i] is equal to arr[j] then
//            Print arr[j] as a duplicate element
//        End If
//    End For
//End For
//End Procedure
