/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/JApplet.java to edit this template
 */

import javax.swing.JApplet;
import java.applet.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;
/**
 *
 * @author HP
 */
public class newfromapp extends JApplet implements ActionListener{
JButton b;
JTextField tf;
    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        // TODO start asynchronous download of heavy resources
        tf=new JTextField();
        b=new JButton("click me");
        tf.setBounds(150,300,150,150);
        b.setBounds(100,150,100,100);
        add(tf);
        add(b);
        tf.setText("action is performed");
        b.addActionListener(this);
        
    }
    public void actionPerformed(ActionEvent e)
    {
        tf.setForeground(Color.BLUE);
       
    }

    // TODO overwrite start(), stop() and destroy() methods

    
}
