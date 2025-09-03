package Arrays;
import java.util.*;

public class InputArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int n = input.nextInt();

        int[] arr = new int[n];

        System.out.println("enter elements of array " + n);

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }


    }
}
