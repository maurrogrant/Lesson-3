// Класс для реализации сортировки пузырьком
public class BubbleSort {
    public static int bubbleSort(int[] array) {
        int n = array.length;
        boolean swapped;
        int iterations = 0;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            // Проходим по массиву от 0 до n-i-1
            for (int j = 0; j < n - i - 1; j++) {
                iterations++; // Увеличиваем счетчик итераций
                if (array[j] > array[j + 1]) {
                    // Меняем местами array[j] и array[j+1]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            // Если не было обменов, массив уже отсортирован
            if (!swapped) {
                break;
            }
        }
        return iterations;
    }
}
