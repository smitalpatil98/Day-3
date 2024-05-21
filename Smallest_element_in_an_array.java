package Day_3;

public class Smallest_element_in_an_array {

	public static void main(String[] args) {
		int[] element = {45,1000,25,64,89,999};
		//int larg = element[0];
		int small = element[0];
		for(int i=0;i<element.length;i++)
		{

			//print the smallest element in an array
			if(element[i]<small)
			{
				small = element[i];
			}
		}
		System.out.println(small);
	}
}
