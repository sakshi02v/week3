package comparedatastructures;

import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

public class Compare {

    public static void main(String[] args) {

        // Variable to get the runtime by
        long startTime;
        long endTime;

        // Different Dataset size
        int size1 = 10_00;
        int size2 = 10_00_0;
        int size3 = 10_00_00_0;

        // Compare for dataset of size1
        int[] arr1 = new int[size1];
        for(int i=0; i<size1; i++) {
            arr1[i] = (int)(Math.random()*999);
        }

        HashSet<Integer> hs1 = new HashSet<>(size1);
        for(int i=0; i<size1; i++) {
            hs1.add((int)(Math.random()*999));
        }

        TreeSet<Integer> ts1 = new TreeSet<>(Collections.singleton(size1));
        for(int i=0; i<size1; i++) {
            ts1.add((int)(Math.random()*999));
        }

        startTime = System.nanoTime();
        SearchInArray.searchArray(arr1,121);
        endTime = System.nanoTime();
        System.out.println("Runtime of search in array of size "+size1+" is "+(endTime-startTime));

        startTime = System.nanoTime();
        SearchInHashSet.searchHashSet(hs1,121);
        endTime = System.nanoTime();
        System.out.println("Runtime of search in HashSet of size "+size1+" is "+(endTime-startTime));

        startTime = System.nanoTime();
        SearchInTreeSet.searchTreeSet(ts1,121);
        endTime = System.nanoTime();
        System.out.println("Runtime of search in TreeSet of size "+size1+" is "+(endTime-startTime));


        // Compare for dataset of size2
        int[] arr2 = new int[size2];
        for(int i=0; i<size2; i++) {
            arr2[i] = (int)(Math.random()*9999);
        }

        HashSet<Integer> hs2 = new HashSet<>(size2);
        for(int i=0; i<size2; i++) {
            hs2.add((int)(Math.random()*999));
        }

        TreeSet<Integer> ts2 = new TreeSet<>(Collections.singleton(size2));
        for(int i=0; i<size2; i++) {
            ts2.add((int)(Math.random()*999));
        }


        startTime = System.nanoTime();
        SearchInArray.searchArray(arr2,121);
        endTime = System.nanoTime();
        System.out.println("\nRuntime of search in array of size "+size2+" is "+(endTime-startTime));

        startTime = System.nanoTime();
        SearchInHashSet.searchHashSet(hs2,121);
        endTime = System.nanoTime();
        System.out.println("Runtime of search in HashSet of size "+size2+" is "+(endTime-startTime));

        startTime = System.nanoTime();
        SearchInTreeSet.searchTreeSet(ts2,121);
        endTime = System.nanoTime();
        System.out.println("Runtime of search in TreeSet of size "+size2+" is "+(endTime-startTime));

        // Compare for dataset of size3
        int[] arr3 = new int[size3];
        for(int i=0; i<size3; i++) {
            arr3[i] = (int)(Math.random()*9999);
        }

        HashSet<Integer> hs3 = new HashSet<>(size3);
        for(int i=0; i<size3; i++) {
            hs3.add((int)(Math.random()*999));
        }

        TreeSet<Integer> ts3 = new TreeSet<>(Collections.singleton(size3));
        for(int i=0; i<size3; i++) {
            ts3.add((int)(Math.random()*999));
        }


        startTime = System.nanoTime();
        SearchInArray.searchArray(arr3,121);
        endTime = System.nanoTime();
        System.out.println("\nRuntime of search in array of size "+size3+" is "+(endTime-startTime));

        startTime = System.nanoTime();
        SearchInHashSet.searchHashSet(hs3,121);
        endTime = System.nanoTime();
        System.out.println("Runtime of search in HashSet of size "+size3+" is "+(endTime-startTime));

        startTime = System.nanoTime();
        SearchInTreeSet.searchTreeSet(ts3,121);
        endTime = System.nanoTime();
        System.out.println("Runtime of search in TreeSet of size "+size3+" is "+(endTime-startTime));

    }
}
