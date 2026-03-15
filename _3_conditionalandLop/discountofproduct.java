package _3_conditionalandLop;

import java.util.Scanner;

public class discountofproduct {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int originalprice=sc.nextInt();
        int discountpercent=sc.nextInt();
        int amount=(originalprice*discountpercent)/100;
        int finalprice=originalprice-amount;
        System.out.println(finalprice);

    }
}
