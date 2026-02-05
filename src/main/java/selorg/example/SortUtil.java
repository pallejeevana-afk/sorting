public class SortUtil {

    // Method to sort an array in ascending order
    public int[] sortArray(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n-1; i++) {
            for(int j = 0; j < n-1-i; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }

    // Optional main method to run directly
    public static void main(String[] args) {
        SortUtil util = new SortUtil();
        int[] arr = {5, 2, 9, 1, 3};
        int[] sorted = util.sortArray(arr);

        System.out.print("Sorted array: ");
        for(int num : sorted) {
            System.out.print(num + " ");
        }
    }
}