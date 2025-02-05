package countsort_sortstudentages;

class SortStudentsAge {

    // Method to sort the students age
    public static void ageSort(int[] arr) {

        int max = 0;  // to get the max index of the age array

        for (int j : arr) {
            if (j > max) {
                max = j;   // Storing the max element
            }
        }

        // Array to store the repetition of numbers
        int[] visited = new int[max+1];

        for (int j : arr) {
            visited[j]++;      // increasing the frequency of elements
        }

        int j = 0; // to track the arr to insert in sorted order


        for(int i=0; i<visited.length; i++) {

            if(visited[i] > 0) {

                while(j<arr.length && visited[i]>0) {
                    arr[j] = i;     // Store the element at correct position
                    j++; // increment the index of arr
                    visited[i]--;
                }

            }

        }

    }

}
