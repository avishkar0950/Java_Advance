/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Applet.java to edit this template
 */

import java.applet.Applet;
import java.awt.*;

/**
 *
 * @author HP
 */
public class image extends Applet {
    Image img1;
    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
    public void init() {
        // TODO start asynchronous download of heavy resources
        img1=getImage(getDocumentBase(),"1213.png");
    }
    public void paint(Graphics g)
    {
        g.drawImage(img1, 0, 0, this);
    }
    // TODO overwrite start(), stop() and destroy() methods
}
