package Task;

import java.util.Scanner;

public class SimpleCalculator {
    public static void menu(){
        System.out.println("Введите первое число");
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        System.out.println("Выберите необходимое действие: + - * /");
        String action = sc.next();
        System.out.println("Введите второе число");
        double y = sc.nextDouble();
        if (action.equals("/")){
            double z = x / y;
            System.out.println(z);
        }
        else if (action.equals("+")){
            double z = x + y;
            System.out.println(z);
        } else if (action.equals("-")) {
            double z = x - y;
            System.out.println(z);
        } else if (action.equals("*")) {
            double z = x * y;
            System.out.println(z);
        }
    }
}
