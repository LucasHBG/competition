public class App {

    public static int KadaneAlgorithm(int arr[], int n){
        int max_current = arr[0];
        int max_global = arr[0];
        for(int i = 1; i < arr.length; i++){
            max_current = Math.max(arr[i], max_current + arr[i]);

            if(max_global < max_current )
                max_global = max_current;
        }

        if(max_global <= 0){
            return -1;
        }

        return max_global;
    }

    public static void main(String[] args) throws Exception {
        int arr[] = { -2, 3, 2, -1 };
        int n = arr.length;

        int result = KadaneAlgorithm(arr, n);

        System.out.println("Maximum sum of 'k' consecutive elements: " + result);
    }
}
