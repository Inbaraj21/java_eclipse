package Array;

import java.util.Scanner;

public class greaterArray3 {

	public static void main(String[] args) {
		int n,m;
		Scanner sc=new Scanner(System.in);
		System.out.println("numer of elements in ... n :");
		 n=sc.nextInt();
		 System.out.println("number of elements in ... m:");
		 m=sc.nextInt();
		 int[][]arr=new int[n][m];
		 if(n>m)
		 {
			 System.out.println("the greatest number is :");
			
			System.out.println(n);
		
		 }
		 else
         {
			 System.out.println("the greatest number is :");
        	 System.out.println(m);	 
         }
	}

}
