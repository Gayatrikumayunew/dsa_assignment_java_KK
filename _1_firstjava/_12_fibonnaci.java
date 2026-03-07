
//To calculate Fibonacci Series up to n numbers.


public class _12_fibonnaci {
    public static void main(String[] args) {
//        int n=10;
//        int a=0;
//        int b=1;
//        int c;
//        for(int i=1;i<=n;i++){
//            System.out.println(a+" ");
//            c=a+b;
//            a=b;
//            b=c;
//
//int n=12;
//        int a=0;
//        int b=1;
//        int c=0;
//        for(int i=3;i<=n;i++){
//            c=a+b;
//            a=b;
//            b=c;
//
//        }
//        System.out.println(c);


//find term number by fibonnaci series
        int a=0;
        int b=1;
        int c;
        int term=2;
        int target=610;
        while(b<target){
            c=a+b;
            a=b;
            b=c;
            term++;
        }
        if(b==target){
            System.out.println(term);
        }else{
            System.out.println("not fibbonacci");
        }
    }
}
