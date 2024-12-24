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
public class colorset extends Applet {

    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        // TODO start asynchronous download of heavy resources
    }
    public void paint(Graphics g)
    {
        g.setColor(Color.red);
        g.drawString("welcome to class", 50, 50);
        g.setColor(Color.DARK_GRAY);
        g.fillOval(150, 150, 60, 60);
    }
    // TODO overwrite start(), stop() and destroy() methods
}
