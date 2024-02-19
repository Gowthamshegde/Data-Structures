package Sorting;

import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
       int [] arr={8,6,3,5,1,3,9};
       for(int i=0 ;i< arr.length;i++){
           int max=findMax(arr,0,arr.length-1-i);
//           swaper
           int temp=arr[arr.length-1-i];
           arr[arr.length-1-i]=arr[max];
           arr[max]=temp;
       }
        System.out.println(Arrays.toString(arr));
    }

    public static int findMax(int [] arr,int start, int end) {
        int max=start;
        for(int i=start;i<=end;i++){
            if(arr[max]<arr[i]){
                 max=i;
            }
        }
        return max;
    }

}
