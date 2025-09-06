import java.util.*;

public class ArrayQuestions {

    static int findRepeatNumber(int[] arr) {
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                   return arr[i];
                }
            }
        }
        return -1;
    }

    static int findMax(int[] arr) {
        int mx = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > mx) {
                mx = arr[i];
            }
        }
        return mx;
    }

    static int secondMax(int[] arr) {
        int mx = findMax(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == mx) {
                arr[i] = Integer.MIN_VALUE;
            }
        }

      int secondMax = findMax(arr);
      return secondMax;
    }

    static int findUnique(int[] arr ) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        
        int ans = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                ans = arr[i]; 
            }
           
        }

        return ans;
    }

    static int targetSum(int[] arr, int target) {
        int n = arr.length;
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                  if (arr[i] + arr[j] + arr[k] == target) {
                    ans++;
                   }  
                }
            }

        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of array:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // System.out.println("Enter the target sum ");
        // int target = sc.nextInt();

        // System.out.println( targetSum(arr, target));

        // System.out.println(findUnique(arr));
        // System.out.println("secondmax:" + secondMax(arr));
        System.out.println(findRepeatNumber(arr));

    }
}
