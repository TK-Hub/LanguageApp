/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package languageapp;

import ui.StartFrame;
import java.awt.Dimension;
import java.awt.Toolkit;

        
/**
 *
 * @author Tim
 */
public class LanguageApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // TODO code application logic here
    Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    StartFrame frame0=new StartFrame();
    frame0.setTitle("Fremdsprachenkurs - Polizei Hessen - V.1.0");
    frame0.setSize(500, 300);
    frame0.setResizable(false);
    frame0.setLocation(dim.width/2-frame0.getSize().width/2, dim.height/2-frame0.getSize().height/2);
    frame0.setVisible(true);    
    
    }
}
