/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaswingfundamentals.jpanelcontainer;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JFrameWithDifferentJPanelsWithoutLayout {

    public static void main(String [] args)
    {
        // Creating a JFrame
        JFrame frame = new JFrame();
        frame.setSize(500, 500); // setting the frame size
        frame.setResizable(false); // setting the reziable to 'false'
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close on close mark
        frame.setVisible(true); // setting the visibility 'true'


        // Creating some JPanel
        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.RED); // setting the Background Color to 'Red'
        redPanel.setBounds(0, 0, 250, 250); // setting the Bounds to x_dim = 0, y_dim = 0, width = 250, height = 250
        
        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.BLUE); // setting the Background Color to 'Blue'
        bluePanel.setBounds(250, 0, 250, 250); // setting the Bounds to x_dim = 250, y_dim = 0, width = 250, height = 250
        
        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.GREEN); // setting the Background Color to 'Blue'
        greenPanel.setBounds(0, 250, 500, 500); // setting the Bounds to x_dim = 250, y_dim = 0, width = 250, height = 250
        
        
        // adding the Panels to the Frame
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);
        
    }
}
