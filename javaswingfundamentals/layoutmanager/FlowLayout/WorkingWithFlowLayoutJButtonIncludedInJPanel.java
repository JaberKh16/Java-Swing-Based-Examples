/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaswingfundamentals.layoutmanager.FlowLayout;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WorkingWithFlowLayoutJButtonIncludedInJPanel {

    public static void main(String [] args)
    {
        // Creating a JFrame
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // By default 'FlowLayout' constructor value is set to "FlowLayout.CENTER"
        frame.setLayout(new FlowLayout(FlowLayout.LEADING, 10, 10)); // setting the Layout to 'FlowLayout.LEADING', width=100, height=250 
        
        
        // Creating a JPanel
        JPanel panel = new JPanel();
        panel.setBackground(Color.lightGray);
        panel.setPreferredSize(new Dimension(100, 250)); // set the Dimension(width=100, height=250)
        panel.setLayout(new FlowLayout()); // JPanel default Layout is 'FlowLayout', so not setting it  to 'FlowLayout' also works
        
        // Creating Some JButtons
        JButton button1 = new JButton();
        button1.setText("1");
        JButton button2 = new JButton();
        button2.setText("2");
        JButton button3 = new JButton();
        button3.setText("3");
        JButton button4 = new JButton();
        button4.setText("4");
        JButton button5 = new JButton();
        button5.setText("5");
        JButton button6 = new JButton();
        button6.setText("6");
        JButton button7 = new JButton();
        button7.setText("7");
        JButton button8 = new JButton();
        button8.setText("8");
        JButton button9 = new JButton();
        button9.setText("9");

        
        // Addint Those Buttons to the Frame
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
        panel.add(button6);
        panel.add(button7);
        panel.add(button8);
        panel.add(button9);
        
        // Adding The Panel to the Frame
        frame.add(panel);
        // Setting The Visibility to 'true'
        frame.setVisible(true);
    }
}
