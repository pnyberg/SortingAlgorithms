import java.util.List;

public class BubbleSort {
	public static void sort(int[] vector) {
		int endIndex = vector.length - 1;

		for(; endIndex > 0 ; endIndex--) {
			int highestIndex = 0;
			for(int n = 1 ; n <= endIndex ; n++) {
				if (vector[n] > vector[highestIndex]) {
					highestIndex = n;
				}
			}
			int temp = vector[endIndex];
			vector[endIndex] = vector[highestIndex];
			vector[highestIndex] = temp;
		}
	}

	public static void sort(List<Integer> list) {
		int endIndex = list.size() - 1;

		for(; endIndex > 0 ; endIndex--) {
			int highestIndex = 0;
			for(int n = 1 ; n <= endIndex ; n++) {
				if (list.get(n) > list.get(highestIndex)) {
					highestIndex = n;
				}
			}
			int temp = list.get(endIndex);
			list.set(endIndex, list.get(highestIndex));
			list.set(highestIndex, temp);
		}
	}
}