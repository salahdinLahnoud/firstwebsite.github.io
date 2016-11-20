/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controle;

import java.util.ArrayList;
import model.Bestellingen;

/**
 *
 * @author salahdin
 */
public class BestellingenBeans {
    Bestellingen bestellingen = new Bestellingen();
    ArrayList<Bestellingen> lijst = new ArrayList<Bestellingen>();

    public Bestellingen getBestellingen() {
        return bestellingen;
    }

    public void setBestellingen(Bestellingen bestellingen) {
        this.bestellingen = bestellingen;
    }

    public ArrayList<Bestellingen> getLijst() {
        return lijst;
    }

    public void setLijst(ArrayList<Bestellingen> lijst) {
        this.lijst = lijst;
    }
    
    
}
