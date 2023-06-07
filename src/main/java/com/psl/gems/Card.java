package com.psl.gems;

public class Card{      
    private int rank, suit;
    private static String[] suits = {"CLUB", "DIAMOND", "HEART", "SPADE"}; 
    private static String[] ranks = { "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN", "JACK", "QUEEN", "KING", "ACE" };
   
    public static String rankAsString(int cardRank){        //Convert rank and return
        return ranks[cardRank];
    }

    Card(int suit, int rank){       //Constructor of Card Class
        this.rank=rank; 
        this.suit=suit;
    }

    public @Override String toString(){         //To Print Cards Name
        return suits[suit] + "-" + ranks[rank];
    }

    public int getRank() { //Assign Rank
        return rank;
    }

    public int getSuit() { //Assign Suit
        return suit;
    }
}
