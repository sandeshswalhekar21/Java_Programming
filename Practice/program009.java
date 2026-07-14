// Type 2

import java.util.*;

class program42
{
    public static void CheckDivisible(int iNo)                         // access specifier(public)
    {
         if((iNo % 3 == 0)&&(iNo % 5 == 0))
       {
        System.out.printf("Number is Divisible by 3 and 5");
       }
       else
       {
        System.out.printf("Number is not Divisible by 3 and 5");
       }
    }

    public static void main(String A[])

    {
       Scanner sobj = new Scanner(System.in);

       int iValue = 0;

       System.out.printf("Enter Number :");
       iValue = sobj.nextInt();

       CheckDivisible(iValue);                   

      
    }
}