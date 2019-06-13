/**
 *
 * @author geo
 */

package changemachine;

public class roundHUF 
{
    public static int rounding(int number)
    {
        int remainder = number % 10;
        
            switch (remainder) 
            {
                case 3:
                case 8:
                  number += 2;
                  break;  
                case 4:
                case 9:
                  number += 1;
                  break;
            }
        return number;    
    }
}
