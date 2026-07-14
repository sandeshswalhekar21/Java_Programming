// Type 3

import java.util.*;

class program44
{
   

    public static void main(String A[])

    {
       Scanner sobj = new Scanner(System.in);

       int iValue = 0;
       boolean bRet = false;

       System.out.printf("Enter Number :");
       iValue = sobj.nextInt();

       bRet = NumberX.CheckDivisible(iValue);  

       if(bRet == true)
       {
         System.out.printf("Number is Divisible by 3 and 5");
       }
       else
       {
         System.out.printf("Number is not Divisible by 3 and 5");
       }
    }
}

class NumberX
{
   public static boolean CheckDivisible(int iNo)                       
    {
     if((iNo % 3 == 0)&&(iNo % 5 == 0))
       {
        return true;
       }
       else
       {
        return false;
       }
    }
    
}


