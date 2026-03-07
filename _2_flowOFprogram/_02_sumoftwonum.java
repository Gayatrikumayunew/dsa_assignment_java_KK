import java.util.Scanner;

public class _02_sumoftwonum {
    public static void main(String[] args) {
        System.out.println("Enter the first number");
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        System.out.println("Enter the second number");
        Scanner sc1=new Scanner(System.in);
        int num2=sc.nextInt();
        long sum=num1+num2;
        System.out.println("Sum of number is :"+ sum);
    }
}
