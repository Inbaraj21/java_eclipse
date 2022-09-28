package Array;

public class arrayprogram2 {

	public static void main(String[] args) {
		int marks[]= {200,250,345,452};
		for(int i=0;i<marks.length;i++)
		{
			if(marks[i]%2==0)
			{
			System.out.println("even numbers :"+marks[i]);
		}
		else
		{
			System.out.println("odd numbers :"+marks[i]);
		}

	}

}
}