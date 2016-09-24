import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JBookQuote2 extends JFrame implements ActionListener
{
   FlowLayout flowLayout = new FlowLayout();
   JLabel message1 = new  JLabel("Welcome");
   JButton button = new JButton("Click Me");
   JLabel clickMessage = new JLabel("My Book");
   public JBookQuote2()
   {
      super("Lines from my book");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setLayout(flowLayout);
      add(message1);
      add(button);
      button.addActionListener(this);
   }
   public static void main(String[] args)
   {
     JBookQuote2 jBookQuote2 = new JBookQuote2();
     jBookQuote2.setSize(260, 150);
     jBookQuote2.setVisible(true);
   }
   @Override
   public void actionPerformed(ActionEvent e)
   {
      add(clickMessage);
      validate();
      repaint();
   }
}