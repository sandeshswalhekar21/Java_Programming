/*
   iRow = 4
   iCol= 4
   
  a
  a b
  a b c
  a b c d      

*/

import java.util.*;


class program225
{
    public static void main(String[] A) 
    {
        int iValue1=0;
        int iValue2=0;
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the number of Rows:");
        iValue1=sobj.nextInt();

        System.out.println("Enter the number of Column:");
        iValue2=sobj.nextInt();

        Pattern pobj = new Pattern();

        pobj.Display(iValue1,iValue2);       
    }
}

class Pattern
{
    public void Display(int iRow,int iCol)
    {
        int i=0,j=0;
        char ch ='\0';
            
        for(i=1,ch = 'a';i <= iRow; i++,ch++)
        {
            for(j=1;j<=i;j++)
            {               
              System.out.print(ch+"\t");
            }
         
           System.out.println();
        }                
   }    
}