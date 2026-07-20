import java.util.*;

class program85
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        DigitX dobj = new DigitX();

        int iValue = 0;
        System.out.println("Enter number:");
        iValue=sobj.nextInt();

       int iRet = dobj.CountDigits(iValue);

       System.out.println("total number of digit is :"+iRet);

       
    }
}

class DigitX
{
    public int CountDigits(int iNo)
    {
        int idigit = 0;
        int iCount = 0;
        
        while(iNo!=0)
        {
            idigit = iNo % 10;
            if(idigit == 7)
            {
            iCount++;
            } 
              iNo=iNo/10;         

            
        }
        return iCount;

    }

}
