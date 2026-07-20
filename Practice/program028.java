import java.util.*;

class program86
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        DigitX dobj = new DigitX();

        int iValue = 0;
        System.out.println("Enter number:");
        iValue=sobj.nextInt();

       int iRet = dobj.CountOddDigits(iValue);

       System.out.println("Odd number are :"+iRet);

       
    }
}

class DigitX
{
    public int CountOddDigits(int iNo)
    {
        int idigit = 0;
        int iCount = 0;
        
        while(iNo!=0)
        {
            idigit = iNo % 10;
            if((idigit % 2)!=0)
            {
            iCount++;
            } 
              iNo=iNo/10;         

            
        }
        return iCount;

    }

}
