package Array;

public class bublesortingArray {

	public static void main(String[] args) {
		int[]arr= {2,9,6,5,4};
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
					if(arr[i]>arr[j])
					{
				     temp=arr[i];
				     arr[i]=arr[j];
				     arr[j]= temp;
			}
			}
		}
			
			System.out.println("elements of the sorted in ascending order: ");
			for(int i=0;i<arr.length;i++)
			{
				System.out.print(arr[i]+" ");	
			}
		}
	}



/*package Array;
import java.util.Scanner;
public class bublesortingArray {

	public static void main(String[] args) {
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the elements");
		n=sc.nextInt();
		int[]arr=new int [10];
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
					if(arr[i]>arr[j])
					{
				     temp=arr[i];
				     arr[i]=arr[j];
				     arr[j]= temp;
			}
			}
		}
			System.out.println();
			System.out.println("elements of the sorted in ascending order: ");
			for(int i=0;i<arr.length;i++)
			{
				System.out.print(arr[i]+" ");	
			}
		}
	}*/

	


