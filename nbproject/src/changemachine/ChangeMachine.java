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
        // 4. Do the math
        // 5. Print out the result of the math
        // 5. Measure time
        // 6. Write time, price, currency into username.txt
        System.out.println(randomPrice);
    }
}
