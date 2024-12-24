/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Applet.java to edit this template
 */

import java.applet.Applet;
import java.awt.Graphics;

/**
 *
 * @author HP
 */
public class smile extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        // TODO start asynchronous download of heavy resources
    }
    public void paint(Graphics g)
    {
        g.drawLine(80, 130, 50, 50);
        g.drawOval(80, 70, 150,150);
        g.fillOval(120, 120, 15, 15);
        g.fillOval(170, 120, 15, 15);
        g.fillOval(145, 140, 15, 15);
        g.drawArc(130, 180, 50, 20, 180, 180);
    }
    
    // TODO overwrite start(), stop() and destroy() methods
}
