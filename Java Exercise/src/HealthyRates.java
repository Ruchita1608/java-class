import java.util.Scanner;

public class HealthyRates {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);

        System.out.println("Please enter your age");
        int age= sc.nextInt();

        int maxRate=220-age;

        double max= 0.85*maxRate;
        double min = 0.5*maxRate;



        System.out.println("Your maximum heart rate should be "+maxRate+" beats per minute");
        System.out.println("Your target HR Zone is "+min + "-"+max+" beats per minute");
    }
}
