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
    
    // Constructeur
    public Zoom(Color couleurEffet, String text) {
        super(couleurEffet, text);
    }
    
    //Constructeur par défaut
    public Zoom() {
        
    }
    
    // start() lance l'animation
    @Override
    public void start(Bandeau monBandeau) {
        monBandeau.setForeground(couleurEffet);
        monBandeau.setMessage(text);
        // On augmente la taille de la police petit à petit : effet zoom
        for (int i = 5; i < 60 ; i+=5) {
                monBandeau.setFont(new Font("Dialog", Font.BOLD, 5+i));
                monBandeau.sleep(100);
        }
        monBandeau.sleep(1000);
    }
}