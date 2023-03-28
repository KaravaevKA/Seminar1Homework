package Task;

import java.util.Scanner;

public class TriangleNums {
    public static int GetTirangleNum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число N: ");
        int numN = sc.nextInt();
        return (numN * (numN + 1))/2;
    }
}
