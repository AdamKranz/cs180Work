public class MyArray {
    /**
     * Checks if the element at the index specified is
     *  greaterthan or equal (>=) to the sum of all other
     * elements in the array
     * @param arr a 1-dimensional array
     * @param index a int
     * @return
     *      false if arr is null or empty
     *      false if index is invalid (out of bound)
     *      false if arr = {1, 2, 3, 9} and index = 0
     *      false if arr = {1, 2, 3, 9} and index = 1
     *      true if arr = {1, 2, 3, 9} and index = 3
     */
    public static boolean isLarge(int[] arr, int index) {
        if (arr == null)
            return false;

        int len = arr.length;

        if(len == 0)
            return false;

        if (index < 0 || index >= len)
            return false;

        int sum = 0;
        for (int i = 0; i < len; i++) {
            if (i == index)
                continue;
            else
                sum = sum + arr[i];
        }


        return arr[index] >= sum;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 9};
        System.out.println(isLarge(null, 1)); // prints false;
        System.out.println(isLarge(new int[]{}, 1)); // prints false;
        System.out.println(isLarge(arr, -1)); // prints false;
        System.out.println(isLarge(arr, arr.length + 1)); // prints false;
        System.out.println(isLarge(arr, 0)); // prints false;
        System.out.println(isLarge(arr, 3)); // prints true;
    }
}
