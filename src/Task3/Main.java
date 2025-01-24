package Task3;

import java.util.Scanner;

// Главный класс для запуска программы
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запрос у пользователя целого числа N
        System.out.print("Введите целое число N: ");
        int N = scanner.nextInt();

        System.out.println("Последовательность Фибоначчи до " + N + ":");
        Fibonacci.printFibonacci(N); // Вызов метода для печати последовательности

        scanner.close();
    }
}
