package three;

public class ItemSold
{
   private int invoiceNumber;
   private String description;
   private double price;

   public int getInvoiceNumber() {
      return invoiceNumber;
   }

   public void setInvoiceNumber(int invoiceNumber) {
      this.invoiceNumber = invoiceNumber;
   }

   public String getDescription() {
      return description;
   }

   public void setDescription(String description) {
      this.description = description;
   }

   public double getPrice() {
      return price;
   }

   public void setPrice(double price) {
      this.price = price;
   }
}
