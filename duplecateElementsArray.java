package Array;

public class duplecateElementsArray {
public static void main(String args[]) {
	int a[]= {3,5,7};
	int b[]= {4,9,6};
	int c[]=new int[3];
	for(int i=0;i<a.length;i++)
	{
		for(int j=0;j<b.length;j++)
		{
			if(a[i]==b[j])
			System.out.println(b[i]);
		}
}
}
}