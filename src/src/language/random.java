package language;

import java.util.Random;
import java.util.Scanner;

public class random {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int num = random.nextInt(10000);
        int answer = sc.nextInt();
        while(answer!=num) {
            if(answer>num)
                System.out.println("大了");
            else
                System.out.println("小了");
            answer =sc.nextInt();

        }
        System.out.println("答案正确："+ num);
    }
}
