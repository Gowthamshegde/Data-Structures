public class FindEvenDigitNumber {
    public static void main(String[] args) {
        int [] arr={233,34,5677,1,3,34567,234567};
       int digits=findNumber(arr);
        System.out.println(digits);
    }
    public static int findNumber(int[] arr){
        int num=0;

        for (int i = 0; i < arr.length; i++) {
            int x=arr[i];
            int digits=0;
            while (x>0){
                digits++;
                x=x/10;
            }
            if(digits % 2==0){
                num++;
            }

        }

    return num;
    }
}
