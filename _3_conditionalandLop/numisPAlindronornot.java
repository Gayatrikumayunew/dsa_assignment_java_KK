package _3_conditionalandLop;

import java.util.Scanner;

//Find if a number is palindrome or not
public class numisPAlindronornot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        boolean ans=palindromornot(num);
//        int sum=0;
        if (ans) {
            System.out.println("palindrom number");


        }
        else {
            System.out.println("not palindrom");
        }
    }
    static boolean palindromornot(int num){
        int sum=0;
        int org=num;

        while (num!=0){
            int rem=num%10;
            sum=sum*10+rem;
            num=num/10;
        }
     return (org==sum);


    }
}
