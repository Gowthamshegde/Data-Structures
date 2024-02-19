public class ReversedArray {
//    public static void main(String[] args) {
//        int arr[]={1};
//        int target=2;
//        int pivot=PivotFind(arr);
//        System.out.println(pivot);
//        if (pivot==-1){
//            int x=SeachInBinary(arr,target,0,arr.length-1);
//            System.out.println(x);
//        }
//        else if (target==arr[pivot]){
//            System.out.println(pivot);
//        } else if (target>arr[0]) {
//            int x=SeachInBinary(arr,target,0,arr.length-1);
//            System.out.println(x);
//        } else if (target<arr[arr.length-1]) {
//            int x=SeachInBinary(arr,target,pivot+1,arr.length-1);
//            System.out.println(x);
//        }else{
//            System.out.println("not found");
//        }
//    }
//
//    static int SeachInBinary(int [] arr,int target,int start,int end){
//        while(start<=end){
//            int mid =start+(end-start)/2;
//
//            if (target<arr[mid]){
//                end=mid-1;
//
//            } else if (target>arr[mid]) {
//                start=mid+1;
//            }else{
//                return mid;
//            }
//        }
//        return -1;
//    }
//
//    static int PivotFind(int [] arr){
//        int start =0;
//        int end=arr.length-1;
//
//        while(start<=end){
//            int mid=start+(end-start)/2;
//
//            if(mid<end && arr[mid]>arr[mid+1]){
//                return mid;
//            }
//            if( mid>start && arr[mid]<arr[mid-1]){
//                return mid-1;
//            }
//            if(arr[mid]>arr[start]){
//                start=mid+1;
//            }else{
//              end=mid-1;
//            }
//
//        }
//        return -1;
//    }
//}
public static void main(String[] args) {
    int arr []={1};
    int target=2;
    int x=search(arr,target);
    System.out.println(x);
}

    static int search(int[] nums, int target) {
        int pivot=findPivot(nums);
        System.out.println(pivot);
        if (pivot==-1){
            int x=findBinarySearch(nums,0,nums.length-1,target);
            return x;
        }else if(nums[pivot]==target){
            return pivot;
        }else if(target>=nums[0]){
            int x=findBinarySearch(nums,0,pivot-1,target);
            return x;
        }else if(target<=nums[nums.length-1]){
            int x=findBinarySearch(nums,pivot+1,nums.length-1,target);
            return x;
        }else{
            return -1;
        }

    }
    static int findBinarySearch(int [] arr,int start,int end,int target){
        while(start<=end){
            int mid=start+(end-start)/2;

            if(target>arr[mid]){
                start=mid+1;
            }else if(target<arr[mid] ){
                end=mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    static int findPivot(int[] arr){
        int start=0;
        int end=arr.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;

            if (mid < end && arr[mid]>arr[mid+1]){
                return mid;
            }else if (mid > start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if (arr[mid]>arr[start]){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
}
