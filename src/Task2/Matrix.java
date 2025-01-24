import java.util.Random;

public class Matrix {
    private int[][] array; // Двумерный массив
    private int size; // Размер матрицы

    // Конструктор для создания матрицы заданного размера
    public Matrix(int size) {
        this.size = size;
        array = new int[size][size];
        fillArray(); // Заполнение массива случайными числами
    }

    // Метод для заполнения матрицы случайными числами
    private void fillArray() {
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = random.nextInt(100); // Случайные числа от 0 до 99
            }
        }
    }

    // Метод для вывода матрицы на экран
    public void printArray() {
        System.out.println("Сгенерированный массив:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Метод для вычисления суммы диагоналей
    public int[] calculateDiagonalSums() {
        int primaryDiagonalSum = 0; // Сумма основной диагонали
        int secondaryDiagonalSum = 0; // Сумма побочной диагонали

        for (int i = 0; i < size; i++) {
            primaryDiagonalSum += array[i][i]; // Основная диагональ
            secondaryDiagonalSum += array[i][size - 1 - i]; // Побочная диагональ
        }
        
        return new int[]{primaryDiagonalSum, secondaryDiagonalSum};
    }
}
