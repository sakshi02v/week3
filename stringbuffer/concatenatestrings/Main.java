package stringbuffer.concatenatestrings;

import static stringbuffer.concatenatestrings.StringConcatenation.concatenateString;

public class Main {
    public static void main(String[] args) {
        String [] str=new String[4];
        str[0]="My";
        str[1]="name";
        str[2]="is";
        str[3]="Sakshi";
        String output=concatenateString(str);
        System.out.println("Concatenated String :"+output);

    }
}
