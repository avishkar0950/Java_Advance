/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

/**
 *
 * @author HP
 */
import java.awt.*;
import java.awt.event.*;

public class frame_ex extends Frame{
    frame_ex()
    {
        addWindowListner(new WindowAdapter(){
            public void windowCLosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
               
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        frame_ex f1=new frame_ex();
        f1.setVisible(true);
        f1.setSize(300, 300);
        f1.setTitle("my first applet program");
        f1.setCursor(Cursor.CROSSHAIR_CURSOR);
    }

    private void addWindowListner(WindowAdapter windowAdapter) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
}
