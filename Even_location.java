package Day_3;

public class Even_location {

	public static void main(String[] args) 
	{
		int[] a= {1,2,3,4,5,6,7,8,9};
		for(int i=0;i<=a.length;i+=2)
		{
			System.out.println("numbers present at even locations:- "+a[i]);
		}
	}
}
