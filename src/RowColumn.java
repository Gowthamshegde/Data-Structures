import java.util.Arrays;

public class RowColumn {
    public static void main(String[] args) {
    int[][] arr={
            {10,20,30,40},
            {15,25,35,45},
            {28,29,37,49},
            {33,34,38,50}
    };
    int [] aar=findInMatrix(arr,5);
        System.out.println(Arrays.toString(aar));
    }
    static int[] findInMatrix(int [][] arr,int target){
        int row=0;
        int col=arr.length-1;
        while(row<=col || col>=0){
            if(arr[row][col]==target){
                return new int [] {row,col};
            }
            if(target<arr[row][col]){
                col--;
            }else{
                row++;
            }
        }
        return new int[]{-1,-1};

    }

}
