package _3_conditionalandLop;

public class factorial {
    public static void main(String[] args) {
        int n=5;
        int fac=1;
        for (int i=5;i>=1;i--){
            fac=fac*i;
        }
        System.out.println(fac);
    }
}
