import java.util.Scanner;

public class LuckySeven {

    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);

        //Step 1: Ask the user how many dollars they have to bet
        System.out.println("How much money do you have ?");
        int money= sc.nextInt();

        int rolls=0;
        int maxMoney=money;
        int rollsAtMax=0;

        // Step 2: Roll the dice repeatedly until all the money is gone

        while (money>0)
        {
            int die1=(int)(Math.random()*6)+1;
            int die2=(int)(Math.random()*6)+1;
            int sum=die1+die2;

            if(sum>7)
            {
                money +=4;
            }
            else {
                money -=1;

            }
            rolls++;

            if (money > maxMoney){
                maxMoney=money;
                rollsAtMax=rolls;
            }

        }
// Step 3: Display the results
        System.out.println("You are broke after " + rolls + " rolls.");
        System.out.println("You should have quit after " + rollsAtMax + " rolls when you had $"+maxMoney);
    }
}
