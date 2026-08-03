import java.util.*;

//input :5
//output:* # * # * # * # * #
class program174
{


    public static void Display( int iNo)                
    {
        int iCnt=0;
        for(iCnt=1;iCnt<=iNo;iCnt++)
        {
            System.out.print("*\t"+"#\t");

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