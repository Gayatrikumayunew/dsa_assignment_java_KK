import java.util.Scanner;

public class _05_sum_of_till_x {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        while(true){
            System.out.println("Enter a number ");
            String in=sc.nextLine();
            if(in.equalsIgnoreCase("x")){
                break;
            }
            int num=Integer.parseInt(in);
            sum+=num;
        }
        System.out.println(sum);
    }
}
