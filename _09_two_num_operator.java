import java.util.Scanner;

public class _09_two_num_operator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num1");
        int num1=sc.nextInt();
        System.out.println("Enter num2");

        int num2=sc.nextInt();
        System.out.println("Enter operator");

        char op=sc.next().charAt(0);
        if(op=='+'){
            System.out.println(num1+num2);
        } else if (op=='-') {
            System.out.println(num1-num2);
        } else if (op=='*') {
            System.out.println(num1*num2);
        } else if (op=='/') {
            System.out.println(num1/num2);
        }else {
            System.out.println("invalid");
        }

    }
}
