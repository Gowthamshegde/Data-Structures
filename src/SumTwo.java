public class SumTwo {
    public static void main(String[] args) {
        System.out.println();
    }

    public int[] twoSum(int[] nums, int target) {
        for( int i=0 ; i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int []{nums[i],nums[j]};
                }
            }
        }
        return new int [] {-1,-1};
    }
}
