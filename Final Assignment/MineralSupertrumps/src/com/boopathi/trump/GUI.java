package com.boopathi.trump;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

/**
 * 
 * @author Boopathi Selvaraj
 * @since 20/10/2016
 * 
 * This handles the GUI of the game. Ity forms a JFrame and instantiates it to show the actual game dialog window. 
 *
 */

public class GUI extends JFrame implements ActionListener {
    JFrame frame = new JFrame("Mineral SuperTrump");
    final int WIDTH = 1200;
    final int HEIGHT = 900;

    //global defines
    Font titleFont = new Font("Arial", Font.BOLD, 20);
    Font subtitleFont = new Font("Arial", Font.BOLD, 16);
    Font textFont = new Font("Arial", Font.BOLD, 12);

    //main menu
    JLabel menuTitle = new JLabel("Mineral SuperTrump");
    JLabel menuIntro = new JLabel("Welcome to Mineral SuperTrump!");
    JButton startButton = new JButton("Start Game");
    JButton howToPlayButton = new JButton("How To Play");
    JButton exitButton = new JButton("Exit");
    JButton homeButton = new JButton("Home");

    //game screen
    JLabel gameIntro = new JLabel("Select the card you wish to play.");
    JLabel test = new JLabel(new ImageIcon("images/Slide01"));
    JLabel cardLabel0 = new JLabel();
    JLabel cardLabel1 = new JLabel();
    JLabel cardLabel2 = new JLabel();
    JLabel cardLabel3 = new JLabel();
    JButton cardButton0 = new JButton();
    JButton cardButton1 = new JButton();
    JButton cardButton2 = new JButton();
    JButton cardButton3 = new JButton();
    JButton cardButton4 = new JButton();
    JButton cardButton5 = new JButton();
    JButton cardButton6 = new JButton();
    JButton cardButton7 = new JButton();


    //panels
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();
    JPanel panel4 = new JPanel();


    public void createMainMenu() {

        setSize(WIDTH, HEIGHT);
        setLayout(new GridLayout(3,1));

        //edit elements
        menuTitle.setFont(titleFont);
        menuTitle.setHorizontalAlignment(JLabel.CENTER);
        menuIntro.setFont(subtitleFont);
        menuIntro.setHorizontalAlignment(JLabel.CENTER);
        panel1.setLayout(new GridLayout(2,1));
        panel3.setLayout(new FlowLayout());

        //add elements

        panel1.add(menuTitle);
        panel1.add(menuIntro);
        panel2.add(startButton);
        panel2.add(howToPlayButton);
        panel3.add(exitButton);

        add(panel1);
        add(panel2);
        add(panel3);


        //add listeners
        startButton.addActionListener(this);
        howToPlayButton.addActionListener(this);
        exitButton.addActionListener(this);

        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void createGameGUI() {
        ArrayList currentCards, currentCard, card;
        setSize(WIDTH, HEIGHT);
        setLayout(new GridLayout(3,1));

        //edit elements
        menuTitle.setFont(titleFont);
        menuTitle.setHorizontalAlignment(JLabel.CENTER);
        gameIntro.setFont(subtitleFont);
        gameIntro.setHorizontalAlignment(JLabel.CENTER);
        gameIntro.setVerticalAlignment(SwingConstants.BOTTOM);
        panel1.setLayout(new GridLayout(2,1));
        panel2.setLayout(new GridLayout(1,4));
        panel3.setLayout(new GridLayout(1,4));

        try {
            currentCards = (ArrayList) Player.getPlayerCards(0);
            currentCard = (ArrayList) currentCards.toArray()[0];
            for(int i = 0; i< currentCard.toArray().length ; i++) {
                card = (ArrayList) currentCard.toArray()[i];
                Image img = ImageIO.read(getClass().getResource("images/" + card.toArray()[0]));
                Image newimg = img.getScaledInstance( 180, 260,  java.awt.Image.SCALE_SMOOTH ) ;
                switch(i) {
                    case 0:
                        cardButton0.setIcon(new ImageIcon(newimg));
                        cardButton0.setSize(10,20);
                        break;
                    case 1:
                        cardButton1.setIcon(new ImageIcon(newimg));
                        cardButton1.setSize(10,20);
                        break;
                    case 2:
                        cardButton2.setIcon(new ImageIcon(newimg));
                        cardButton2.setSize(10,20);
                        break;
                    case 3:
                        cardButton3.setIcon(new ImageIcon(newimg));
                        cardButton3.setSize(10,20);
                        break;
                    case 4:
                        cardButton4.setIcon(new ImageIcon(newimg));
                        cardButton4.setSize(10,20);
                        break;
                    case 5:
                        cardButton5.setIcon(new ImageIcon(newimg));
                        cardButton5.setSize(10,20);
                        break;
                    case 6:
                        cardButton6.setIcon(new ImageIcon(newimg));
                        cardButton6.setSize(10,20);
                        break;
                    case 7:
                        cardButton7.setIcon(new ImageIcon(newimg));
                        cardButton7.setSize(10,20);
                        break;

                }

            }
            } catch (IOException ex){

        }

        //add elements

        panel1.add(menuTitle);
        panel1.add(gameIntro);
        panel2.add(cardButton0);
        panel2.add(cardButton1);
        panel2.add(cardButton2);
        panel2.add(cardButton3);
        panel3.add(cardButton4);
        panel3.add(cardButton5);
        panel3.add(cardButton6);
        panel3.add(cardButton7);
        panel4.add(exitButton);

        add(panel1);
        add(panel2);
        add(panel3);
        //add(panel4);


        //add listeners
        startButton.addActionListener(this);
        exitButton.addActionListener(this);

        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }


    public void actionPerformed(ActionEvent e) {
        //all actions from buttons ect

        if(e.getSource() == startButton){
                    dispose();
                GUI gameGUI = new GUI();
                gameGUI.createGameGUI();
                gameGUI.setTitle("Mineral SuperTrump");
                gameGUI.setVisible(true);
                Game.startGameLoop();
        
        }
        if (e.getSource() == exitButton){
            //force close
            dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
        }
        if (e.getSource() == howToPlayButton) {
            dispose();
            GUI howToPlayGUI = new GUI();
            howToPlayGUI.createHTPGUI();
            howToPlayGUI.setTitle("Mineral SuperTrump");
            howToPlayGUI.setVisible(true);

        }
        if (e.getSource() == homeButton) {
            dispose();
            GUI createMainMenu = new GUI();
            createMainMenu.createMainMenu();
            createMainMenu.setVisible(true);

        }
    }

    private void createHTPGUI() {
        setSize(WIDTH, HEIGHT);
        setLayout(new GridLayout(2,1));

        panel1.setLayout(new GridLayout(1,4));
        panel2.setLayout(new FlowLayout());

        try {
            for(int i = 61; i< 65 ; i++) {
                Image img = ImageIO.read(getClass().getResource("images/Slide" + i+".jpg"));
                Image newimg = img.getScaledInstance( 320, 400,  java.awt.Image.SCALE_SMOOTH ) ;
                switch(i) {
                    case 61:
                        cardLabel0.setIcon(new ImageIcon(newimg));
                        break;
                    case 62:
                        cardLabel1.setIcon(new ImageIcon(newimg));
                        break;
                    case 63:
                        cardLabel2.setIcon(new ImageIcon(newimg));
                        break;
                    case 64:
                        cardLabel3.setIcon(new ImageIcon(newimg));
                        break;
                }

            }
        } catch (IOException ex){

        }

        //add elements
        panel1.add(cardLabel0);
        panel1.add(cardLabel1);
        panel1.add(cardLabel2);
        panel1.add(cardLabel3);
        panel2.add(homeButton);

        add(panel1);
        add(panel2);

        //add listeners
        homeButton.addActionListener(this);

        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}



