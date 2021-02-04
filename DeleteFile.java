import java.io.*;
import java.util.*;
class DeleteFile
{
    public static void main(String[] args) {
        File obj = new File("file1.txt");
        try
        {
            if(obj.delete())
            {
                System.out.println("File deleted");
            }
        }
        catch(Exception e)
        {
            System.out.println("Unsuccesful delete");
        }
    }
}