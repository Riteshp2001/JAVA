package File_Handling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class File_CreationandOutput {
    public static void main(String[] args) throws IOException {//Need to handle Exception
        int i=0;
        File f = new File("D:\\Vs Code Projects\\Java-Camp\\src\\File_handling\\File_handlingtest.txt");
        f.createNewFile();//Creates file in memory first then displays test.txt in folder

        FileOutputStream f_out;

        f_out = new FileOutputStream(f,true);

        String test = "Hello World! this is File handling testing Going on";

        char[] arr = test.toCharArray();

        System.out.println("Length of String is :"+test.length());

        while(i<test.length()){
            f_out.write(arr[i]);i++;
        }
        f_out.close();

//        f.delete();//deletes file in memory first and displays False
        System.out.println("Does File Exists after deletion :"+f.exists());
    }
}
