import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Запрос у пользователя целого числа N
        System.out.print("Введите целое число N: ");
        int N = scanner.nextInt();

        // Создание двумерного массива размером N на N
        int[][] array = new int[N][N];

        // Заполнение массива случайными числами и вывод на экран
        System.out.println("Сгенерированный массив:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                array[i][j] = random.nextInt(100); // Случайные числа от 0 до 99
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

        // Вычисление суммы диагоналей
        int primaryDiagonalSum = 0; // Сумма основной диагонали
        int secondaryDiagonalSum = 0; // Сумма побочной диагонали

        for (int i = 0; i < N; i++) {
            primaryDiagonalSum += array[i][i]; // Основная диагональ
            secondaryDiagonalSum += array[i][N - 1 - i]; // Побочная диагональ
        }

        // Вывод суммы диагоналей
        System.out.println("Сумма основной диагонали: " + primaryDiagonalSum);
        System.out.println("Сумма побочной диагонали: " + secondaryDiagonalSum);
        System.out.println("Общая сумма диагоналей: " + (primaryDiagonalSum + secondaryDiagonalSum));

        scanner.close();
    }
}
