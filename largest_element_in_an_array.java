// print the largest and smallest element in an array
package Day_3;

public class largest_element_in_an_array 
{
	public static void main(String[] args) {
		int[] element = {45,1000,25,64,89,999};
		int larg = element[0];

		for(int i=0;i<element.length;i++)
		{
			if(element[i]>larg)
			{
				larg  = element[i];
			}

		}
		System.out.println(larg);
	}
}
//Algorithm:
//Start: Begin the algorithm.
//Input: Take an integer array element.
//Initialize two variables larg and small to the first element of the array.
//Loop through each element element[i] in the array.
//If element[i] is greater than larg, update larg with element[i].
//If element[i] is smaller than small, update small with element[i].
//Output: Print the values of larg and small.
//End

//Procedure FindLargestSmallest(element: array of integers)
//Let larg := element[0]
//Let small := element[0]
//
//For i := 0 to length of element - 1 do
//    If element[i] is greater than larg then
//        Set larg as element[i]
//    Else if element[i] is less than small then
//        Set small as element[i]
//    End If
//End For
//
//Print "Largest element: " + larg
//Print "Smallest element: " + small
//End Procedure
