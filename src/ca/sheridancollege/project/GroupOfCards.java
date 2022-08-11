
package ca.sheridancollege.project;

import java.util.ArrayList;
import java.util.List;


public class GroupOfCards 
{
   ArrayList<String> collectionCards = new ArrayList<>();
	
	public GroupOfCards() {
		suit suits[] = suit.values();
		Cards cards[] = Cards.values();
		
       for (suit suit : suits) {
                    for (Cards card : cards) {
                        collectionCards.add(suit.getValue() + card.getValue());
                    }
       }
	}

        public void setCollectionCards(ArrayList<String> collectionCards) {
		this.collectionCards = collectionCards;
	}
        
	public ArrayList<String> getCollectionCards() {
		return collectionCards;
	}

	

   
}//end class
