/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemple;

import bandeau.Bandeau;
import java.awt.Color;
import java.awt.Font;
import java.util.HashMap;


/**
 *
 * @author nelsonrogers
 */
public class Scenario {
    
    //Attributs
    Bandeau monBandeau;
    HashMap<Integer, Effet> mesEffets = new HashMap<>();
    HashMap<Effet, Integer> mesEffets2 = new HashMap<>();
    
    
    //Constructeur
    public Scenario() {
        monBandeau = new Bandeau();
    }
    
    public void addEffet(int position, Effet monEffet, int nb_repetitions) {
        //On associe une position à l'effet
        mesEffets.put(position, monEffet);
        //On y associe également un nombre de répétitions de l'effet
        mesEffets2.put(monEffet, nb_repetitions);
    }

    public Bandeau getMonBandeau() {
        return monBandeau;
    }

    public HashMap<Integer, Effet> getMesEffets() {
        return mesEffets;
    }
    
    public HashMap<Effet, Integer> getMesEffets2() {
        return mesEffets2;
    }
}