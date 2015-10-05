
public class Large {
    /**
     * Finds the index of the largest element in the array
     * passed as argument. Assume that the array is neither
     * null nor empty. You may also assume that the array has
     * a unique large element.
     *
     * @param a an integer array with at least one element
     * @return the index of the largest element in the array
     */
    public static int indexOfLargest(int[] a) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i<a.length;i++)
            if (largest <a[i])
                largest = a[i];
        return largest;
    }

    public static void main(String[] args) {
        int[] arr = {-1, 2, 56, 34};
        // indexOfLargest is a static method so we don't have to create an object
        System.out.println(indexOfLargest(arr));
    }
}
