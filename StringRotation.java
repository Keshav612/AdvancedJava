public class StringRotation {
    public static void main(String[] args) {
        String str1="ABABAB";
        String str2="AB";
        System.out.print(checkRot(str1,str2));
    }
    static boolean checkRot(String str1, String str2)
    {
        //str1=str1+str1;
        if(str1.contains(str2))
        {
            return true;
        }
        return false;

    }

}
