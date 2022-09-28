package Array;
import java.util.Arrays;
import java.util.Collections;
public class sorting2Array {

	public static void main(String[] args) {
		Integer[]arr= {3,7,9,2,5,1};
		Arrays.sort(arr,Collections.reverseOrder());
		System.out.printf("MOdified arr[]  %s", Arrays.toString(arr));

	}

}
