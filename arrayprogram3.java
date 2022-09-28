package Array;

public class arrayprogram3 {

	public static void main(String[] args) {
		int sum=0;
		int marks[]= {256,654,345,213};
		System.out.println(marks.length);
		for(int i=0;i<marks.length;i++)
		{
			sum=sum+marks[i];
		}
        System.out.println("the total value marks :"+sum);
	}

}
