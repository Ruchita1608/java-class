public class stayPositive {

   public static void main(String args[])
   {
       int[] numbers = { 389, -447, 26, -485, 712, -884, 94, -64, 868, -776, 227, -744, 422, -109, 259, -500, 278, -219, 799, -311};
       System.out.println("List of positive numbers are: ");
       for(int i=0; i<numbers.length; i++)
       {
           if(numbers[i]>0)
           {
               System.out.println(numbers[i]);
           }
       }
   }

}
