package Task1;

// Главный класс для запуска программы
public class Main {
    public static void main(String[] args) {
        int[] array = {64, 34, 25, 12, 22, 11, 90};
        int iterations = BubbleSort.bubbleSort(array);
        
        System.out.println("Отсортированный массив:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println("\nКоличество итераций: " + iterations);
    }
}
