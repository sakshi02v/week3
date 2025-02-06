package inputstreamreader.readinputandwriteinfile;

import java.io.*;

public class UserInputIntoFile {
    public static void main(String[] args) {


        String filename = "C:\\Users\\hp\\Desktop\\CG Training\\Week3\\Day_4\\src\\inputstreamreader\\readinputandwriteinfile\\userinput";

        try (InputStreamReader inputStreamReader = new InputStreamReader(System.in);
             BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
             FileWriter fileWriter = new FileWriter(filename, true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {

            System.out.println("Enter text (type 'exit' to stop):");
            String line;
            while (!(line = bufferedReader.readLine()).equalsIgnoreCase("exit")) {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }

            System.out.println("Input written to " + filename);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

