package conditionalandLop;

import java.util.Scanner;

public class subtractheproductandsum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int num=n;
        //product
        int product=1;
        while(n!=0){
            int rem=n%10;
            product=product*rem;
            n=n/10;
        }
        System.out.println(product);
        int sum=0;
        while(num!=0){
            int rem=num%10;
            sum=sum+rem;
            num=num/10;
        }
        System.out.println(sum);
        System.out.println("subtraction="+(product-sum));
    }
}
