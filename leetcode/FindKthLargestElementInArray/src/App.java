import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class App {

    // Slow solution
    public static int findKthLargest(int[] nums, int k) {
        List<Integer> sortedArray = new ArrayList<>(nums.length);
        for (Integer integer : nums) {
            sortedArray.add(integer);
        }

        sortedArray.sort(Collections.reverseOrder());
        return sortedArray.get(k - 1);
    }

    // Alternative solution and faster than the previous one
    public static int findKthLargest2(int[] nums, int k) {
        PriorityQueue<Integer> pQueue = new PriorityQueue<>();

        for (int i = 0; i < nums.length; i++) {
            pQueue.add(nums[i]);

            if (pQueue.size() > k)
                pQueue.poll();
        }

        return pQueue.poll();
    }

    public static void main(String[] args) throws Exception {
        int[] nums = { 3, 2, 3, 1, 2, 4, 5, 5, 6 };
        int k = 2;
        System.out.println(findKthLargest(nums, k));
        System.out.println(findKthLargest2(nums, k));
    }
}
