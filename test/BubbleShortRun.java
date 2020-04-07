import java.util.Scanner;

public class BubbleShortRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter list size: ");
        int size = scanner.nextInt();
        Integer[] list = new Integer[size];
        System.out.println("Enter " + list.length + " values: ");
        for (int index = 0; index < list.length; index++) {
            System.out.print("Enter value at index " + index + ": ");
            list[index] = scanner.nextInt();
            System.out.println();
        }
        System.out.println("Your List here: ");
        for (Integer number : list) {
            System.out.print(number + "\t");
        }
        System.out.println();
        SortAlgorithm<Integer> sortAlgorithm = new SortAlgorithm<>(list);
        System.out.println("---------------------");
        System.out.println("Begin sort Sequence..... ");
        sortAlgorithm.displayStepBubbleSort();
    }
}
