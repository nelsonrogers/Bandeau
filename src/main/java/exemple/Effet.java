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
    
    protected Color couleurEffet;
    protected String text;
    
    
    public Effet(Color couleurEffet, String text) {
        this.couleurEffet = couleurEffet;
        this.text = text;
    }
    
    public Effet() {
        this.couleurEffet = Color.BLACK;
        this.text = "DEFAUT";
    }
    
    
    
    public void start(Bandeau monBandeau) {
        
    }
}
