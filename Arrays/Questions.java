package Arrays;
import java.util.Arrays;
import java.util.*;

public class Questions {

    // find smallest and largest value in array
    static int[] smallestAndLargest(int[] arr) {
       Arrays.sort(arr);
       int[] ans = {arr[0] , arr[arr.length - 1]};

       return ans;

    }


    // Array is sorted or not
    static  boolean isSortedArray(int[] arr){
        boolean check = true;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i-1]) {
                check = false;
                break;
            }
        }

        return check;
    }


    // Last occurrence of value in array like how many times it come
    static int lastOccurrence(int[] arr , int x) {

        int lastIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                lastIndex = i;
            }
        }
        return lastIndex;
    }


    // Number of occurrence 
    static int numberOccurrence(int arr[], int x) {

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the size of array: ");
     int n = sc.nextInt();

      int arr[] = new int[n];

     System.out.println("Enter the elements of array of size " + n);
      for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
      }

    //    System.out.println("Enter value of X");
    //     int x = sc.nextInt();

        // System.out.println("count of x: " + numberOccurrence(arr, x));
        // System.out.println("last occurrence of x: " + lastOccurrence(arr, x));

        // System.out.println("is sorted array: " + isSortedArray(arr));

        int[] ans = smallestAndLargest(arr);

        System.out.println("Smallest:" + ans[0]);
        System.out.println("Largest:" + ans[1]);

    }
}
