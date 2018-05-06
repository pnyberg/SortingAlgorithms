/**
 * Complexity: n log n
 * Space: n
 * 
 * @author http://www.code2learn.com/2011/09/heapsort-array-based-implementation-in.html
 */

package sortingAlgorithms;

public class HeapSort {
    private static int[] array;
    private static int n;
    private static int left;
    private static int right;
    private static int largest;
    
    public static void sort(int[] array){
        HeapSort.array = array;
        buildheap(array);
        
        for (int i = n ; i > 0 ; i--) {
            exchange(0, i);
            n = n-1;
            maxheap(array, 0);
        }
    }
    
    private static void buildheap(int[] array){
        n = array.length-1;
        for (int i = n/2 ; i >= 0 ; i--) {
            maxheap(array, i);
        }
    }
    
    private static void maxheap(int[] array, int i){ 
        left = 2*i;
        right = 2*i+1;

        if (left <= n && array[left] > array[i]){
            largest=left;
        } else{
            largest=i;
        }
        
        if (right <= n && array[right] > array[largest]) {
            largest = right;
        }
        if (largest != i) {
            exchange(i,largest);
            maxheap(array, largest);
        }
    }
    
    private static void exchange(int i, int j) {
        int t = array[i];
        array[i] = array[j];
        array[j] = t; 
    }
}