package setting_insertion_sort;

public class InsertionSort {
    public static void insertionSort(int[] list) {
        int n = list.length;
        for (int i = 1; i < n; i++) {
            int key = list[i];
            int j = i - 1;
            while (j >= 0 && list[j] > key) {
                list[j + 1] = list[j];
                j--;
            }
            list[j+1] = key;
        }
    }

    public static void main(String[] args) {
        int[] list = {1,2,5,4,3,6,9,7,-2};
        insertionSort(list);
        for ( int item : list) {
            System.out.println(item);
        }
    }
}
