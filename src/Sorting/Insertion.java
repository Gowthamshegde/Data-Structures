package Sorting;

import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {
        int [] arr={9,6,8,1,7,5,4,1,1,2};
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }else{
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
