/**
 * May 2019
 * @author GeorgeGabor 
 */
package changemachine;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;
import java.text.NumberFormat;

public class loggingResult 
{
    public static void fileWriter(String username, int price, String currency, long time)
    {
        FileWriter fw;
        File file ;
        String content = price + ", " + currency + ", " ;
        content += NumberFormat.getNumberInstance(Locale.US).format(time) + " ms";
        try 
        {
            file=new File( username + ".txt");
            
            fw = new FileWriter(file);
            fw.write(content);
            fw.flush();
            fw.close();
//            System.out.println("Success");
        } 
        catch (IOException e)
        {
            System.out.println(e);
        }
    }
}
