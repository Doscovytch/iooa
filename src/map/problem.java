package map;

import java.util.HashMap;

public class problem {
    public static void main(String[] args) {
        problem app = new problem();

        for (int number : app.twoSum(new int[]{0, 4, 2, 6, 0, 0, 0, 0, 0, 3}, 5)) {
            System.out.println(number);
        }

    }

    private int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            int complement = target - num;
            if (map.containsKey(complement)) {
                return new int[] {complement, num};
            }
            map.put(num, null);
        }
        return null;
    }
}
