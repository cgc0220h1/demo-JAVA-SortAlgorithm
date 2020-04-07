public class SortAlgorithm<E extends Number> {
    private E[] array;

    public SortAlgorithm(E[] array) {
        this.array = array;
    }

    public E[] selectionSort(){
        for (int iIndex = 0; iIndex < array.length - 1; iIndex++) {
            E currentMin = array[iIndex];
            int currentMinIndex = iIndex;
            for (int jIndex = iIndex + 1; jIndex < array.length; jIndex++) {
                if (currentMin.doubleValue() > array[jIndex].doubleValue()) {
                    currentMin = array[jIndex];
                    currentMinIndex = jIndex;
                }
            }
            if (currentMinIndex != iIndex) {
                array[currentMinIndex] = array[iIndex];
                array[iIndex] = currentMin;
            }
        }
        return array;
    }

    public E[] bubbleSort() {
        return null;
    }
}
