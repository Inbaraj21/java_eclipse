package Array;

public class addArray {

	public static void main(String[] args) {
		int a[]= {4,8,2};
		int b[]= {8,9,1};
		int c[]=new int [3];
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i]+b[i];
			System.out.println(c[i]);
		}

	}

}
