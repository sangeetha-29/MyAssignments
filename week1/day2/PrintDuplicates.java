package week1.day2;
import java.util.Arrays;

public class PrintDuplicates {
	public static void main(String[] args) {
		// Method 2
		int[] nums= {2,5,7,7,5,9,2,3};
		Arrays.sort(nums);
		for (int i = 0; i < nums.length-1; i++) {
			if (nums[i]==nums[i+1]) {
				System.out.println(nums[i]);
				
			}
			
		}
	}

}
