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
public class Clignote extends Effet {

    private int multiplicite;
    
    public Clignote(Color couleurEffet, String text, int multiplicite) {
        super(couleurEffet, text);
        this.multiplicite = multiplicite;
    }
    
    public Clignote() {
        multiplicite = 10;
    }
    
    @Override
    public void start(Bandeau monBandeau) {
        monBandeau.setForeground(couleurEffet);
        monBandeau.setMessage(text);
        monBandeau.sleep(500);
        for (int i = 0; i <= multiplicite; i++) {
            monBandeau.setMessage(text);
            monBandeau.sleep(300);
            monBandeau.setMessage("");
            monBandeau.sleep(300);
        }
        monBandeau.sleep(1000);
    }
}