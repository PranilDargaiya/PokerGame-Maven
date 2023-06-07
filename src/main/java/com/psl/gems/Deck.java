package com.psl.gems;

import java.util.Random; 
import java.util.ArrayList;

public class Deck { 
    private ArrayList<Card> fullDeck;
    public Deck(){
        fullDeck = new ArrayList<Card>(); 
        int indexOne, indexTwo; 
        Random generator = new Random();
        Card temp;
        for (int i = 0; i < 4; i++){            // Iterate Suits
            for (int j = 0; j < 13; j++){       // Iterate Ranks
                fullDeck.add(new Card(i,j));        // New card is added to cards
            }
        }
        int size = fullDeck.size() -1;      //Size is created to store total amount of cards in deck
        for (int i=0; i<52; i++){
            indexOne = generator.nextInt(size);       
            indexTwo = generator.nextInt(size);

            temp = (Card) fullDeck.get(indexTwo);
            fullDeck.set(indexTwo, fullDeck.get(indexOne));
            fullDeck.set(indexOne, temp);
        }       
    }

    public Card drawFromDeck(){     //This method is used when drawing card from deck to place in hand.
        return fullDeck.remove(0);
    }
}
