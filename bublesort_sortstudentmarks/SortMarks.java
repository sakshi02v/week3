package bublesort_sortstudentmarks;

public class SortMarks {

        // Method to sort an array
        public static int[] sortStudents(int[] arr) {

            //Iterate over the loop
            for(int i=0; i<arr.length; i++) {
                boolean flag = false;
                for(int j=0; j<arr.length-i-1; j++) {
                    if(arr[j] > arr[j+1]) {

                        // Swapping of array elements
                        arr[j] = arr[j]+arr[j+1];
                        arr[j+1] = arr[j]-arr[j+1];
                        arr[j] = arr[j]-arr[j+1];
                        flag = true;
                    }
                } // if array is sorted then return
                if(!flag) {
                    return arr;
                }
            }

            return arr;  // return the sorted array
        }
    }
}
