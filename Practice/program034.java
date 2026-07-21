import java.util.*;


class program93
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        DigitX dobj = new DigitX();

        int iValue = 0;
        boolean bRet = false;
        System.out.println("Enter number:");
        iValue=sobj.nextInt();

        bRet = dobj.CheckPallindrome(iValue);

       if(bRet == true)
       {
        System.out.println("Number is palentrom");
       }
       else
       {
        System.out.println("Number is 
         not palentrom");

       }    
    }
}

class DigitX
{
    public boolean CheckPallindrome(int iNo)
    {
        int idigit = 0;
        int iRev = 0;

        int iTemp = 0;
        iTemp=iNo;
        
        while(iNo!=0)
        {
            idigit = iNo % 10;
            iRev = iRev*10+idigit;
           
            iNo=iNo/10;            
        }
        if(iRev == iTemp)
        {
            return true;
        }
        else{
            return false;
        }
    }
}
