package insertionsort_sortemployeesid;

class InsertionSort {

    // Method to sort an array
    public static int[] insertionSort(int[] arr) {

        // Iterate the array outer loop tracks sorted part of the array j tracks unsorted part
        for(int i=0; i<arr.length; i++) {

            // track unsorted part of array
            for(int j=i+1; j<arr.length; j++) {
                int temp = i;

                // to insert element in sorted array correct position
                while(temp >= 0) {
                    if(arr[temp] > arr[temp+1]) {
                        // Swapping of array elements
                        arr[temp] = arr[temp]+arr[temp+1];
                        arr[temp+1] = arr[temp]-arr[temp+1];
                        arr[temp] = arr[temp]-arr[temp+1];
                        temp--;
                    }
                    else{
                        break;
                    }
                }
                i++;
            }
        }
        return arr;
    }
}
