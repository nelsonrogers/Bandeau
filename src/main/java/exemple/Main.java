/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemple;

import bandeau.Bandeau;
import static java.awt.Color.*;


/**
 *
 * @author nelsonrogers
 */
public class Main {
    public static void main(String[] args) {
        Scenario scenario = new Scenario();
        Bandeau monBandeau = scenario.getMonBandeau();
        
        
        // On créé des effets avec le texte et la couleur de texte souhaités
        Zoom zoom = new Zoom();
        Clignote clignote = new Clignote(MAGENTA, "CLIGNOTE", 3);
        Rotation rotation = new Rotation(MAGENTA, "ROTATION");
        Teletexte teletexte = new Teletexte(MAGENTA, "TELETEXTE");
        
        // On ajoute les effets au scénario dans l'ordre voulu
        scenario.addEffet(1, zoom, 1);
        scenario.addEffet(4, clignote, 1);
        scenario.addEffet(0, rotation, 2);
        scenario.addEffet(3, teletexte, 3);
        
        
        for (Effet effet : scenario.getMesEffets().values()) {
            int nb_repetitions = scenario.getMesEffets2().get(effet);
            for (int i = 0 ; i < nb_repetitions ; i++) {
                effet.start(monBandeau);
            } 
        }
        monBandeau.close();
        
    }
}
