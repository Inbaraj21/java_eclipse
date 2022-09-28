package Array;

public class add1Array {

	public static void main(java.lang.String[] args) {
		int a[]= {2,4,7};
		int b[]= {3,5,1};
		int arr[]=new int[a.length+b.length];
		
		for(int i=0;i<arr.length;i++)
		{
			if(i<3)
			{
				arr[i]=a[i];
			}
			else
			{
				arr[i]=b[i-a.length];
			}
			System.out.println(arr[i]);
		}
		}

	}


