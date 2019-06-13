/**
 * May 2019
 * @author GeorgeGabor 
 * 
 * Getting currencies and correspondig notes from a JSON file
 */

package changemachine;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class getCurrency
{
    public static JSONObject getJson() 
    {        
        JSONParser parser = new JSONParser();
        JSONObject jsonObject = null;
        try 
        {
            Object obj = parser.parse(new FileReader("currency.json"));
            jsonObject =  (JSONObject) obj;         
        } 
        catch (FileNotFoundException e)  
        {
            System.out.println(e);
        } 
        catch (IOException | ParseException e) 
        {
            System.out.println(e);
        }
        return jsonObject;
    }
    
    public static String getRandomCurrency()
    {
        JSONObject jsonObject =  getJson();
        List<String> stringList = (List<String>)jsonObject.keySet().stream().collect(Collectors.toList());
        int indexMin = 0;
        int indexMax = stringList.size()-1;
        int randomIndex = pickRandomInt.getRandomNumberInRange(indexMin, indexMax);
        String randomCurrency = stringList.get(randomIndex);
        
        return randomCurrency;
    }       
    
    public static List <Integer> getNotes (String randomCurrency)
    {
        JSONObject jsonObject =  getJson();
        List <String> randomCurrencyValues = (List<String>) jsonObject.get(randomCurrency);
        List <Integer> randomCurrencyValuesInt = randomCurrencyValues.stream().map((string) -> 
                                                Integer.parseInt(string)).collect(Collectors.toList());
        
        return randomCurrencyValuesInt;
    }
}