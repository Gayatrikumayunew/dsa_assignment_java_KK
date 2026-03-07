import com.sun.org.apache.xml.internal.resolver.readers.SAXCatalogParser;

import java.util.Scanner;

public class _04_hcf_lcm {
    public static void main(String[] args) {
        System.out.println("Enter first number");
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int first=num1;
        System.out.println("Enter Second number");
        Scanner sc1=new Scanner(System.in);
        int num2=sc.nextInt();
int sec=num2;
        while(num2!=0){
           int rem=num1%num2;
            num1=num2;
            num2=rem;
        }
        System.out.println("HCF of given number is:"+num1);
        int lcm=(first*sec)/num1;
        System.out.println(lcm);
    }
}
