package com.psl.gems;

import java.util.ArrayList;
import java.util.List;

public class Hand{ 

    private Card[] cards;           //cards represent one player’s cards.
    private int[] strengthofCard;   //value is used later to determine hand strength.
    private Card cardName;
    private int maxCard;
	public List<String> list = new ArrayList<String>();
	public String highestCard;
	public int weight;

    public Hand(Deck d){                    //Constructor
        cards = new Card[3];
        strengthofCard = new int[3];
        for (int i = 0; i <= 2; i++){       //Draw three cards from deck and place them in cards.
            cards[i] = d.drawFromDeck();
        }
    }

    //To Print Strength of Card
    public void strength(){                 
        int[] ranks = new int[14];
        for (int i = 0; i <= 13; i++){      //Clean out Ranks Array
            ranks[i] = 0;
        }
        for (int i = 0; i <= 2; i++){       //Assign rank to cards in hand
            ranks[cards[i].getRank() ]++;
        }
        maxCard = strengthofCard[0];
        for (int i = 0; i <= 2; i++){
            strengthofCard[i] = (cards[i].getRank()*4) + cards[i].getSuit();
            if (strengthofCard[i] > maxCard){
                cardName = cards[i];
                maxCard = strengthofCard[i];
            }
        }
        System.out.print("Highest Card is " + cardName + " with weight " + maxCard);
        highestCard = cardName.toString();
        weight = maxCard;
        
    }

    //Comparing both hands of players
    public int compareTo(Hand p2){           
    if(this.maxCard > p2.maxCard){
        return 1;
    }
    else if(this.maxCard < p2.maxCard){
        return -1;
    }
    return 0;
    }

    //This method prints the Cards that a player has in their hand.
    public void displayCards(){             
    	for (int i = 0; i <= 2; i++){       //Print all 3 cards in hand.
            System.out.println(cards[i]);
            list.add(cards[i].toString());
        }
        System.out.println();
    }

    
}
