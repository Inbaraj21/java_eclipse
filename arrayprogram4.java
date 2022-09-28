package Array;

public class arrayprogram4 {

	public static void main(String[] args) {
	int even=0,odd=0;
	int arr[]= {11,54,78,95};
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]%2==0)
		{
			even=even+arr[i];
		}
		else
		{
			odd=odd+arr[i];
		}
	}
		System.out.println("even number is :"+even);
		System.out.println("odd number is :"+odd);
	
	
	System.out.println( even-odd);
	}
}


