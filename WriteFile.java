import java.io.*;
import java.util.*;
public class WriteFile 
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter text to be written");
        String s = in.nextLine();
        try{
        FileWriter obj = new FileWriter("file1.txt");
        obj.write(s);
        obj.close();
        System.out.println("Successful");
        }
        catch(Exception e)
        {
            System.out.println("Unsuccesful");
        }
    }    
}
