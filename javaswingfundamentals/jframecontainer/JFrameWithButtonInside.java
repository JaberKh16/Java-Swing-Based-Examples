
package javaswingfundamentals.jframecontainer;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;


public class JFrameWithButtonInside {
    
    public static void main(String [] args)
    {
        // creating a JFrame object 
        // JFrame is top level container
        JFrame frame = new JFrame();
        // setting the JFrame Window Size 
        frame.setSize(400, 400); // height*width =(400 x 400)
        frame.setLayout(null); // setting the Layout to 'null' to avoid the floating behavior of components
        
        // creating a JButton Object
        JButton b1 = new JButton();
        b1.setText("Click here"); // setting text for the button
        b1.setBounds(150,100, 100, 50);  // setting the Button position to x_dim = 200, y_dim =100 and its width = 100, height=50
        b1.setText("Click me"); // setting a Text inside the Button
        b1.setFocusable(false); // setting Focusable to 'false' to get rid of the box inside the Button
        b1.setForeground(Color.cyan);
        b1.setBackground(Color.LIGHT_GRAY);
        
        // adding the button into the JFrame Container
        frame.add(b1);
        
        frame.setVisible(true); // set visible true to see the JFrame window on the screen
    }
}
