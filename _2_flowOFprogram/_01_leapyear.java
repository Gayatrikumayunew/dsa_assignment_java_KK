import java.util.Scanner;

public class _01_leapyear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int year=sc.nextInt();
        if(year%2==0){
            System.out.println("Given year is leap year");
        }else{
            System.out.println("Given year is not leap year");
        }

    }
}
