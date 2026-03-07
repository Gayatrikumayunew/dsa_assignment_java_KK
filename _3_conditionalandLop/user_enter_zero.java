package _3_conditionalandLop;

import java.util.Scanner;

public class user_enter_zero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int sum=0;
        while(x!=0){

            sum=sum+x;
            x=sc.nextInt();
        }
        System.out.println("total sum:"+sum);

    }
}
