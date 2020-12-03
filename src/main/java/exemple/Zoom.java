/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemple;

import bandeau.Bandeau;
import java.awt.Color;
import java.awt.Font;

/**
 *
 * @author nelsonrogers
 */
public class Zoom extends Effet{
    
    public Zoom(Color couleurEffet, String text) {
        super(couleurEffet, text);
    }
    
    public Zoom() {
        
    }
    
    @Override
    public void start(Bandeau monBandeau) {
        monBandeau.setForeground(couleurEffet);
        monBandeau.setFont(new Font("Dialog", Font.BOLD, 5));
        monBandeau.setMessage(text);
        for (int i = 5; i < 60 ; i+=5) {
                monBandeau.setFont(new Font("Dialog", Font.BOLD, 5+i));
                monBandeau.sleep(100);
        }
        monBandeau.sleep(1000);
    }
}