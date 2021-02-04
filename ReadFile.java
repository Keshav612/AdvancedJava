import java.io.*;
import java.util.*;
public class ReadFile 
{
    public static void main(String[] args) {
        try{
            File ob1 = new File("file1.txt");
            Scanner myReader = new Scanner(ob1);
            while(myReader.hasNext())
            {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        }
        catch(Exception e)
        {
            System.out.println("Error...");
        }    
    }
}
