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
public class image_tree extends Applet {

    Image img1;
    public void init()
    {
       img1=getImage(getDocumentBase(),"1.jpg");
    }
    public void paint(Graphics g)
    {
        g.drawImage(img1, 100, 100, this);
        
    }
    /**
     * Initialization method that will be called after the applet is loaded into
     * the browser.
     */
   

    // TODO overwrite start(), stop() and destroy() methods
}
