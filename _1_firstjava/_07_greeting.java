
//Take name as input and print a greeting message for that particular name.

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class _07_greeting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        System.out.println("Hi! "+name+" greeting of the day");
    }
}
