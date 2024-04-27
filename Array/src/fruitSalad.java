public class fruitSalad {

    public static void main(String args[])
    {
        String[] fruit = {"Kiwi Fruit", "Gala Apple", "Granny Smith Apple", "Cherry Tomato", "Gooseberry", "Beefsteak Tomato", "Braeburn Apple", "Blueberry", "Strawberry", "Navel Orange", "Pink Pearl Apple",  "Raspberry", "Blood Orange", "Sungold Tomato", "Fuji Apple", "Blackberry", "Banana", "Pineapple", "Florida Orange", "Kiku Apple", "Mango", "Satsuma Orange", "Watermelon", "Snozzberry"};

        String[] fruitSalad = new String[15];
        int count=0;
        int appleCount=0, orangeCount=0;
         for (int i=0; i<fruit.length;i++){

             if(fruit[i].contains("berry"))
             {
                 count ++;
                 fruitSalad[i]=fruit[i];
             }
             if(fruit[i].contains("Apple"))
             {

                 appleCount++;
                 if(appleCount>3)
                 {
                     break;
                 }
                 fruitSalad[i]=fruit[i];
            }


         }
        System.out.println("Total number of Berries are "+count);

         for (int i=0; i<fruitSalad.length;i++)
         {
             System.out.println(fruitSalad[i]);
         }
    }
}
