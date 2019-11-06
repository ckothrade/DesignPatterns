import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class MySingleton{

	private static MySingleton firstInstance = null;

	String[] cardDeck = {"1_hearts", "2_hearts", "3_hearts", "4_hearts", "5_hearts", "6_hearts", "7_hearts", "8_hearts", "9_hearts", "10_hearts", "J_hearts", "Q_hearts", "K_hearts", "A_hearts", "1_diamonds", "2_diamonds", "3_diamonds", 	"4_diamonds", "5_diamonds", "6_diamonds", "7_diamonds", "8_diamonds", "9_diamonds", "10_diamonds", "J_diamonds", "Q_diamonds", "K_diamonds", "A_diamonds", "1_spaids", "2_spaids", "3_spaids", "4_spaids", "5_spaids", "6_spaids", "7_spaids", "8_spaids", "9_spaids", "10_spaids", "J_spaids", "Q_spaids", "K_spaids", "A_spaids", "1_clubs", "2_clubs", "3_clubs", "4_clubs", "5_clubs", "6_clubs", "7_clubs", "8_clubs", "9_clubs", "10_clubs", "J_clubs", "Q_clubs", "K_clubs", "A_clubs"};	

	private LinkedList<String> cardList = new LinkedList<String> (Arrays.asList(cardDeck));

	private MySingleton(){ }

	public static MySingleton getInstance(){
		
		synchronized(MySingleton.class){
			if(firstInstance == null){
				firstInstance = new MySingleton();
				Collections.shuffle(firstInstance.cardList);
			}
		}
		
		return firstInstance;
	}

	public LinkedList<String> getCardList(){
		return firstInstance.cardList;
	}

	public LinkedList<String> getCards(int count){
		LinkedList<String> dealtCards = new LinkedList<String>();

		for(int i = 0; i < count; i++){
			dealtCards.add(firstInstance.cardList.remove(0));
		}

		return dealtCards;
	}	
}