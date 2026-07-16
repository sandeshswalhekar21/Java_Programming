
import java.util.*;



class program49
{
    public static void main(String A[])
    {
       Scanner sobj = new Scanner(System.in);

       int iValue = 0;
       int iRet = 0;
       
       System.out.println("Enter Number :");
       iValue = sobj.nextInt();

       NumberX nobj = new NumberX();  
       iRet = nobj.SumFactors(iValue);

       System.out.printf("Summation of factor:"+iRet);
    }
}

class NumberX                                           
{
  public int SumFactors(int iNo)
  {
        int iCnt = 0;
        int iSum = 0;

        for (iCnt=1; iCnt<= (iNo/2); iCnt++)
        {
          if((iNo % iCnt) ==0)
          {
            iSum = iSum + iCnt;
          }
        }
        return iSum;
  }
   
}

// time complexity : Order of(N/2)
// where N >=0

