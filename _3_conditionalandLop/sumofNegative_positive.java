package _3_conditionalandLop;

import java.util.Scanner;

public class sumofNegative_positive {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=1;
        int sumofneg=0;
        int evenpositive=0;
        int positiveodd=0;

        while(num!=0){
            System.out.println("enter number");
        num=sc.nextInt();

            if(num==0){
            break;
        }
        else if(num<0){
            sumofneg=sumofneg+num;
        }
        else if(num>0&&num%2==0){
            evenpositive=evenpositive+num;
        } else if (num>0&&num%2!=0) {
            positiveodd=positiveodd+num;
        }

        }
        System.out.println(num);
        System.out.println(positiveodd);
        System.out.println(evenpositive);
        System.out.println(sumofneg);
    }
}
