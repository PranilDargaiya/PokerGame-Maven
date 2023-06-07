package com.psl.gems.client;
import com.psl.gems.*;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import java.io.FileWriter;
import java.io.IOException;

public class TestClient {
	public static void main(String[] args) throws IOException{ 
        Deck deck = new Deck();                 //Creating Object of Deck Class
        Hand handP1 = new Hand(deck);           //Creating Object of Hand Class for Player 1
        Hand handP2 = new Hand(deck);           //Creating Object of Hand Class for Player 2
    	
        List<String> pOneCard = new ArrayList<String>();        //Store Card Name for Player 1
    	List<String> pTwoCard = new ArrayList<String>();        //Store Card Name for Player 2
    	
        String pOneHigh = "";                   //Store Highest Card Name for Player 1
    	String pTwoHigh = "";                   //Store Highest Card Name for Player 2
        
        JSONObject jObj = new JSONObject();
        JSONArray jArray = new JSONArray();
        
        //Player 1 & 2 Cards are printed to the screen and Strength
        System.out.print("Player 1 : Suresh \n");    
        handP1.displayCards();      
        System.out.print("Player 2 : Ramesh \n");
        handP2.displayCards();
        
        //Feeding Data in JSON of Cards Name
        pTwoCard = handP2.list;						
        for(int i = 0; i<pTwoCard.size(); i++) {
        	jArray.add(pTwoCard.get(i));
        }
        jObj.put("CARD2", jArray);
        
        pOneCard = handP1.list;
        for(int i = 0; i<pOneCard.size(); i++) {
        	jArray.add(pOneCard.get(i));
        }
        jObj.put("CARD", jArray);

        
        System.out.println("\nHand Values:\nPlayer 1: "); 
        handP1.strength();
        System.out.print("\nPlayer 2: "); 
        handP2.strength();
        
        //Feeding Data in JSON of Highest Cards Name and Weight
        pOneHigh = handP1.highestCard;
        pTwoHigh = handP2.highestCard;
        jObj.put("HighCardP1", pOneHigh);
        jObj.put("HighCardP2", pTwoHigh);
        int pOneWeight = handP1.weight;
        int pTwoWeight = handP2.weight;
        jObj.put("HighWeightP1", pOneWeight);
        jObj.put("HighWeightP2", pTwoWeight);
        
        
        //Comparision of Hands of both the player
        if(handP1.compareTo(handP2) == 1){
            System.out.println("\nResult- Player 1 Wins!");
        }
        else if(handP1.compareTo(handP2) == -1){
            System.out.println("\nResult- Player 2 Wins!");
        }
        else{
            System.out.println("\nResult: Draw!");
        }
        
        //Writing Data in JSON File
        FileWriter file = new FileWriter("json\\test.json", false);
        file.write(jObj.toJSONString());
        file.close();

    }
}
