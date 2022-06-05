
package javaswingfundamentals.jframecontainer;

import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.event.*;


public class CounterListener implements ActionListener {
    JFrame frame = null;
    JLabel label = null;
    JTextField textfield = null;
    JButton button1 = null;
    JButton button2 = null;
    JButton button3 = null;
    
    public CounterListener()
    {
        // creating the JFrame Class Object
        frame = new JFrame();
        frame.setLayout(new FlowLayout()); // specifying the Layout as FlowLayout()
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // set close operation on close
        frame.setSize(500, 200); // set width = 500 and height = 200
        
        // creating the JLabel Class Object 
        label = new JLabel("Counter Value"); // set the JLabel constructor value equals a string "Counter Value"
        // creating the JTextField Class Object
        textfield = new JTextField("0", 10); // set the text = "0" as placeholder and set the field streached up to 10 columns
        // creating the JButton Class Object
        button1 = new JButton("up"); // set JButton constuctor value to "up"
        button2 = new JButton("down"); // set JButton constuctor value to "down"
        button3 = new JButton("reset"); // set JButton constuctor value to "reset"
        
        // adding those in the frame
        frame.add(label);
        frame.add(textfield);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        
        // adding the lister to the button
        button1.addActionListener(this); // pass the object of Listener Class
        button2.addActionListener(this); // pass the object of Listener Class
        button3.addActionListener(this); // pass the object of Listener Class
        
        
        // set the visibility true to show the frame
        frame.setVisible(true);
        
    }
    
    public static void main(String [] args)
    {
        // creating the object of the class CounterListener
        new CounterListener();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        // event handling code wil be here
        if(ae.getSource() == button1) // checking from which source this "ae" object is called
        {
            int value = Integer.parseInt(textfield.getText()) + 1; // whatever inside the TextField get it and parse it into Integer
            textfield.setText(String.valueOf(value)); // convert the value into the String type
        }
        
        else if(ae.getSource() == button3)
        {
            String reset = "0";
            textfield.setText(reset);
        }
        else
        {
            int value = Integer.parseInt(textfield.getText()) - 1; // whatever inside the TextField get it and parse it into Integer
            textfield.setText(String.valueOf(value)); // convert the value into the String type
        }
        
    }
    
}

