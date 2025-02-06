package binarysearch.peakelementinarray;

import static binarysearch.peakelementinarray.PeakElementSearch.peakElement;

public class Main {
    public static void main(String[] args) {
        int [] arr={1,4,5,54,9,12};
        int peak=peakElement(arr);
        System.out.println("Peak element's index of array:"+peak+" and the value is :"+arr[peak]);
    }
}
