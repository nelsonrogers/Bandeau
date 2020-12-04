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
public class Teletexte extends Effet {
    
    //Constructeur
    public Teletexte(Color couleurEffet, String text) {
        super(couleurEffet, text);
    }
    
    //Constructeur par défaut
    public Teletexte() {
        
    }
    
    // start() lance l'animation
    @Override
    public void start(Bandeau monBandeau) {
        monBandeau.setForeground(couleurEffet);
        //On initialise la chaine de caractères
        String message = "";
        for (int i = 0; i < text.length(); i++) {
                //On ajoute les lettres une par une 
                message += String.valueOf(text.charAt(i));
		monBandeau.setMessage(message);
		monBandeau.sleep(100);
	}
        monBandeau.sleep(1000);
    }
}