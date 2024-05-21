package Day_3;

public class Second_Smallest_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {11,8,2,9,11,6};
		int small = Integer.MAX_VALUE;
		int ssmall = Integer.MAX_VALUE;

		for(int i=0;i<a.length;i++)
		{
			if(a[i]<small)
			{
				ssmall = small;
				small = a[i];
			}
			else if(a[i]<ssmall && a[i]!=small)
			{
				ssmall = a[i];
			}		
		}
		System.out.println(small);
		System.out.println(ssmall );

	}

}
