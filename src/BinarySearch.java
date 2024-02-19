public class BinarySearch {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,5,6,7,8,9,23,445,6788};
        int start=0;
        int end=arr.length;

        int index=-1;
        int target=678;
        while(start<=end){
            int middle=(end+start)/2;
            if( arr[middle]==target){
                index=middle;
                System.out.println(index);
                break;
            }
            if (target<arr[middle]){
                end=middle-1;
            }
            if(target>arr[middle]){
                start=middle+1;
            }
        }
    if(index==-1){
        System.out.println("not found");
    }

    }
}
