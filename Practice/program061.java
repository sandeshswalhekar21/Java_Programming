import java.util.*;

//input :7
//output: A * C * E * F * G

class program185
{


    public static void Display( int iNo)                
    {
        int iCnt=0;
        char ch = '\0';
        
        
        for(iCnt=1,ch = 'A';iCnt<=iNo;iCnt++,ch++)
        {
            if(iCnt % 2 != 0)
            {
            System.out.print(ch+"\t");
            }
            else
            {
                System.out.print("*\t");
            }
            
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