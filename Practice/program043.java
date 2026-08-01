import java.util.*;

class program145
{
    public static void Update(int Arr[])
    {
        int iCnt=0;
        for(iCnt=0;iCnt<Arr.length;iCnt++)
        {
           Arr[iCnt]++;
        }
    }
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
       
 
        System.out.println("Enter the number of Elements:");
        int iLength = sobj.nextInt();

        
        int Brr[]= new int[iLength];

        System.out.println("Enter the Elements:");
        int iCnt=0;
        for(iCnt=0;iCnt<Brr.length;iCnt++)
        {
            Brr[iCnt]=sobj.nextInt();
        }
        System.out.println("Elements before function the Array are :");
         for(iCnt=0;iCnt<Brr.length;iCnt++)
        {
           System.out.println(Brr[iCnt]);
        }

        Update(Brr);                               //callby reference 

         System.out.println("Elements After function are Array are :");
         for(iCnt=0;iCnt<Brr.length;iCnt++)
        {
           System.out.println(Brr[iCnt]);
        }                      
        
        Brr = null;
        System.gc();

       
       

    }

    
}