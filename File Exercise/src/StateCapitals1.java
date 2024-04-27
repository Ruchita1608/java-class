import java.util.HashMap;
import java.util.Map;

public class StateCapitals1 {

    public static void main(String args[])
    {
        Map<String,String> stateCapitals= new HashMap<>();

        stateCapitals.put("Alabama", "Montgomery");
        stateCapitals.put("Alaska", "Juneau");
        stateCapitals.put("Arizona", "Phoenix");
        stateCapitals.put("Arkansas", "Little Rock");

        System.out.println("States ");
        for(String states : stateCapitals.keySet())
        {
            System.out.println(states);
        }

        System.out.println("Capitals ");
        for(String capital : stateCapitals.values())
        {
            System.out.println(capital);
        }

        System.out.println("STATE/CAPITAL PAIRS: ");
        for(Map.Entry<String,String> entry : stateCapitals.entrySet())
        {
            System.out.println(entry.getKey() +" :: " + entry.getValue());
        }


    }
}

