public class MaxScore {
    
    public int getMaxScoreSum(int[] cardPoints, int k) {
        int arr_size = cardPoints.length;

        int l = 0;
        int r = arr_size - k;
        
        int window_sum = 0;
        
        for(int i = r; i < arr_size; i++) window_sum += cardPoints[i];
        
        int max_sum = window_sum;

        while(r < arr_size){
            window_sum += cardPoints[l] - cardPoints[r];
            max_sum = Math.max(window_sum, max_sum);
            l += 1;
            r += 1;
        }
        
        return max_sum;
    }

}
