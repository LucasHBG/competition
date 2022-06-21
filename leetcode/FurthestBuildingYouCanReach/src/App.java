import java.util.Collections;
import java.util.PriorityQueue;

public class App {

    public static int furthestBuilding(int[] heights, int bricks, int ladders) {

        PriorityQueue<Integer> pQueue = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < heights.length - 1; i++) {
            if (heights[i] >= heights[i + 1])
                continue;
            else {
                bricks -= heights[i+1] - heights[i];
                pQueue.add(heights[i+1] - heights[i]);

                //remove 1 ladder to compensate the remaining bricks
                if(bricks < 0){
                    bricks += pQueue.poll();
                    if(ladders > 0) ladders--;
                    else return i;
                }
            }
        }

        return heights.length - 1;
    }

    public static void main(String[] args) throws Exception {
        int arr[] = { 4, 12, 2, 7, 3, 18, 20, 3, 19 };

        int result = furthestBuilding(arr, 10, 2);
        System.out.println(result);
    }

}
