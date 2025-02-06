package linearsearch.searchforspecificword;

import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String [] arr=new String[4];
        System.out.println("Enter Sentences:");
        arr[0]=sc.nextLine();
        arr[1]=sc.nextLine();
        arr[2]=sc.nextLine();
        arr[3]=sc.nextLine();
        System.out.println("Enter word for searching in a sentence");
        String target=sc.next();
        System.out.println(SearchWordInListOfSentences.searchWord(arr,target));
    }
}

