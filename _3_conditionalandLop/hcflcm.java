package _3_conditionalandLop;

public class hcflcm {
    public static void main(String[] args) {
        int num1=25;
        int num=50;
        //store value
        int a=num1;
        int b=num;

        while(num!=0){
            int temp=num;
            num=num1%num;
            num1=temp;
        }
        System.out.println(num1);
        int hcf=num1;
        int lcm=(a*b)/hcf;
        System.out.println(lcm);
    }

}
