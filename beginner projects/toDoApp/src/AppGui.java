import java.awt.Image;

import javax.swing.*;

public class AppGui {
    public static void main (String[] args){
        JFrame window = new JFrame("Shadarien's To Do App");
        // enable user to close the app
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // sets size of the window
        window.setSize(600, 600);

        JButton button = new JButton("Press");

        // Adds Button to content pane of frame
        window.getContentPane().add(button); 
        window.setVisible(true);


        System.out.println("App started");
    }
}
