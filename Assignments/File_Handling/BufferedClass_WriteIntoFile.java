package File_Handling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedClass_WriteIntoFile {
    public static void main(String[] args) throws IOException {
        new File("D:\\Vs Code Projects\\Java-Camp\\src\\File_handling\\Buffered_Class.txt").createNewFile();
        FileWriter f = new FileWriter("D:\\Vs Code Projects\\Java-Camp\\src\\File_handling\\Buffered_Class.txt",true);
        BufferedWriter b = new BufferedWriter(f);
        b.write("This is Buffered Writer added into text");
        b.close();
    }
}
