package baseclass;

import java.util.ArrayList;
import java.util.List;
public class Dict {

    public List<MstCard> cards;


    public List<MstCard> getCards() {
        return cards;
    }

    public void setCards(List<MstCard> cards) {
        this.cards = cards;
    }


    public boolean getNextBiggest(String type, String value)
    {
        for (MstCard mstCard : cards)
        {
            if(mstCard.getKey().equals(type))
            {
                float cardValue = Float.parseFloat(mstCard.getValue());
                float gotValue = Float.parseFloat(value);
                if(cardValue > gotValue)
                    return true;
            }
        }
        return false;
    }

    public List<MstCard> getTrumpCards()
    {
        List<MstCard> trumpCards = new ArrayList<>();
        for (MstCard mstCard : cards)
        {
            if(mstCard.getKey().equals("card_type") && mstCard.getValue().equals("trump"))
            {
                trumpCards.add(mstCard);
            }
        }
        return trumpCards;
    }


    @Override
    public String toString() {
        return "Dict [cards=" + cards + "]";
    }
}
