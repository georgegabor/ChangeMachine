/**
 * May 2019
 * @author GeorgeGabor 
 * 
 * Not a Java expert so the design might not be the best.Yet. 
 * I may redesign later :-)
 * I create a file for each functionality, so they will be maintainable
 * and testable.
 * 
 */
package changemachine;

import java.util.List;

public class ChangeMachine 
{
    public static void main(String[] args) 
    {
        // 1. Ask user for name
        String username = getUserName.getUserName("Please give me your name:");
        
        // 2. Pick random int. I chose upper boundary to be 100.000.
        int minPrice = 1;
        int maxPrice = 100000;
        int randomPrice = pickRandomInt.getRandomNumberInRange(minPrice, maxPrice);
        
        // 3. Pick random currency 
        String randomCurrency = getCurrency.getRandomCurrency();
        List <Integer> listOfNotes = getCurrency.getNotes(randomCurrency);
        
        // If currency is HUF then some rounding needs to be done
        if(randomCurrency.equals("HUF") && (randomPrice % 5) != 0)
        {
            randomPrice = roundHUF.rounding(randomPrice);
        }
        
        // 4. Do the math and timing
        long startTime = System.nanoTime();
        calculateAmount.calculateNotes(randomPrice, listOfNotes);
        long endTime = System.nanoTime();
        long runTime = (endTime - startTime)/1000;
        
        // 6. Write time, price, currency into username.txt
        loggingResult.fileWriter(username, randomPrice, randomCurrency, runTime);
        
    }
}
