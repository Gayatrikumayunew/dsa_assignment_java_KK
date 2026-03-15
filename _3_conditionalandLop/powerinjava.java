package _3_conditionalandLop;

public class powerinjava {
    public static void main(String[] args) {
        int base=15;
        int expo=3;
        int res=1;
        for (int i=1;i<=expo;i++){
            res=res*base;
        }
        System.out.println(res);
        System.out.println(Math.pow(base,expo));
    }
}
