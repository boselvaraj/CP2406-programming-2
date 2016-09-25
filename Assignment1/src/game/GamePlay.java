package game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.boopathi.baseclass.Dict;
import com.boopathi.baseclass.MstCard;
import com.boopathi.baseclass.Player;
import com.boopathi.xmlparcer.XMLParcer;
public class GamePlay {
    private static int NO_OF_PLAYERS = 4;
    private static List<Dict> playDict = new ArrayList<>();
    private static boolean isGameOn = true;
    private static String round = "";
    static
    {
        List<Dict> dict = XMLParcer.parceXML();

        for (Dict singleDict : dict) {
            for (MstCard card : singleDict.getCards())
            {
                if(card.getKey().equals("card_type") && !card.getValue().equals("rule"))
                    playDict.add(singleDict);
            }
        }
        System.out.println("Full Dict " + dict.size());
        System.out.println("Play Dict " + playDict.size());

    }


    public static void main(String[] args) {
        List<Integer> cards = new ArrayList<>();
        List<Player> players = getPlayers();
        Random rand = new Random();
        for (int i = 0; i < 60; i++) {
            int cardNo = rand.nextInt(60)+1;
            while(cards.contains(cardNo))
                cardNo = rand.nextInt(60)+1;
            cards.add(cardNo);

        }

        System.out.println("Shuffeled Cards : "+cards);
        System.out.println("Shuffeled Cards Size : "+cards.size());
        for (int i = 0; i < NO_OF_PLAYERS; i++)
        {
            Player p = players.get(i);
            for (int j = 0; j < 8; j++)
            {

                System.out.println(cards.get(j) - 1 );
                p.getCards().add(playDict.get(cards.get(j) - 1));
                cards.remove(j);
            }
        }
        List<Dict> baseCards = new ArrayList<>();
        for(int i : cards)
        {
            baseCards.add(playDict.get(i));
        }

        play(players);


    }


    private static void play(List<Player> players) {

        while (isGameOn)
        {
            for (Player p : players)
            {
                if(p.getType().equals("User"))
                {
                    int i = 1;
                    Scanner reader = new Scanner(System.in);
                    for (Dict card : p.getCards())
                    {
                        System.out.println(i++ + " : " + card.toString());
                    }
                    System.out.println("Pick a card you want to play :");
                    System.out.println("Press 0 if you want to pass : ");
                    int n = reader.nextInt();
                    if(n == 0)
                    {
                        continue;
                    }
                    else
                    {
                        if(round.equals(""))
                        {
                            setRound(p.getCards().get(n));
                        }
                        else
                        {

                        }
                    }
                    reader.close();
                }
                else
                {
                    // Computer play
                }
            }
        }
    }


    private static void setRound(Dict dict) {

        for (MstCard keys : dict.getCards())
        {
            if(keys.getKey().equals("card_type") && keys.getValue().equals("play"))
            {

            }
            else if(keys.getKey().equals("card_type") && keys.getValue().equals("trump"))
            {
                System.out.println("Which card you wanna put?");
                Scanner reader = new Scanner(System.in);
                int n = reader.nextInt();

                reader.close();

            }
        }

    }

    private static List<Player> getPlayers() {
        List<Player> players = new ArrayList<>();
        Player user = new Player();
        user.setType("User");
        user.setCards(new ArrayList<>());
        players.add(user);

        for (int i = 0; i < NO_OF_PLAYERS - 1; i++)
        {
            Player p = new Player();
            p.setType("Computer");
            p.setCards(new ArrayList<>());
            players.add(p);
        }
        return players;
    }
}
