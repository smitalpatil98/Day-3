//JAVA PROGRAM TO PRINT ELEMENTS OF AN ARRAY
package Day_3;

public class print_the_elements_of_an_array {

	public static void main(String[] args) 
	{
	int[] arr = {14,52,63,78,95};
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]+" ");
	}

	}

}
//Algorithm:
//Start: Begin the algorithm.
//Input: Take an integer array arr.
//Loop through each element arr[i] in the array from i = 0 to i = length of arr - 1.
//Print each element arr[i].
//End

//Procedure PrintArrayElements(arr: array of integers)
//For i := 0 to length of arr - 1 do
//    Print arr[i]
//End For
//End Procedure
