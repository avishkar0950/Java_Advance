/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Applet.java to edit this template
 */

import java.applet.Applet;
import java.awt.*;
import java.awt.Graphics;
/**
 *
 * @author HP
 */
public class graphbics extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        // TODO start asynchronous download of heavy resources
    }
    public void paint(Graphics g)
    {
        
        g.setColor(Color.magenta);
        g.drawString("welcome to java programming", 50, 50);
        g.setColor(Color.DARK_GRAY);
        g.fillRect(170, 200, 150, 150);
        g.setColor(Color.red);
        g.drawOval(170, 50, 150, 150);
        
        
    }

    // TODO overwrite start(), stop() and destroy() methods
}
