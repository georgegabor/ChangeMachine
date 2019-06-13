/**
 * May 2019
 * @author GeorgeGabor 
 */

package changemachine;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class getUserName 
{
    public static String getUserName(String prompt)
    {
        String username = null;
        System.out.print(prompt);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try 
        {
            username = br.readLine();
            if(username.isEmpty())
            {
                System.out.println("Username cannot be empty !!!");
                getUserName(prompt);
            }    
        }
        catch (IOException e) 
        {
            System.out.println("Error trying to read your name!");
            System.exit(1);
        }    
        return username;
    }
}
