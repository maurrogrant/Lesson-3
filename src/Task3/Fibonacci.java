package Task3;

// Класс для работы с последовательностью Фибоначчи
public class Fibonacci {
    // Метод для печати последовательности Фибоначчи до N
    public static void printFibonacci(int N) {
        for (int i = 0; i < N; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println(); // Переход на новую строку после вывода
    }

    // Рекурсивный метод для вычисления n-го числа Фибоначчи
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n; // Базовые случаи: F(0) = 0, F(1) = 1
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2); // Рекурсивный вызов
        }
    }
}
