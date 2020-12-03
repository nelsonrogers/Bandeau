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
    
    public Rotation(Color couleurEffet, String text) {
        super(couleurEffet, text);
    }
    
    public Rotation() {
        
    }
    
    @Override
    public void start(Bandeau monBandeau) {
        monBandeau.setForeground(couleurEffet);
        monBandeau.setMessage(text);
	monBandeau.sleep(1000);
	for (int i = 0; i <= 100; i++) {
		monBandeau.setRotation(2*Math.PI*i / 100);
		monBandeau.sleep(50);
	}
        monBandeau.sleep(1000);
    }
}