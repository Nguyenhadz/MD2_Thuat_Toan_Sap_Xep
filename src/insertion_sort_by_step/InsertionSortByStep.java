package insertion_sort_by_step;

import java.util.Scanner;

public class InsertionSortByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter list size:");
        int size = Integer.parseInt(scanner.nextLine());
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " value:");
        for (int i = 0; i < list.length; i++) {
            list[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Your input list: ");
        for (int item : list) {
            System.out.println(item + "\t");
        }
        System.out.println("\nBegin sort processing...");
        insertionSort(list);
    }

    public static void insertionSort(int[] list) {
        boolean needNextPass = true;
        int pos, x;
        for (int i = 1; i < list.length; i++) {
            needNextPass = false;
            x = list[i];
            pos = i;
            while (pos > 0 && x < list[pos - 1]) {
                System.out.println("Swap " + list[pos - 1] + " with " + list[pos]);
                list[pos] = list[pos - 1];
                pos--;
                needNextPass = true;
            }
            list[pos] = x;
            if (!needNextPass) {
                System.out.println("Array may be sorted and next pass not needed");
                break;
            }
            System.out.println("List after the " + i + " sort:");
            for (int item : list) {
                System.out.println(item + "\t");
            }
        }
    }
}
