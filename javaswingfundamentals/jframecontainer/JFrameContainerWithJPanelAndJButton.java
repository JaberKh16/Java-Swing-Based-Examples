
package javaswingfundamentals.jframecontainer;

import javax.swing.*;



public class JFrameContainerWithJPanelAndJButton {
    
    public static void main(String [] args)
    {
        // creating a JFrame Object 
        // JFrame is top level container
        JFrame frame = new JFrame();
        // setting the JFrame Window Size 
        frame.setSize(800, 400); // width*height =(800 x 400)
        
        
        // creating a JPanel Object
        // JPanel is a low level container
        JPanel panel = new JPanel();
        
        // creating a JButton Object
        JButton b1 = new JButton();
        b1.setText("Ok"); // setting text for the button
        
        JButton b2 = new JButton();
        b2.setText("Cancel"); // setting text for the button
        
        
        // adding the button into the JFrame Container
        panel.add(b1); // adding the 1st button into the panel 
        panel.add(b2); // adding the 2nd button into the panel
        
        frame.setContentPane(panel); // tp set the JPanel with JFrame
        frame.setVisible(true); // set visible true to see the JFrame window on the screen
    }
    
}
