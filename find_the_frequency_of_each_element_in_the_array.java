package Day_3;
public class find_the_frequency_of_each_element_in_the_array 
{
	public static void main(String[] args) 
	{
		int arr[] = {1,2,3,4,2,2,3,1};
		//to save the frequencies 
		int freq[]=new int[arr.length];
		//set element as visited so we will take an integer as visited and want to update it again
		int visited = -1;

		//loop from 1st element
		for(int i=0;i<arr.length;i++)
		{    
			int count = 1;
			//loop from 2nd element 
			for(int j = i+1;j<arr.length;j++)
			{   
				if(arr[i]==arr[j])
				{
					count++; //update count
					freq[j]= visited;//element is visited and we dont want to visit it again 
				}
				//update the count only if it is not visited 
				if(freq[i]!=visited)
				{
					freq[i]=count;//update the count
				}
			}
		}
		//For Output Print:-
		for(int i=0;i<freq.length;i++)
		{
			if(freq[i]!=visited)
			{
				System.out.println("Element | frequency ");
				System.out.println(arr[i] + "       |       "+freq[i]);
			}
		}
	}
}

//Algorithm:
//Start: Begin the algorithm.
//Input: Take an integer array arr.
//Initialize an integer array freq with the same length as arr to save the frequencies of elements.
//Initialize an integer visited to mark elements that have been visited (-1).
//Loop through each element arr[i] in the array.
//Initialize a variable count to 1.
//Start another loop from j = i + 1 to the end of the array.
//If arr[i] is equal to arr[j], increment count and mark arr[j] as visited by setting freq[j] to visited.
//If freq[i] is not visited, update freq[i] with the current count.
//Output: Print the elements and their frequencies from the freq array.
//End

//PseudoCode
//Procedure FindElementFrequencies(arr: array of integers)
//Let freq be an array of integers with the same length as arr
//Let visited = -1
//
//For i := 0 to length of arr - 1 do
//    Let count := 1
//    For j := i + 1 to length of arr - 1 do
//        If arr[i] is equal to arr[j] then
//            Increment count by 1
//            Set freq[j] as visited
//        End If
//        If freq[i] is not equal to visited then
//            Update freq[i] with count
//        End If
//    End For
//End For
//
//For i := 0 to length of freq - 1 do
//    If freq[i] is not equal to visited then
//        Print "Element | Frequency"
//        Print arr[i] + " | " + freq[i]
//    End If
//End For
//End Procedure
