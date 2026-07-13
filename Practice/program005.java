class program38
{
    public static void main(String A[])

    {
       int iCnt = 0;

       for (iCnt = 1; iCnt<=10; iCnt++)         //time complexity = how many time loop go
       {                                            //   10 = N
        System.out.printf("%d\n",iCnt);             //   20 = 2N
       }                                            //   5 = N/5
    }
}