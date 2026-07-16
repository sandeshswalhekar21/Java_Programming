
import java.util.*;



class program51 
{
    public static void main(String A[])
    {
       Scanner sobj = new Scanner(System.in);

       int iValue = 0;
       boolean bRet = false;
       
       System.out.println("Enter Number :");
       iValue = sobj.nextInt();

       NumberX nobj = new NumberX();  
       bRet = nobj.CheckPerfect(iValue);

      if( bRet == true)
      {
        System.out.printf("It is Perfect");
      }
      else
      {
        System.out.printf("It is not Perfect");
      }
    }
}

class NumberX                                           
{
  public boolean CheckPerfect(int iNo)
  {
        int iCnt = 0;
        int iSum = 0;

        for (iCnt=1; iCnt<= (iNo/2); iCnt++)
        {
          if((iNo % iCnt) ==0)
          {
            iSum = iSum + iCnt;
          }
          if(iSum > iNo)                      // it break the loop and make number of loop small
          {
            break;
          }
        }
        if( iSum == iNo)
        {
          return true;
        }
        else
        {
          return false;
        }
  }
   
}



