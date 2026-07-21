import java.util.*;

class program91
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        DigitX dobj = new DigitX();

        int iValue = 0;
        System.out.println("Enter number:");
        iValue=sobj.nextInt();

       int iRet = dobj.SumEvenDigits(iValue);

       System.out.println("Sumation of Even digits are :"+iRet);

       
    }
}

class DigitX
{
    public int SumEvenDigits(int iNo)
    {
        int idigit = 0;
        int iSum = 0;
        
        while(iNo!=0)
        {
            idigit = iNo % 10;
            if(idigit % 2 == 0)
            {
            iSum=iSum + idigit;
            }
            
              iNo=iNo/10;         
        
            
        }
        return iSum;

    }

}
