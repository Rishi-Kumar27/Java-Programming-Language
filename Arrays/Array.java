package Arrays;
class ArrayExample {

    void multiArrays() {
        int[][] arr = { { 21, 23, 24 }, { 8, 5, 9 }, { 67, 34, 55 } };


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }

        // System.out.print(arr[0][0]);
        // System.out.print(arr[0][1]);
        // System.out.print(arr[0][2]);

        // System.out.println();

        // System.out.print(arr[1][0]);
        // System.out.print(arr[1][1]);
        // System.out.print(arr[1][2]);

        // System.out.println();

        // System.out.print(arr[2][0]);
        // System.out.print(arr[2][1]);
        // System.out.print(arr[2][2]);
    }

    void demoArrays() {
        int[] ages = new int[3];
        float[] weights = new float[3];
        String[] name = { "rishi", "prem", "kunal", "preeti" };

        ages[0] = 21;
        ages[1] = 22;
        ages[2] = 23;

        int n = ages.length;

        // System.out.println(ages.length);
        // System.out.println(weights.length);
        // System.out.println(name.length);

        for (int i = 0; i < n; i++) {          //for loop
            System.out.println(ages[i]);
        }

        for (int age : ages) {                 //for each loop
            System.out.println(age);
        }

        int i = 0;
        while (i < n) {                      // while loop
            System.out.println(ages[i]);
            i++;
        }

        // System.out.println(ages[0]);
        // System.out.println(ages[1]);
        // System.out.println(ages[2]);

        // System.out.println(name[0]);
        // System.out.println(name[1]);
        // System.out.println(name[2]);
    }

}

public class Array {
    public static void main(String[] args) {
        ArrayExample obj = new ArrayExample();
        // obj.demoArrays();
        obj.multiArrays();
    }
}
