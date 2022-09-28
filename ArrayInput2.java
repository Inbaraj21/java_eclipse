package Array;
import java.util.Scanner;
public class ArrayInput2 {

	public static void main(String[] args) {
	int n,m,i,j;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the numbers of rows :");
	n=sc.nextInt();
	System.out.println("Enter the numbers of coloumns :");
	m=sc.nextInt();
	int[][]arr=new int[n][m];
	System.out.println("the numerof elements :");
	for( i=0;i<m;i++)
		for( j=0;j<n;j++)
		
			arr[i][j]=sc.nextInt();
			System.out.println("elements of the array :");
			for( i=0;i<m;i++)
			{
				for( j=0;j<n;j++)
					System.out.print(arr[i][j]+" ");
				System.out.println();
			}
		}
	

	}


