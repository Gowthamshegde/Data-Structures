public class OrderAcnostics {
    public static void main(String[] args) {
//        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int[] arr = {99, 80, 75, 22, 11, 10, 5, 2, -3};
        int target = -8;
        int ans = orderAgnosticBS(arr, target);
        System.out.println(ans);
    }

    static int orderAgnosticBS(int[] arr, int target) {
        int start=arr[0];
        int last=arr[arr.length-1];

        boolean ascending= (last-start) > 0;

        int b_start=0;
        int b_end=arr.length-1;
        while(b_start<=b_end){
            int mid=b_start+(b_end-b_start)/2;

            if (target>arr[mid]){
                if (ascending){
                    b_start=mid+1;
                }else{
                   b_end=mid-1;
                }

            } else if (target<arr[mid]) {
                if (ascending){
                    b_end=mid-1;
                }else {
                    b_start=mid+1;
                }

            }else{
                return mid;
            }


        }
        return -1;
    }
}
