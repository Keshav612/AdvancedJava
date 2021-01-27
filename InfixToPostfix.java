import java.util.*;
public class InfixToPostfix 
{
    public static void main(String[] args) 
    {
        String str = "a+b*(c^d-e)^(f+g*h)-i"; 
        System.out.println(InfixPostfix(str)); 
    }   
    public static String InfixPostfix(String str)
    {
        String res=new String("");
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++)
        {   
            char c = str.charAt(i);
            if(Character.isLetterOrDigit(c))
            {
                res+=c;
            }
            else if(c=='(')
            {
                s.push(c);
            }
            else if(c==')')
            {
                while(!s.empty() && s.peek()!='(')
                {
                    res+=s.pop();
                    
                }
                s.pop();
            }
            else
            {
                while(!s.empty() && Prec(c)<=Prec(s.peek()))
                {
                    res+=s.pop();
                }
                s.push(c);
            }
            

        } 
        while(!s.empty())
        {
            if(s.peek()=='(')
            {
                return "Invalid";
            }
            else
            {
                res+=s.pop();
            }}
            return res;
        }  
    
    static int Prec(char ch)
    {
        switch(ch)
        {
            case '+' :
            case '-' :
            return 1;
            case '*' :
            case '/' :
            return 2;
            case '^' :
            return 3;
        }
            return -1;

    }
    
}
