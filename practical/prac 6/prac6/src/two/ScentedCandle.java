package two;

public class ScentedCandle extends Candle
{
   private String scent;

   public String getScent() {
      return scent;
   }

   public void setScent(String scent) {
      this.scent = scent;
   }

   @Override
   public void setHeight(int h)
   {
      double perInch = 3;
      super.setHeight(h);
      price = h * perInch;
   }
}
