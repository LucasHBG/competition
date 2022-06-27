public class App {

    public static int maxScore(int[] cardPoints, int k) {
        int arr_size = cardPoints.length;
        
        int sum = Math.max(cardPoints[0], cardPoints[arr_size - 1]);
        
        for(int i = 1; i < k; i++){
            sum += Math.max(cardPoints[i], cardPoints[arr_size - 1 - i]);
            System.out.println("Leftmost: " + cardPoints[i]);
            System.out.println("Rightmost: " + cardPoints[arr_size - 1 - i]);
        }
        
        return sum;
    }

    public static void main(String[] args) throws Exception {
        int[] arr = {1,79,80,1,1,1,200,1};
        int k = 3;

        // int[] arr = {9,7,7,9,7,7,9};
        // int k = 7;
        int result = maxScore(arr, k);
        System.out.println("Sum: " + result);
    }
}
