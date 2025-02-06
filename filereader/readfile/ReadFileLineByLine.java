package filereader.readfile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFileLineByLine {
    public static void main(String[] args) {
        BufferedReader reader=null;
        String filePath="C:\\Users\\hp\\Desktop\\CG Training\\Week3\\Day_4\\src\\filereader\\myfile";
        try {
            //File Reader used to open and use the file
            FileReader file = new FileReader(filePath);

            //BufferedReader used to wrap FileReader and enable reading
            reader = new BufferedReader(file);

            String line;
            //using readLine() for line by line reading of text lines
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
        finally {
            // Close the BufferedReader to release the resources
            try {
                if (reader != null) {
                    reader.close();
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
