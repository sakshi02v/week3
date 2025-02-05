package selectionsort_sortexamscores;

class SortExamScores {

    // Method to sort the exam scores
    public static void sortScores(int[] arr) {

        // Iterate the array
        for(int i=0; i<arr.length; i++) {
            int minIndex = i;  // current min index

            for(int j=i+1; j<arr.length; j++) {
                if(arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }

            // Swap the minIndex element with ith index
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
