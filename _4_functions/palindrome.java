package _4_functions;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int num=sc.nextInt();
        int ans=palindrome_num(num);
        if(ans==num){
            System.out.println("Palindrone");
        }
        else {
            System.out.println("not palindrome");
        }

    }
    public static int palindrome_num(int num){
        int sum=0;
        while (num!=0){
            int temp=num%10;
            sum=sum*10+temp;
            num=num/10;

        }
        return sum;
    }
}
