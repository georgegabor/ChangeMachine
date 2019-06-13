/**
 * May 2019
 * @author GeorgeGabor 
 */

package changemachine;

import java.util.List;

public class calculateAmount 
{
    // the message building could have gone in a different method 
    public static void calculateNotes (int randomPrice, List <Integer> intValues )
    {
        int numOfCurrencyItems = intValues.size();
        StringBuilder msg = new StringBuilder();
        StringBuilder content = new StringBuilder();
        content.append("result is");
        
        int counter = 0;
        for (int x=0; x < numOfCurrencyItems; x++)
        {
            int denom = intValues.get(x);
            int quotient = randomPrice / denom;
            randomPrice = randomPrice % denom;
            if ( quotient != 0)
            {
                counter += quotient;
                msg.append(" ").append(quotient).append("x ").append(denom).append(",");
            } 
        }  
        msg.deleteCharAt(msg.length() - 1);
        content.append(" ").append(counter).append(" -->").append(msg);
        System.out.println(content);
    }
}
