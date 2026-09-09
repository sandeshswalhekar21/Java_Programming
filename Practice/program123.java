import java.util.*;

class program271
{
    public static void main(String A[])
     {
        Scanner sobj = new Scanner(System.in);
        String data = null;

        StringX strobj = new StringX();

        int iRet=0;
       


        System.out.println("Enter String:");
        data = sobj.nextLine();


        iRet = strobj.CountCapital(data);

          System.out.println("Number of Capita character: "+iRet);
        iRet = strobj.CountSmall(data);
      
        System.out.println("Number of Small character: "+iRet);
    }
}
class StringX
{
    public int CountCapital(String str)
    {
        int i=0;
        int iCountCap=0;
        for(i=0;i<str.length();i++)            
        {
            if(str.charAt(i) >= 'A'  && str.charAt(i) <= 'Z') 
            {
                iCountCap++;
            }
        }
        return iCountCap;
        

    }

    public int CountSmall(String str)
    {
        int i=0;
        int iCountSmall=0;
        for(i=0;i<str.length();i++)              
        {
            if(str.charAt(i) >= 'a'  && str.charAt(i) <= 'z') 
            {
                iCountSmall++;
            }
        }
        return iCountSmall;
        

    }
}