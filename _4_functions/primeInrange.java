package _4_functions;

import java.util.Scanner;

public class primeInrange {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int start=sc.nextInt();
        int end=sc.nextInt();
        findprime(start,end);
    }
    public static void  findprime(int start,int end){
        for(int i=start;i<=end;i++){
            int c=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    c++;
                }
            }
            if (c==2){
                System.out.println(i);
            }
        }
    }
}
