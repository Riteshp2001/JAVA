package File_Handling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class File_CreationandInput {
    public static void main(String[] args) throws IOException {
    int i;
    FileInputStream f_in = new FileInputStream("D:\\Vs Code Projects\\Java-Camp\\src\\File_handling\\File_handlingtest.txt");

    do{
        i=f_in.read();
        if(i!=-1){
            System.out.print((char)i);
        }
    }while(i!=-1);
        System.out.println();
        f_in.close();
    }
}
