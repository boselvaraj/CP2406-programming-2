package baseclass;

import java.util.List;
public class Player {
    public String type;
    public List<Dict> cards;

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public List<Dict> getCards() {
        return cards;
    }
    public void setCards(List<Dict> cards) {
        this.cards = cards;
    }
}
