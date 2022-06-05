/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaswingfundamentals.layoutmanager.BorderLayout;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WorkingWithBorderLayout {

    public static void main(String [] args)
    {
        // Creating a JFrame
        JFrame frame = new JFrame();
        frame.setSize(500, 500); // setting the frame size
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close on close mark
        //frame.setLayout(new BorderLayout()); // with no pixels value; default behavior for JFrame
        
        // To set margin along with width and height do the following:
        //frame.setLayout(new BorderLayout(10, 0)); // width_margin = 10, height_margin = 0
        frame.setLayout(new BorderLayout(10, 10)); // width_margin = 10, height_margin = 10
        frame.setVisible(true); // setting the visibility 'true'
        
        // Creating some more JPanels
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel panel4 = new JPanel();
        JPanel panel5 = new JPanel();
        
        // Setting Backgrounds for the JPanels
        panel1.setBackground(Color.RED);
        panel2.setBackground(Color.BLUE);
        panel3.setBackground(Color.YELLOW);
        panel4.setBackground(Color.GREEN);
        panel5.setBackground(Color.LIGHT_GRAY);
        
        //Setting The Border Prefered Size
        panel1.setPreferredSize(new Dimension(100, 80));
        panel2.setPreferredSize(new Dimension(50, 100));
        panel3.setPreferredSize(new Dimension(50, 100));
        panel4.setPreferredSize(new Dimension(50, 80));
        panel5.setPreferredSize(new Dimension(100, 80));
        
        // Adding Those Panles into the Frame
        frame.add(panel1, BorderLayout.NORTH);
        frame.add(panel2, BorderLayout.WEST);
        frame.add(panel3, BorderLayout.EAST);
        frame.add(panel4, BorderLayout.SOUTH);
        frame.add(panel5, BorderLayout.CENTER);
    }
}
