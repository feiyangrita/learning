package code;

public class TwoSum {
	public static void main(String[] args) {
		int sum[] = {1, 2 ,4};
		int target = 5;
		int result[] = new TwoSum().twoSum(sum, target);
		System.out.print(result[0]);
		System.out.print(result[1]);
	}
	
	public int[] twoSum(int[] nums, int target) {
		int result[] = new int[2];
        for(int i=0; i< nums.length; i++) {
        	 for(int j=0; j< nums.length; j++) {
        		 if (i == j) {
        			 continue;
        		 }
        		 int sums = nums[i] + nums[j];
        		 if (target == sums) {
        			 result[0] = i;
        			 result[1] = j;
        			 return result;
        		 }
        	 }
        }
        return null;
    }
}
