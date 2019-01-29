//Написать программу, которая будет выводить таблицу умножения для введенного пользователем числа с клавиатуры.

import java.util.Scanner;

public class Task_01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число:");
        int a = scanner.nextInt();

        for (int b = 1; b <= 10; b++) {
            int result = a * b;
            System.out.println(a + " * " + b + " = " + result);
        }
    }
}