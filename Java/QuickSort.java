/**
 * Complexity: n log n 
 * Space: n
 * 
 * @author http://www.java2novice.com/java-sorting-algorithms/quick-sort/
 */

package sortingAlgorithms;

public class QuickSort {
    private static int array[];
 
    public static void sort(int[] array) {         
        QuickSort.array = array;
        quickSort(0, array.length - 1);
    }
 
    private static void quickSort(int lowerIndex, int higherIndex) {
    	if (lowerIndex >= higherIndex) {
    		return;
    	}
    	
        int i = lowerIndex;
        int j = higherIndex;

        int pivot = array[(higherIndex+lowerIndex)/2];

        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                exchangeNumbers(i, j);
                i++;
                j--;
            }
        }
        quickSort(lowerIndex, j);
        quickSort(i, higherIndex);
    }
 
    private static void exchangeNumbers(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}