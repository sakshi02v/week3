package stackandqueue.circulartourproblem;

class CircularTour {
    // Function to find the starting petrol pump index
    public static int findStartingPump(int[] petrol, int[] distance) {
        int n = petrol.length;
        int totalSurplus = 0;  // Total surplus petrol
        int currentSurplus = 0; // Current surplus petrol in the journey
        int startIndex = 0;     // Possible starting index

        for (int i = 0; i < n; i++) {
            int diff = petrol[i] - distance[i];
            totalSurplus += diff;
            currentSurplus += diff;

            // If at any point the surplus becomes negative, reset the start point
            if (currentSurplus < 0) {
                startIndex = i + 1;  // Move to the next pump
                currentSurplus = 0;  // Reset surplus
            }
        }

        // If total petrol is insufficient, return -1 (impossible to complete the tour)
        return (totalSurplus >= 0) ? startIndex : -1;
    }
}