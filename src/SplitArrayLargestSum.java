public class SplitArrayLargestSum {
    public static void main(String[] args) {
        int []arr={7,2,5,10,8};
        int k=0;
        int x=splitArray(arr,2);
        System.out.println(x);
    }
    static int splitArray(int[] arr, int k) {
        int start=0;
        int end=0;
        for(int i=0;i<arr.length;i++){
            start=Math.max(start,arr[i]);
            end+=arr[i];
        }
        while(start<=end){
            int mid=start+(end-start)/2;
            int max=0;
            int pieces=1;
            for(int num:arr){
                if((max+num >=mid)){
                    max=num;
                    pieces++;
                }else{
                    max+=num;
                }
            }
            if(pieces>k){
                start=mid+1;
            }else{
                end=mid;
            }

        }
        return end;
    }

        }



