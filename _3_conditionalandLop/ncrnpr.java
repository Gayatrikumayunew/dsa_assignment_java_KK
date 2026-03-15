package _3_conditionalandLop;

public class ncrnpr
{
    public static void main(String[] args) {
        int n=6;
        int r=3;
        int npr=fac(n)/fac(n-r);
        System.out.println(npr);
        int ncr=fac(n)/(fac(r)*fac(n-r));
        System.out.println(ncr);

    }
    static int fac(int n){
        int fac=1;
        for (int i=1;i<=n;i++){
         fac=fac*i;
        }
        return fac;
    }
}
