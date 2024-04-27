import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class StateCapitals2 {

    private static void loadStateCapitals(HashMap<String,String>stateCapitalsMap){

        try
        {

            File file = new File("States.txt");
            Scanner sc= new Scanner(file);
            while(sc.hasNextLine())
            {
                String line = sc.nextLine();
                String[] parts = line.split("::");
                stateCapitalsMap.put(parts[0].trim(),parts[1].trim() );

            }
            sc.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not found"+e.getMessage());

        }
    }

    public static void main(String args[]){

        HashMap<String,String> stateCapitalsMap= new HashMap<>();

        loadStateCapitals(stateCapitalsMap);

        System.out.println(stateCapitalsMap.size()+"STATE/CAPITAL PAIRS ARE LOADED.");
        System.out.println("=======\nHERE ARE THE STATES :");

        for(String state : stateCapitalsMap.keySet())
        {
            System.out.println(state+", ");

        }

        System.out.println("\n=======\nREADY TO TEST YOUR KNOWLEDGE?");

        Scanner sc= new Scanner(System.in);
        Random random= new Random();

        List<String> statesList = new ArrayList<>(stateCapitalsMap.keySet());
        String randomState=statesList.get(random.nextInt(statesList.size()));

        System.out.print("WHAT IS THE CAPITAL OF '" + randomState + "'? ");
        String userInput= sc.nextLine().trim();

        if(userInput.equalsIgnoreCase(stateCapitalsMap.get(randomState))){

            System.out.println("NICE WORK! " + stateCapitalsMap.get(randomState) + " IS CORRECT!");
        }
        else {
            System.out.println("SORRY, THE CORRECT CAPITAL IS " + stateCapitalsMap.get(randomState) + ".");
        }

        sc.close();

    }
}
