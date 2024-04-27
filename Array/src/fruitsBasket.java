public class fruitsBasket {

    public static void main(String args[]){

        String[] fruitBasket = {"Orange", "Apple", "Orange", "Apple", "Orange", "Apple",
                "Orange", "Apple", "Orange", "Orange", "Orange", "Apple", "Orange", "Orange",
                "Apple", "Orange", "Orange", "Apple", "Apple", "Orange", "Apple", "Apple",
                "Orange", "Orange", "Apple", "Apple", "Apple", "Banana", "Apple", "Orange",
                "Orange", "Apple", "Apple", "Orange", "Orange", "Orange", "Orange", "Apple",
                "Apple", "Apple", "Apple", "Orange", "Orange", "PawPaw", "Apple", "Orange",
                "Orange", "Apple", "Orange", "Orange", "Apple", "Apple", "Orange", "Orange",
                "Apple", "Orange", "Apple", "Kiwi", "Orange", "Apple", "Orange",
                "Dragonfruit", "Apple", "Orange", "Orange"};

        int numOranges = 0;
        int numApples = 0;
        int numOtherFruit = 0;

        int totalfruit=fruitBasket.length;
        System.out.println("Total number of fruits = "+totalfruit);
        for(int i=0; i<fruitBasket.length; i++)
        {
            if(fruitBasket[i]=="Orange")
            {
                numOranges++;
            }
            else if(fruitBasket[i]=="Apple")
            {
                numApples++;
            }
            else {
                numOtherFruit++;
            }
        }
        System.out.println("Total number of ornages ="+ numOranges);
        System.out.println("Total number of apples ="+ numApples);
        System.out.println("Total number of other fruits ="+numOtherFruit);
    }


}
