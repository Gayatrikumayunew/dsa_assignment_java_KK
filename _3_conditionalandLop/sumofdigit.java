package _3_conditionalandLop;

public class sumofdigit {
    public static void main(String[] args) {
        int n=144;
        int sum=0;
        while(n!=0){
            int temp=n%10;
            sum=sum+temp;
            n=n/10;
        }
        System.out.println(sum);
    }
}
