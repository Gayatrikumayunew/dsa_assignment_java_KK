package _4_functions;
//Java Program to Calculate Grade of Students

import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int score=sc.nextInt();
        String ans=grade_cal(score);
        System.out.println(ans);
    }
    public static String grade_cal(int score){
        if(score<40){
            return "Fail";
        }
        else if(score>=41&&score<=60){
            return "grade C";
        }
        else if (score>=61 &&score<=70) {
            return "grade B";


        } else if (score>=71&&score<=80) {
            return "grade A";
        }
        else if(score>=80&&score<=90){
            return "A+";
        }
        else {
            return "A++ Outstanding!";
        }

    }
}
