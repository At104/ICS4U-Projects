package U1A3_Greetings;
import javax.swing.*;
import java.awt.*;

/**
 * File Name: U3A3_Greetings
 * Programmer: Atul Rao
 * Date: 2022-02-14
 * Description: This program demonstrates the use of graphics using the JFrame GUI in Java. It allows you to create
 * an interactive GUI that is easy to use for others.
 * 
**/

public class U1A3_Greetings extends JFrame{
    public U1A3_Greetings () {
        //Creates the bounds of the JFrame that will be displayed
        super ("About Me!");
        setSize(580,250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        FlowLayout flo = new FlowLayout();
        setLayout(flo);
        //Adds text that will be displayed on the GUI
        JLabel name = new JLabel("<html>My name is Atul R, and I attend A.B Lucas Secondary School.<br></html>", SwingConstants.CENTER); 
        JLabel music = new JLabel("<html>I enjoy all kinds of music, there is not one specific genre I enjoy.<br></html>", SwingConstants.CENTER);
        JLabel show = new JLabel("<html>I do not typically watch tv shows, however as a child I watched a lot of Spongebob.<br></html>", SwingConstants.CENTER);
        JLabel colour = new JLabel("<html>My favourite colour has always been red, but all I like all warm colour.s<br></html>", SwingConstants.CENTER);
        JLabel facts = new JLabel("<html>Fun facts about me are that I have always been interested in computers, as well as video games.<br></html>", SwingConstants.CENTER);  
        //Adds all the elements to the JFrame
        add(name);
        add(music);
        add(show);
        add(colour);
        add(facts);
        setVisible(true);
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Displays the JFrame GUI
        new U1A3_Greetings();
    }
}