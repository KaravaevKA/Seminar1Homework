package Task;

import java.util.Scanner;

public class Factorial {
    public static int getFactorialNum(int num){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Введите число N: ");
//        int num = sc.nextInt();
        if (num == 1) return 1;
        return num * getFactorialNum(num-1);
    }
}
