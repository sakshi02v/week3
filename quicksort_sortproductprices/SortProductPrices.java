package quicksort_sortproductprices;

class SortProductPrices {

    // Swap function
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Method to put pivot on its correct place
    public static int partition(int[] arr, int low ,int high) {

        int i = low-1;
        int pivot = arr[high];

        for (int j = low; j <= high - 1; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }

        // Move pivot after smaller elements and
        // return its position
        swap(arr, i + 1, high);
        return i + 1;
    }

    // QuickSort
    public static void quickSort(int[] arr, int start, int end) {
        if(start >= end) {
            return;
        }
        int pi = partition(arr, start, end);

        // Recursive calls
        quickSort(arr,start, pi-1);
        quickSort(arr, pi+1, end);
    }
}
