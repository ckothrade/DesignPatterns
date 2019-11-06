import java.util.LinkedList;

public class CardGame{

    public static void main(String[] args){

        MySingleton newInstance = MySingleton.getInstance();

        System.out.println("Instance ID: " + System.identityHashCode(newInstance));

        System.out.println();
        System.out.println(newInstance.getCardList());

        LinkedList<String> playerOneHand = newInstance.getCards(5);
        System.out.println("\nPlayer 1: " + playerOneHand);

        // Check deck
        System.out.println();
        System.out.println(newInstance.getCardList());

        LinkedList<String> playerTwoHand = newInstance.getCards(5);
        System.out.println("\nPlayer 2: " + playerTwoHand);

        // Check deck
        System.out.println();
        System.out.println(newInstance.getCardList());



    }
}