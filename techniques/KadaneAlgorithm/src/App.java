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
        int arr[] = { 5,4,-1,7,8 };
        int n = arr.length;
        
        int result = KadaneAlgorithm(arr, n);
        System.out.println("Maximum sum of 'k' consecutive elements: " + result);
        
        
        int arr2[] = { -2,1,-3,4,-1,2,1,-5,4 };
        int result2 = KadaneAlgorithm(arr2, arr2.length);
        System.out.println("Maximum sum of 'k' consecutive elements: " + result2);
        
        int arr3[] = { 1 };
        int result3 = KadaneAlgorithm(arr3, arr3.length);
        System.out.println("Maximum sum of 'k' consecutive elements: " + result3);
    }
}
