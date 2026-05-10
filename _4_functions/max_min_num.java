//How to Find the Largest and Smallest of Three Numbers in Java? [Solved]

package _4_functions;

import java.util.Scanner;

public class max_min_num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3=sc.nextInt();
        max_min_num a=new max_min_num();
        int max=a.max_value(num1,num2,num3);
        int min=a.min_value(num1,num2,num3);
        System.out.println("max value is"+max);
        System.out.println("min value is"+min);




    }
    public int max_value(int num1,int num2,int num3){
        int ans=(num1>num2)?(num1>num3?num1:num3):(num2>num3?num2:num3);
        return ans;

    }
    public int min_value(int num1,int num2,int num3){
        int ans=Math.min(num1,Math.min(num2,num3));
        return ans;
    }
}
