package com.boopathi.trump;
import java.util.ArrayList;


/**
 * 
 * @author Boopathi Selvaraj
 * @class Card
 * @since 10/10/2016
 * 
 * This class represents the single card object in the deck.
 * It holds all attributes for a given card like cardname and cardid.
 * It can be called up on by the Game class
 *
 */

public class Card {
    private Object cardFileName;
    public int cardId;
    public ArrayList cardData;

    public Card(ArrayList cardData){
        this.cardData = cardData;
        this.cardFileName = cardData.toArray()[0];
    }

    public String toString() {
        return "CardName = " + this.cardFileName;
    }
    public ArrayList toArrayList() {
        ArrayList<String> test = new ArrayList<>();
        test.add(this.cardFileName.toString());

        return test;
    }
}
