package stringbuilder.reversestring;

import static stringbuilder.reversestring.StringReverse.reverseString;

public class Main {
    public static void main(String[] args) {

        String input = "Hello";
        System.out.println("Original String:" + input);
        String output=reverseString(input);
        System.out.println("Reversed String:" + output);
    }
}