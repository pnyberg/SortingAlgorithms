/**
 *  Complexity: n log n
 *  Space: 2*n
 *  
 * @author http://www.java2novice.com/java-sorting-algorithms/merge-sort/
 */

package sortingAlgorithms;

public class MergeSort {
    private static int[] array;
    private static int[] tempMergeArray;

    public static void sort(int[] array) {
        MergeSort.array = array;
        MergeSort.tempMergeArray = new int[array.length];
        doMergeSort(0, array.length - 1);
    }
 
    private static void doMergeSort(int lowerIndex, int higherIndex) {
        if (lowerIndex >= higherIndex) {
        	return;
        }

        int middle = (higherIndex + lowerIndex) / 2;

        doMergeSort(lowerIndex, middle);
        doMergeSort(middle + 1, higherIndex);

        mergeParts(lowerIndex, middle, higherIndex);
    }
 
    private static void mergeParts(int lowerIndex, int middle, int higherIndex) {
        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempMergeArray[i] = array[i];
        }

        int i = lowerIndex;
        int j = middle + 1;
        int k = lowerIndex;

        while (i <= middle && j <= higherIndex) {
            if (tempMergeArray[i] <= tempMergeArray[j]) {
                array[k] = tempMergeArray[i];
                i++;
            } else {
                array[k] = tempMergeArray[j];
                j++;
            }
            k++;
        }
        while (i <= middle) {
            array[k] = tempMergeArray[i];
            k++;
            i++;
        }
    }
}