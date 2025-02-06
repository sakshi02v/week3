package binarysearch.indexofsmallestelement;

import static binarysearch.indexofsmallestelement.SmallestElementIndex.rotationPoint;

public class Main {
    public static void main(String[] args) {
        int [] arr={5,6,7,8,9,1,2,3,4};
        int rotation=rotationPoint(arr);
        System.out.println("Rotation index of the array:"+ rotation+"\nSmallest element of index:"+arr[rotation]);
    }
}
