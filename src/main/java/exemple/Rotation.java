/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemple;

import bandeau.Bandeau;
import java.awt.Color;

/**
 *
 * @author nelsonrogers
 */
public class Rotation extends Effet {
    
    // Constructeur
    public Rotation(Color couleurEffet, String text) {
        super(couleurEffet, text);
    }
    
    // Constructeur par défaut
    public Rotation() {
        
    }
    
    // start() lance l'animation
    @Override
    public void start(Bandeau monBandeau) {
        monBandeau.setForeground(couleurEffet);
        monBandeau.setMessage(text);
	for (int i = 0; i <= 100; i++) {
                // On augmente la rotation jusqu'à langle 2PI (soit un tour complet)
		monBandeau.setRotation(2*Math.PI*i / 100);
		monBandeau.sleep(50);
	}
    }
}