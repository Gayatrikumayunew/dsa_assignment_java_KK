package _4_functions;
import java.util.Scanner;
public class pythagores {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int num1=sc.nextInt();
       int num2=sc.nextInt();
       int num3=sc.nextInt();
      boolean ans=isPythagorean(num1,num2,num3);
        System.out.println(ans);

    }
    static boolean isPythagorean(int a, int b, int c) {

        int max = Math.max(a, Math.max(b, c));

        int sum;

        if (max == a) {
            sum = b * b + c * c;
            return a * a == sum;

        } else if (max == b) {
            sum = a * a + c * c;
            return b * b == sum;

        } else {
            sum = a * a + b * b;
            return c * c == sum;
        }
    }
}
