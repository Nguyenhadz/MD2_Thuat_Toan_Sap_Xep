package bubble_sort_by_step;

import java.util.Scanner;

public class BubbleSortByStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input list size:");
        int size = scanner.nextInt();
        int[] list = new int[size];
        System.out.println("Enter " + list.length + " value:");
        for ( int i = 0; i < list.length; i++) {
            list[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Your input list: ");
        for (int item : list) {
            System.out.println(item + "\t");
        }
        System.out.println("\nBegin sort processing...");
        bubbleSortByStep(list);
    }
    public static void bubbleSortByStep(int[] list) {
        boolean needNextPass = true;
        for ( int k = 1; k < list.length; k++) {
            needNextPass = false;
            for ( int i = 0; i < list.length - k; i++) {
                if (list[i] > list[i+1]) {
                    System.out.println("Swap " + list[i] +" with " + list[i+1]);
                    int item = list[i];
                    list[i] = list[i+1];
                    list[i+1] = item;
                    needNextPass = true;
                }
            }
            if (!needNextPass) {
                System.out.println("Array may be sorted and next pass not needed");
                break;
            }
            System.out.println("List after the " + k + " sort:");
            for ( int item : list) {
                System.out.println(item + "\t");
            }
            System.out.println();
        }
    }
}
