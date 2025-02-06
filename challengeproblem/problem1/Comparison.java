package challengeproblem.problem1;

import java.io.*;
import java.util.StringTokenizer;

public class Comparison {

    public static void compareStringConcatenation() {
        String text = "hello";
        int iterations = 1000000;

        // Using StringBuilder
        long startTime = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sb.append(text);
        }
        long endTime = System.nanoTime();
        System.out.println("StringBuilder Time: " + (endTime - startTime) / 1_000_000 + " ms");

        // Using StringBuffer
        startTime = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            sbf.append(text);
        }
        endTime = System.nanoTime();
        System.out.println("StringBuffer Time: " + (endTime - startTime) / 1_000_000 + " ms");
    }

    public static void compareFileReading(String filePath) {
        // Using FileReader
        long startTime = System.nanoTime();
        int wordCount = countWordsWithFileReader(filePath);
        long endTime = System.nanoTime();
        System.out.println("FileReader - Word Count: " + wordCount + ", Time: " + (endTime - startTime) / 1_000_000 + " ms");

        // Using InputStreamReader
        startTime = System.nanoTime();
        wordCount = countWordsWithInputStreamReader(filePath);
        endTime = System.nanoTime();
        System.out.println("InputStreamReader - Word Count: " + wordCount + ", Time: " + (endTime - startTime) / 1_000_000 + " ms");
    }

    public static int countWordsWithFileReader(String filePath) {
        int wordCount = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                wordCount += new StringTokenizer(line).countTokens();
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        return wordCount;
    }

    public static int countWordsWithInputStreamReader(String filePath) {
        int wordCount = 0;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filePath)))) {
            String line;
            while ((line = br.readLine()) != null) {
                wordCount += new StringTokenizer(line).countTokens();
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
        return wordCount;
    }
}
