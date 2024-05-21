package Day_3;

public class print_at_Odd_Locations {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7,8,9};

		for(int i=1;i<a.length;i+=2)
		{
			System.out.println("numbers present at odd locations:- "+a[i]);
		}

	}
}
