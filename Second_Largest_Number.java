package Day_3;

public class Second_Largest_Number 
{
	public static void main(String[] args) 
	{
		int[] a = {11,8,2,9,11,6};
		int large = Integer.MIN_VALUE;
		int slarge = Integer.MIN_VALUE;

		for(int i=0;i<a.length;i++)
		{
			if(a[i]>large)
			{
				slarge = large;
				large =a[i];
			}
			else if(a[i]>slarge && a[i]!=large)
			{
				slarge = a[i];
			}		
		}
		System.out.println(large);
		System.out.println(slarge );
	}
}
// Algorithm
//1 large = smallest_possible_value
//2 slarge = largest_possible_value
//3 for each element in the array:
//4     if current_element > large:
//5         slarge = large
//6         large = current_element
//7     else if current_element > slarge and current_element != large:
//8         slarge = current_element
//9  print large
//10 print slarge

//Initialize large to the smallest possible integer value and slarge to the largest possible integer value.
//Iterate over each element of the array.
//For each element, compare it with large:
//If the current element is greater than large, update slarge to the current value of large, then update large to the current element.
//If the current element is greater than slarge and not equal to large, update slarge to the current element.
//Print the values of large and slarge.
