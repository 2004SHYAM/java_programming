public class EmployeeValidation {
    public static boolean passwordvalidation(String pw)
    {
        
        int upper=0,lower=0,digit=0,special=0;
        for(int i=0;i<pw.length();i++)
        {
            char ch=pw.charAt(i);
            if(Character.isUpperCase(pw.charAt(i)))
                upper++;
            else if(Character.isUpperCase(pw.charAt(i)))
                lower++;
            else if(Character.isDigit(pw.charAt(i)))
                digit++;
            else 
                special++;
        }
        boolean res=false;
        System.out.println("false");
        if(pw.length()>=8 && pw.length()<=13)
        {
            if(upper>=1 && lower>=1 && digit>=1 && special>=1)
            {
                res=true;
                System.out.println("ture");
            }
        }
        return res;
    }
    public static void main(String[] args) {
        String password="Shyam@123";
        passwordvalidation(password);
    }
}
