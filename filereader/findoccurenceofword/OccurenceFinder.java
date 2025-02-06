package filereader.findoccurenceofword;

import java.io.*;

public class OccurenceFinder {
    public static void main(String[] args) {


        String filename = "C:\\Users\\hp\\Desktop\\CG Training\\Week3\\Day_4\\src\\filereader\\myfile";
        String targetWord = "line";
        int count = 0;

        try (FileReader fileReader = new FileReader(filename);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] words = line.split("\\s+"); // Split by whitespace
                for (String word : words) {
                    if (word.equalsIgnoreCase(targetWord)) {
                        count++;
                    }
                }
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }

        System.out.println("The word '" + targetWord + "' appears " + count + " times in the file.");
    }
}
