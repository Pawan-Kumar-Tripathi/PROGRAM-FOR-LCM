import java.io.*;
import java.util.*;
class LCM 
    {
        public void main()
        {
            int a , b,max,i,prod= 1;
            Scanner sc = new Scanner(System.in);
             a = sc.nextInt();
             b = sc.nextInt();
            
            if(a>=b)
            {
                max = a ; 
            }
            else 
            {
                max = b ;
            }
            for( ;  max<=a*b;)
            {
                if(max%a == 0 && max%b == 0) 
                {
                    System.out.println(max);
                }
            }
            
        }
    }
            