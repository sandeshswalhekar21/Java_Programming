import java.util.*;

class program81
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        DigitX dobj = new DigitX();

        int iValue = 0;
        System.out.println("Enter number:");
        iValue=sobj.nextInt();

        dobj.DisplayDigits(iValue);

       
    }
}

class DigitX
{
    public void DisplayDigits(int iNo)
    {
        int idigit = 0;
        
        for( ; iNo!=0 ; )                   // for(;;)     allowed
        {
            idigit = iNo % 10;
            System.out.println(idigit);
            iNo=iNo/10;
        }

    }

}
