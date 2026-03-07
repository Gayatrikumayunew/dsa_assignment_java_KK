package _3_conditionalandLop;
//Take integer inputs till the user enters 0 and print the largest number from all.

import java.util.Scanner;

public class largestnum_till_enterzero {
    public static void main(String[] args) {
        int max=0;
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        while(num!=0){
            if(num>max){
                max=num;
            }
            num=sc.nextInt();
        }
        System.out.println("Max value was"+max);
    }
}
