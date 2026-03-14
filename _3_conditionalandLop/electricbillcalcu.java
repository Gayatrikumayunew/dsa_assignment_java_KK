package _3_conditionalandLop;

import java.util.Scanner;

public class electricbillcalcu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int unit=sc.nextInt();
        double bill;
        if(unit<=100){
            bill=unit*5;
        }
        if(unit<=200){
          bill=(100*5)+((unit-100)*7);
     }
        else{
            bill=(100*5)+(100*7)+((unit-200)*10);
        }
        if(bill>1000){
            bill+=bill*0.10;// subcharge
        }
        System.out.println(bill);
    }
}
