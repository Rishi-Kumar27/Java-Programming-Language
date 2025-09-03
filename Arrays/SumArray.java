package Arrays;
 class InnerSumArray {

    void findValue() {
        int[] arr = {1,8,9,5,10,8};
        int target = 8;
        int ans = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                ans = i;
                break;
            }
        }
        if (ans == -1) {
            System.out.println("Not found");
         }else{
            System.out.println("Found " + target + " at index " + ans);
         }
    }

    void MaxArray() {
        int[] arr = {21,45,10,6,32,49,3};

        int ans = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > ans) {
                ans = arr[i];
            }
        }

        System.out.println("Max " +  ans);
    }
     
    void SumOfArray() {

        int[] arr = {1,2,5,56,90,23};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i]; 
        }
        System.out.println(sum);
    }
}

public class SumArray {
    public static void main(String[] args) {
        InnerSumArray obj = new InnerSumArray();
        obj.findValue();
        
    }
}
