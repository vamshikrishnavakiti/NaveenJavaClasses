package Arrays;

public class SearchMax {

	public static void main(String[] args) {
		int[] a= {4,3,2,6,8,9,1};
		int max =a[0];
		int length = a.length;
		for(int i=1; i<length; i++) 
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println("Max number is="+max);

	}

}
