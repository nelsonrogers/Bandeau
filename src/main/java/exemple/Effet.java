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
public abstract class Effet {
    
    // Attributs
    protected Color couleurEffet;
    protected String text;
    
    //Constructeur
    public Effet(Color couleurEffet, String text) {
        this.couleurEffet = couleurEffet;
        this.text = text;
    }
    
    //Constructeur par défaut
    public Effet() {
        this.couleurEffet = Color.BLACK;
        this.text = "DEFAUT";
    }
    
    // Ne fais rien
    public void start(Bandeau monBandeau) {
        
    }
}
