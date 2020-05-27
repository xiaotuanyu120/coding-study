import java.util.Arrays;

public class BinarySearch {
	public static void main(String[] args) {
		int[] whitelist = {1, 2, 3, 4, 5, 6, 7};
		int[] input = {4, 5, 7, 8, 10, 9};

		for (int i=0;i<input.length;i++) {
            if (rank(input[i], whitelist) < 0) {
            	System.out.printf("output: %d\n", input[i]);
            }
		}
	}

	public static int rank(int key, int[] a) {
        int lo = 0;
        int hi = a.length - 1;

        while (lo <= hi) {
        	int mid = lo + (hi - lo)/2;
        	if (key < a[mid]) hi = mid - 1;
        	else if (key > a[mid]) lo = mid + 1;
        	else return mid;
        }

        return -1;
	}
}