package com.boopathi.trump;
import java.util.ArrayList;
/**
 * 
 * @author Boopathi Selvaraj
 * @since 15/10/2016
 * 
 * This class represents the four AI players and one human player. 
 * The human player has an ID of 0 and other AI players will have a nonzero ID. 
 * This is so that the Game class could differentiate between the AI and human players.
 * It is based on this ID the Game asks for Input from the user.
 *
 */
		

public class Player {



    private static ArrayList cards;
    private static ArrayList players = new ArrayList();
    private static int playerId;
    private static ArrayList player0Cards = new ArrayList();
    private static ArrayList player1Cards = new ArrayList();
    private static ArrayList player2Cards = new ArrayList();
    private static ArrayList player3Cards = new ArrayList();
    private static ArrayList player4Cards = new ArrayList();
    private static Object playerCards;


    public Player(int playerId) {
        this.playerId = playerId;
        //System.out.println("PlayerID" + playerId);
        //this.cards = initGame.dealCards();
        if (playerId == 0){ArrayList temp = (ArrayList) Game.dealCards();player0Cards.add(temp);}
        if (playerId == 1){ArrayList temp = (ArrayList) Game.dealCards();player1Cards.add(temp);}
        if (playerId == 2){ArrayList temp = (ArrayList) Game.dealCards();player2Cards.add(temp);}
        if (playerId == 3){ArrayList temp = (ArrayList) Game.dealCards();player3Cards.add(temp);}
        if (playerId == 4){ArrayList temp = (ArrayList) Game.dealCards();player4Cards.add(temp);}

    }

    public static Object getPlayerCards(int playerId) {
        if(playerId == 0) {return player0Cards;}
        if(playerId == 1) {return player1Cards;}
        if(playerId == 2) {return player2Cards;}
        if(playerId == 3) {return player3Cards;}
        if(playerId == 4) {return player4Cards;}
        return null;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public String toString() {
        return "Player" + playerId;
    }

    public static void createPlayer(int playerNumber) {
        Player player = new Player(playerNumber);
        players.add(player);

    }
}
