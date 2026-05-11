package _4_functions;

import java.util.Scanner;

//Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n. E.g.-
public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int fac=factorial_val(num);
        System.out.println(fac);
    }
    public static int factorial_val(int num){
        if(num==1){
            return 1;
        }
        else {
            return num*factorial_val(num-1);
        }
    }
}
