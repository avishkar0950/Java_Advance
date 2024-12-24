/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Applet.java to edit this template
 */

import java.applet.Applet;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
/**
 *
 * @author HP
 */
public class frame extends Frame {
frame()
{
    Label l1=new Label("my first");
    l1.setBounds(100,100,100,100);
    add(l1);
    
    setSize(400,300);
    setTitle("applet porogramming");
    setLayout(new FlowLayout());
    setVisible(true);
}
    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        // TODO start asynchronous download of heavy resources
    }

    // TODO overwrite start(), stop() and destroy() methods

   
}
