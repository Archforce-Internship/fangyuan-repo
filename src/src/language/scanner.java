package language;

import java.util.Scanner;

import static java.lang.Math.max;

public class scanner {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int result = max(c,max(a,b));
        System.out.println(result);
    }
}
