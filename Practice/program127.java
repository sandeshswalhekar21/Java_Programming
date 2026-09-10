import java.util.*;

class program275
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

         iRet = strobj.CountDigits(data);
        System.out.println("Number of digits are: "+iRet);

          iRet = strobj.CountSmall(data);
        System.out.println("Number of Spaces  are: "+iRet);

         iRet = strobj.CountSpecial(data);
        System.out.println("Number of SpecialSymbols  are: "+iRet);
    }
}
class StringX                  
{
     public int CountSpecial(String str)
    {
        int i=0, iCount=0;
       
       char Arr[] = str.toCharArray();

        for(i=0;i<Arr.length;i++)              
        {
            if((Arr[i] >= '!' && Arr[i]<='/') ||
            (Arr[i] >= ':' && Arr[i]<='@')||
            (Arr[i] >= '[' && Arr[i]<='`')||
             (Arr[i] >= '{' && Arr[i]<='~'))
            {
                iCount++;
            }
        }
        return iCount;
    }

      public int CountDigits(String str)
    {
        int i=0, iCount=0;
       
       char Arr[] = str.toCharArray();

        for(i=0;i<Arr.length;i++)              
        {
            if(Arr[i] >= '0'  && Arr[i] <= '9') 
            {
                iCount++;
            }
        }
        return iCount;
        

    }

    public int CountCapital(String str)
    {
        int i=0 ,iCountCap=0;

        char Arr[]=str.toCharArray();
        
        for(i=0;i<Arr.length;i++)            
        {
            if(Arr[i] >= 'A'  && Arr[i] <= 'Z') 
            {
                iCountCap++;
            }
        }
        return iCountCap;
        

    }

    public int CountSmall(String str)
    {
        int i=0, iCountSmall=0;
       
       char Arr[] = str.toCharArray();

        for(i=0;i<Arr.length;i++)              
        {
            if(Arr[i] >= 'a'  && Arr[i] <= 'z') 
            {
                iCountSmall++;
            }
        }
        return iCountSmall;
        

    }

     public int CountSpace(String str)
    {
        int i=0, iCount=0;
       
       char Arr[] = str.toCharArray();

        for(i=0;i<Arr.length;i++)              
        {
            if(Arr[i] == ' ' ) 
            {
                iCount++;
            }
        }
        return iCount;
        

    }
}