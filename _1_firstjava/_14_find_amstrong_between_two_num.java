//To find Armstrong Number between two given number.


public class _14_find_amstrong_between_two_num {
    public static void main(String[] args) {
int start=50;
int end=500;
        for (int num = start; num <=end ; num++) {
            int original=num;
            int temp=num;
            int count=0;
            int sum=0;

            //digit count
            while(temp>0){
                temp=temp/10;
                count++;
            }
            temp=original;

            //taking one one digit and sum of them after using math.power
            while(temp>0){
                int rem=temp%10;
                sum=sum+(int)Math.pow(rem,count);
                temp=temp/10;

            }
            if (sum==original){
                System.out.println(original);
            }

        }
    }
}
