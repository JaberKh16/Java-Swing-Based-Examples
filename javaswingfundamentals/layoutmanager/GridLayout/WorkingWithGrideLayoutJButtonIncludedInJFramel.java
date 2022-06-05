/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaswingfundamentals.layoutmanager.GridLayout;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;


public class WorkingWithGrideLayoutJButtonIncludedInJFramel {

    public static void main(String [] args)
    {
        // Creating a JFrame
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // By default 'GridLayout' constructor value is set to "GridLayout.CENTER"
        frame.setLayout(new GridLayout(3, 3, 10, 10)); // setting the GridLayout with #rows=3, #columns=3, width=100, height=250 
        
        
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
        JButton button10 = new JButton();
        button10.setText("=");

        
        // Addint Those Buttons to the Frame
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);
        frame.add(button7);
        frame.add(button8);
        frame.add(button9);
        frame.add(button10);
        
        // Setting The Visibility to 'true'
        frame.setVisible(true);
    }
}
