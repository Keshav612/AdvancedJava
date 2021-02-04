import java.io.*;
import java.util.*;
public class CreateFile 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter filename");
        Scanner in = new Scanner(System.in);
        String s=in.nextLine();
        s=s+".txt";
        File obj = new File(s);
        try 
        {
            if(obj.createNewFile())
            {
                System.out.println("File created with name "+obj.getName());
            }    
            else{
                System.out.println("File exists");
            }
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("Error occured");
        }
    }    
}
