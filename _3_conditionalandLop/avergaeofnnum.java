package _3_conditionalandLop;

public class avergaeofnnum {
    public static void main(String[] args) {
        fun(3,7,8,10,12,15);
    }
    static void fun(int...n){
        int sum=0;
        int avg;
        for(int num:n){
            sum=sum+num;
        }
     avg=sum/n.length;
        System.out.println(avg);
    }
}
