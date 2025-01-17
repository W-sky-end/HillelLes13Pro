

import java.util.HashMap;
import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> numbers = new HashSet<>();
        for (int num : nums) {
            if (numbers.contains(num)) {
                return true;
            }
            numbers.add(num);
        }
        return false;
    }

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> num = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (num.containsKey(complement)) {
                return new int[]{num.get(complement), i};
            }
            num.put(nums[i], i);
        }
        return new int[]{};
    }

    public boolean isPalindrome(String s) {
        String filter = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return filter.equals(new StringBuilder(filter).reverse().toString());
    }
}

