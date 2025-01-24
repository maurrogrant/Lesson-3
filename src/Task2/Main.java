package Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запрос у пользователя целого числа N
        System.out.print("Введите целое число N: ");
        int N = scanner.nextInt();

        // Создание и работа с матрицей
        Matrix matrix = new Matrix(N);
        matrix.printArray(); // Вывод массива на экран

        // Вычисление суммы диагоналей
        int[] diagonalSums = matrix.calculateDiagonalSums();
        System.out.println("Сумма основной диагонали: " + diagonalSums[0]);
        System.out.println("Сумма побочной диагонали: " + diagonalSums[1]);
        System.out.println("Общая сумма диагоналей: " + (diagonalSums[0] + diagonalSums[1]));

        scanner.close();
    }
}
