package _3_conditionalandLop;

import java.util.Scanner;

public class NumisarmstrongOrnot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int original=num;
        int n=num;
        int digit=0;
        double sum=0;
        while (num!=0){
            int rem=num%10;
            digit++;
            num=num/10;
        }
        System.out.println(digit);
        while (n!=0){
            int rem=n%10;
            double val=Math.pow(rem,digit);
            sum=sum+val;
n=n/10;

        }
        System.out.println(sum);
        if(original==sum){
            System.out.println("Armstrong Number");
        }
else {
            System.out.println("Not armstrong num");
        }

    }
}
