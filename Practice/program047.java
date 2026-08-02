import java.util.*;

class program171
{


    public static void Display( int iNo)                   //static because we donnot make object of same class
    {
        int iCnt=0;
        for(iCnt=1;iCnt<=iNo;iCnt++)
        {
            System.out.print("*\t");

        }
        

       
    }


    public static void main(String A[])
    {
        
        Scanner sobj = new Scanner(System.in);
        int iValue=0;

        System.out.println("Enter number of elements:");
        iValue=sobj.nextInt();

        Display(iValue);


        
    }



}