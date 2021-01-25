import java.util.*;
public class MaxGeneric {
public static void main(String[] args) {
    System.out.println(max(23,42,1));
    System.out.println(max("apple","banana","touch"));
}   
public static <T extends Comparable<T>> T max(T a,T b,T c)   //We can't compare strings with > or < so we use comparable class.
{
    T m =a; //assume a is greatest.
    if(b.compareTo(a)>0)
    {
        m=b;
    }
    if(c.compareTo(m)>0)
    {
        m=c;
    }
    return m;

}
}
