package stackandqueue.circulartourproblem;

import static stackandqueue.circulartourproblem.CircularTour.findStartingPump;

public class Main {
    public static void main(String[] args) {
        int[] petrol = {4, 6, 7, 4};
        int[] distance = {6, 5, 3, 5};

        int startPump = findStartingPump(petrol, distance);
        if (startPump == -1)
            System.out.println("No possible tour");
        else
            System.out.println("Start at petrol pump index: " + startPump);
    }
}