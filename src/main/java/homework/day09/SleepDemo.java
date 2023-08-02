package homework.day09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SleepDemo {
    public static void main(String[] args) {
        System.out.println("program starts");
        System.out.println("enter the duration:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;
        try {
            n = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            for (int i = n; i > 0; i--) {
                System.out.println(i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("program ends");
    }
}
