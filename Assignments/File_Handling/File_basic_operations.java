package File_Handling;
import java.io.*;

public class File_basic_operations {
    public static void main(String[] args) throws IOException{
        int i=0;
        File f = new File("D:\\Vs Code Projects\\Java-Camp\\src\\File_handling\\File_handlingtest.txt");
        f.createNewFile();//Creates file in memory first then displays test.txt in folder

        System.out.println(f.getPath());
        System.out.println("Does File Exists :"+f.exists());
        System.out.println("Is it Read-only file? :"+f.exists());
        System.out.println("File size is :"+f.length());
        System.out.println("Last Modified Current File : "+f.lastModified());
        f.delete();//deletes file in memory first and displays False
        System.out.println("Does File Exists after deletion :"+f.exists());
    }
}
