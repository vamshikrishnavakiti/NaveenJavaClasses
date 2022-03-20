package Arrays;

public class SearchMin {

	public static void main(String[] args) {
      int[] a= {1,2,4,0,3,6,8};
      int min =a[0];
      for(int i=1; i>a.length;i--) {
    	  if(min>a[i]) {
    		  min=a[i];
    	  }
      }
      System.out.println(min);
	}

}
