import javax.swing.*;
import java.awt.*;

public class JBookQuote extends JFrame
{
   FlowLayout flowLayout = new FlowLayout();
   JLabel message1 = new  JLabel("Welcome");
   public JBookQuote()
   {
      super("Lines from my book");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(flowLayout);
      add(message1);
   }
   public static void main(String[] args)
   {
     JBookQuote jBookQuote = new JBookQuote();
     jBookQuote.setSize(300, 150);
     jBookQuote.setVisible(true);
   }
}