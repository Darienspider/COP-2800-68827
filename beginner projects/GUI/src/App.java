
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class App implements ActionListener {
    private JFrame frame = new JFrame();
    private JTextField textField = new JTextField();

    public App() {
        // the window with the button and text
        JPanel window = new JPanel();
        JPanel windowContent = new JPanel();

        window.setBorder(BorderFactory.createEmptyBorder(300, 300, 100, 300));
        window.setLayout(new GridLayout(50, 6));

        // splits the window
        JSplitPane splitWindow = new JSplitPane();
        splitWindow.setDividerLocation(150);

        // left side for entering in information
        JPanel leftPanel = new JPanel();
        
                 // Requested an item to scan for
        JLabel textFieldLabel = new JLabel("Insert Item Name: ");
        textField.getPreferredSize();
    
                 // creates the submit button
        JButton submit = new JButton("Submit");
        submit.addActionListener(this);

                 // adds each created field above to the window
        leftPanel.add(textField);
        leftPanel.add(textFieldLabel);
        leftPanel.add(submit);




        // right side for data export 

        JPanel rightJPanel = new JPanel();
        JButton test = new JButton("test");
        rightJPanel.add(test);
        


        // add each panel to the content panel of Window
        windowContent.add(leftPanel);
        windowContent.add(rightJPanel);


        window.add(windowContent);
        // set up the frame and display it
        frame.add(window, BorderLayout.NORTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("GUI");
        frame.pack();
        frame.setVisible(true);
    }



    // process the button clicks
    public void actionPerformed(ActionEvent anyEvent) {
        String text = textField.getText();
        System.out.println(text);
    }

    public void createNewLabel( String[] ArrayItems){
        for(String arrayItem : ArrayItems){

        }
    }

    // create one Frame
    public static void main(String[] args) {
        new App();
    }

}