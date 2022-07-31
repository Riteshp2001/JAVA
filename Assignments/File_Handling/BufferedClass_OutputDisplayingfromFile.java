package File_Handling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedClass_OutputDisplayingfromFile {
    public static void main(String[] args) throws IOException {
        int i;
        BufferedReader b = new BufferedReader(new FileReader("D:\\Vs Code Projects\\Java-Camp\\src\\File_Handling\\Buffered_Class.txt"));
//buffer read function
//        while ((i=b.read())!=-1) {
//            System.out.print((char)i);//reads one character at a time and displays
//        }
//        b.close();

        //print Multiple Lines in a single loop
//buffer readLine function
//        String s = b.readLine();
//        System.out.println(s);//prints only first line of txt file
//
//        System.out.println("\n-------------------Looping through---------------------\n");
//
//        while((s=b.readLine())!=null){
//            System.out.println(s);//prints all the line in txt file from second line as we printed first line earlier
//        }
//        b.close();
    }
}
