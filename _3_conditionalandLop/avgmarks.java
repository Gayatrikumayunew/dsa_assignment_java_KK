package _3_conditionalandLop;

public class avgmarks {
    public static void main(String[] args) {
        avgmark(45,16,78,56,74);
    }
    static void avgmark(int...mark){
        int sum=0;
        for (int i=0;i<mark.length;i++){
            sum=sum+mark[i];
        }
        System.out.println(sum/mark.length);
    }
}
