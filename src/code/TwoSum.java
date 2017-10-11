package code;

import java.util.*;
import java.util.Map.Entry;

public class TwoSum {
	public static void main(String[] args) {
		int sum[] = {1, 2 ,4};
		int target = 5;
		int result[] = new TwoSum().twoSum2(sum, target);
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
	public int[] twoSum2(int[] nums, int target) {
		int result[] = new int[2];
		Map<Integer, ArrayList<Integer>> mapTmp =  new HashMap<>();
		for(int i=0; i<nums.length;i++) {
			ArrayList<Integer> list = mapTmp.get(nums[i]);
			if(list == null) {
				list = new ArrayList<Integer>();
			}
			list.add(i);
			mapTmp.put(nums[i], list);
		}
		for(Entry<Integer, ArrayList<Integer>> entry: mapTmp.entrySet()) {
			int a1 = entry.getKey();
			ArrayList<Integer> results = mapTmp.get(target-a1);
			if(results == null) {
				continue;
			}
			if(a1 == target - a1 && results.size()>1) {
				result[0] = results.get(0);
				result[1] = results.get(1);
				break;
			} else if(results.size() == 1) {
				result[0] = entry.getValue().get(0);
				result[1] = results.get(0);
				break;
			}
		}
		return result;
    }
}
