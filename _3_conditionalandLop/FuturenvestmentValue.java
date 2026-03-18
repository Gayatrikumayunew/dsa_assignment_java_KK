package _3_conditionalandLop;

public class FuturenvestmentValue {
    public static void main(String[] args) {
        int p=1000;
        double r=5;
        r=r/100;
        int t=2;
        double FI=p*(Math.pow(1+r,t));
        System.out.println(FI);


    }
}
