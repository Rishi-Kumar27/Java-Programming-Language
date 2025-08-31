package Functions;
import java.util.*;

class Algebra {
   int sum(int a , int b){
      int ans = a + b;
      return ans;
   }
}


public class Main {
    public static void main(String[] args) {
        Algebra obj = new Algebra();

        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        System.out.print("The Sum of Given Number:");
        int ans = obj.sum(a , b);
        System.out.print(ans);
    }
}
