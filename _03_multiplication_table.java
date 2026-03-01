import java.util.Scanner;

public class _03_multiplication_table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int i=1;

        while(i <11){
            System.out.println(num*i);
            i++;
        }
    }
}
