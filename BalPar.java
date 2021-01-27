//Keshav Mishra
//Balanced Brackets Problem
import java.util.*;
import java.io.*;

public class BalPar
{
    public static void Balanced(String str) 
    {
        Stack<Character> s = new Stack<>();
        for(int i=0;i<str.length();i++)
        {
            char c=str.charAt(i);
            if(c=='[' || c=='(')
            {
                s.push(c);
            }
            else if(!s.empty() && ((c==')' && s.peek()=='(')||(c==']' && s.peek()=='['))) 
            {
                s.pop();
            }
            else
            {
                s.push(c);
            }
        }
        if(s.empty())
            System.out.println("Balanced");
        else
        System.out.println("No balanced");
        
    }
    
    public static void main(String[] args) {
        String str="[()]";
        Balanced(str);
        
    }
}
