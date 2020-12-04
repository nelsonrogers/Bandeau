/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemple;

import bandeau.Bandeau;
import static java.awt.Color.*;
import java.awt.Font;


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
        Rotation rotation = new Rotation(ORANGE, "ROTATION");
        Teletexte teletexte = new Teletexte(CYAN, "TELETEXTE");
        
        // On ajoute les effets au scénario dans l'ordre voulu (voir premier paramètre)
        // Avec le nombre de répétitions souhaitées (dernier paramètre)
        scenario.addEffet(3, zoom, 1);
        scenario.addEffet(1, clignote, 1);
        scenario.addEffet(0, rotation, 2);
        scenario.addEffet(2, teletexte, 3);
        
        monBandeau.setMessage("");
        monBandeau.sleep(1500);
        // Police par défaut
        Font font = monBandeau.getFont();
        
        // Réalise les effets le nombre de fois souhaité
        for (Effet effet : scenario.getMesEffets().values()) {
            monBandeau.setFont(font);
            int nb_repetitions = scenario.getMesEffets2().get(effet);
            for (int i = 0 ; i < nb_repetitions ; i++) {
                effet.start(monBandeau);
            } 
        }
        monBandeau.close();
        
    }
}
