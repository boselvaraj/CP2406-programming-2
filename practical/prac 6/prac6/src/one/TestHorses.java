package one;

public class TestHorses
{
    public static void main(String args[])
    {
       Horse horse1 = new Horse();
       RaceHorse raceHorse1 = new RaceHorse();
       horse1.setName("abc");
       horse1.setColor("red");
       horse1.setBirthYear(2014);
       raceHorse1.setName("gfd");
       raceHorse1.setColor("pink");
       raceHorse1.setBirthYear(2015);
       raceHorse1.setRaces(2);

       System.out.println(horse1.getName() +" "+ horse1.getColor() +" "+ horse1.getBirthYear());
       System.out.println(raceHorse1.getName() +" "+ raceHorse1.getColor() +" "+ raceHorse1.getBirthYear());
       System.out.println(raceHorse1.getName() +" "+ raceHorse1.getRaces());
    }
}
