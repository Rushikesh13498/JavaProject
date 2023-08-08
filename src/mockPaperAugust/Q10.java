package mockPaperAugust;

	import java.util.Arrays;

	public class Q10 {
	    public static void main(String[] args) {
	        int[] arr1 = {1, 3, 5, 7, 9};
	        int[] arr2 = {2, 3, 6, 8, 10};

	        int[] mergedArray = mergeSortedArrays(arr1, arr2);
	        System.out.println(Arrays.toString(mergedArray));
	    }

	    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
	        int length1 = arr1.length;
	        int length2 = arr2.length;
	        int[] merged = new int[length1 + length2];

	        int i = 0, j = 0, k = 0;

	        while (i < length1 && j < length2) {
	            if (arr1[i] < arr2[j]) {
	                merged[k++] = arr1[i++];
	            } else if (arr1[i] > arr2[j]) {
	                merged[k++] = arr2[j++];
	            } else {
	                merged[k++] = arr1[i++];
	                j++;
	            }
	        }

	        while (i < length1) {
	            merged[k++] = arr1[i++];
	        }

	        while (j < length2) {
	            merged[k++] = arr2[j++];
	        }

	        int[] sortedArray = new int[k];
	        System.arraycopy(merged, 0, sortedArray, 0, k);

	        return sortedArray;
	    }
	}


