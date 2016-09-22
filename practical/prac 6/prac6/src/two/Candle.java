package two;

public class Candle {
    private String color;
    private int height;
    double price;

    public String getColor() {
        return color;
    }

    public int getHeight() {
        return height;
    }

    public double getPrice() {
        return price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setHeight(int height) {
        this.height = height;
        final int perInch = 2;
        price = height * perInch;
    }
}
