//Function overloading if done multiple times then code length increases
//so we use generic methods
//Keshav Mishra
import java.util.*;
public class GenericMethods {
    public static void main(String[] args) {
      Integer a[]={1,2,3,4,5};
      Character c[]={'k','e','s','h'};
      printMe(a);
      printMe(c);

    }
    /*public static void printMe(Integer i[])
    {
        for(Integer x:i)
        {
            System.out.print(x);
            
        }
        System.out.println();
    }
    public static void printMe(Character i[])
    {
        for(Character x: i)
        {
            System.out.print(x);
            
        }
        System.out.println();
    }*/
    //Generic Method
    public static <T> void printMe(T[] x)  //Array x of T type..<T> convention to specify generic method.<T> should be always before void.
    {
        for(T i:x)
        {
            System.out.printf("%s",i);
           
        }
        System.out.println();
    }
}
