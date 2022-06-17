public class App {

    public static int WindowSliding(int arr[], int k, int n){
        
        if(n < k){
            System.out.println("Invalid");
            return 0;
        }

        int window_sum = 0;
        for(int i = 0; i < k; i++){
            window_sum += arr[i];
        }
        
        int max_sum = window_sum;

        for(int i = k; i < n; i++){
            window_sum += arr[i] - arr[i-k];
            max_sum = Math.max(window_sum, max_sum);
        }

        return max_sum;
    }

    public static void main(String[] args) throws Exception {
        int arr[] = { 1, 4, 2, 10, 2, 3, 1, 0, 20 };
        int k = 4;
        int n = arr.length;

        int result = WindowSliding(arr, k, n);

        System.out.println("Maximum sum of 'k' consecutive elements: " + result);
    }
}
