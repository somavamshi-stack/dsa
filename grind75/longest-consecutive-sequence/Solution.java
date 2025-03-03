import java.util.*;

class Solution {

    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        Set<Integer> set = new HashSet<>();
        int longest = 1;
        for (int x : nums) {
            set.add(x);
        }
        for (int x : set) {
            if (!set.contains(x - 1)) {
                int cnt = 1;
                int it = x;
                while (set.contains(it + 1)) {
                    it++;
                    cnt++;
                }
                longest = Math.max(cnt, longest);
            }
        }
        return longest;
    }
}
