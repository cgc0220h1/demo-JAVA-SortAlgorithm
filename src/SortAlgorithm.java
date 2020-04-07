public class SortAlgorithm<E extends Number> {
    private E[] array;

    public SortAlgorithm(E[] array) {
        this.array = array;
    }

    public E[] selectionSort() {
        boolean needNextSort;
        for (int mainPointer = 0; mainPointer < array.length - 1; mainPointer++) {
            E min = array[mainPointer];
            int indexOfMin = mainPointer;
            //Find min in un-sorted array
            for (int inner = mainPointer + 1; inner < array.length; inner++) {
                if (min.doubleValue() > array[inner].doubleValue()) {
                    min = array[inner]; // Change min to value found in un-sorted array
                    indexOfMin = inner;
                }
            }
            //Change position of new min value to the position of current pointer in sorted array
            if (indexOfMin != mainPointer) {
                array[indexOfMin] = array[mainPointer];
                array[mainPointer] = min;
            }
        }
        return array;
    }

    public E[] bubbleSort() {
        //Determine if the array is sorted and don't need to be sort again
        boolean needNextSort;
        for (int sortTimes = 1; sortTimes < array.length; sortTimes++) {
            needNextSort = false;
            for (int inner = 0; inner < array.length - sortTimes; inner++) {
                if (array[inner].doubleValue() > array[inner + 1].doubleValue()) {
                    //Swap two value
                    E temp = array[inner];
                    array[inner] = array[inner + 1];
                    array[inner + 1] = temp;
                    needNextSort = true;
                }
            }
            if (!needNextSort) {
                break;
            }
        }
        return array;
    }

    public void displayStepBubbleSort() {
        //Determine if the array is sorted and don't need to be sort again
        boolean needNextSort;
        for (int sortTimes = 1; sortTimes < array.length; sortTimes++) {
            needNextSort = false;
            for (int inner = 0; inner < array.length - sortTimes; inner++) {
                if (array[inner].doubleValue() > array[inner + 1].doubleValue()) {
                    //Swap two value
                    System.out.println("Swap "
                            + array[inner]
                            + " with "
                            + array[inner + 1]);
                    E temp = array[inner];
                    array[inner] = array[inner + 1];
                    array[inner + 1] = temp;
                    needNextSort = true;
                }
            }
            if (!needNextSort) {
                System.out.println("Array may be sorted and doesn't need to continue ");
                break;
            }
            //Display the list after each sort
            System.out.println("List after the "
                    + sortTimes
                    + "'sort: ");
            for (E number : array) {
                System.out.print(number + "\t");
            }
            System.out.println();
            System.out.println("-----------------------");
        }
    }
}
