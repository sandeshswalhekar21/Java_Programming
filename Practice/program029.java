import java.util.*;

class program88
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        DigitX dobj = new DigitX();

        int iValue = 0;
        System.out.println("Enter number:");
        iValue=sobj.nextInt();

         dobj.CountEvenOddDigits(iValue); 
    }
}

class DigitX
{
    public void CountEvenOddDigits(int iNo)
    {
        int idigit = 0;
        int iCountEven = 0;
        int iCountOdd = 0;
        
        while(iNo!=0)
        {
            idigit = iNo % 10;
            if((idigit % 2)!=0)
            {  
            iCountOdd++;
           
            } 
            else
            {
                iCountEven++;
            }
              iNo=iNo/10;           
        }
       System.out.println("Number of Odd digits :"+iCountOdd);
       System.out.println("Number of Odd digits :"+iCountEven);
    }

}
