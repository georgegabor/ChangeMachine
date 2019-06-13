/**
 * May 2019
 * @author GeorgeGabor 
 */
package changemachine;

import java.util.Random;

public class pickRandomInt 
{
    public static int getRandomNumberInRange(int min, int max) 
    {
	Random r = new Random();
	return r.ints(min, (max + 1)).limit(1).findFirst().getAsInt();	
    }
}
