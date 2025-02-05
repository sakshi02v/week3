package stringbuilder.reversestring;

class StringReverse {
    public static String reverseString (String input){
        StringBuilder str=new StringBuilder(input);
        str=str.reverse();
        return str.toString();
    }
}
