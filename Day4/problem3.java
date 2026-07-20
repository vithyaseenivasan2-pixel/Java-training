package Day4;

import java.util.HashSet;
import java.util.List;

public class problem3 {
     public int minOperations(List<Integer> nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        int operations = 0;

        for (int i = nums.size() - 1; i >= 0; i--) {
            operations++;

            int num = nums.get(i);

            if (num <= k) {
                set.add(num);
            }

            if (set.size() == k) {
                return operations;
            }
        }

        return operations;
    }
}

