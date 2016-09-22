package two;

public class TestCandles
{
   public static void main(String args[])
   {
      Candle candle = new Candle();
      ScentedCandle scentedCandle = new ScentedCandle();


      candle.setColor("orange");
      candle.setHeight(3);
      System.out.println("Height " + candle.getHeight() + " Color " + candle.getColor() + " Price " + candle.getPrice());

      scentedCandle.setColor("yellow");
      scentedCandle.setScent("dont know");
      scentedCandle.setHeight(4);

      System.out.println("Height " + scentedCandle.getHeight() + " Color " + scentedCandle.getColor() + " Scent " + scentedCandle.getScent()+ " Price " + scentedCandle.getPrice());

   }
}
