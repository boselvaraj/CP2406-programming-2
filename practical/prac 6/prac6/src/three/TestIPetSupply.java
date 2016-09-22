package three;

public class TestIPetSupply
{
   public static void main(String[] args)
   {
      ItemSold itemSold1 = new ItemSold();
      itemSold1.setInvoiceNumber(1);
      itemSold1.setDescription("pet box");
      itemSold1.setPrice(20);
      System.out.println(itemSold1.getInvoiceNumber() +" "+ itemSold1.getDescription() +" "+ itemSold1.getPrice());

      ItemSold itemSold2 = new ItemSold();
      itemSold2.setInvoiceNumber(2);
      itemSold2.setDescription("cat toy");
      itemSold2.setPrice(15);
      System.out.println(itemSold2.getInvoiceNumber() +" "+ itemSold2.getDescription() +" "+ itemSold2.getPrice());

      PetSold petSold1 = new PetSold();
      petSold1.setInvoiceNumber(3);
      petSold1.setDescription("dog");
      petSold1.setPrice(500);
      petSold1.setVaccinated(true);
      petSold1.setNeutered(true);
      petSold1.setHousebroken(true);
      System.out.println(petSold1.getInvoiceNumber() +" "+ petSold1.getDescription() +" "+ petSold1.getPrice());
      System.out.println(petSold1.isVaccinated() + " " + petSold1.isNeutered() + " " + petSold1.isHousebroken());

      PetSold petSold2 = new PetSold();
      petSold2.setInvoiceNumber(4);
      petSold2.setDescription("cat");
      petSold2.setPrice(200);
      petSold2.setVaccinated(false);
      petSold2.setNeutered(false);
      petSold2.setHousebroken(false);
      System.out.println(petSold2.getInvoiceNumber() +" "+ petSold2.getDescription() +" "+ petSold2.getPrice());
      System.out.println(petSold2.isVaccinated() + " " + petSold2.isNeutered() + " " + petSold2.isHousebroken());




   }

}