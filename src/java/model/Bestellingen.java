/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author salahdin
 */
public class Bestellingen {

    private int id;
    private String naam;
    private int qty;
    private double totaal;
    private String besteller;
    //private String telefoon;

    public Bestellingen() {
    }

    public Bestellingen(int id, String naam, int qty, double totaal, String besteller) {
        this.id = id;
        this.naam = naam;
        this.qty = qty;
        this.totaal = totaal;
        this.besteller = besteller;
        
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public double getTotaal() {
        return totaal;
    }

    public void setTotaal(double totaal) {
        this.totaal = totaal;
    }

    public String getBesteller() {
        return besteller;
    }

    public void setBesteller(String besteller) {
        this.besteller = besteller;
    }

    @Override
    public String toString() {
        return "Bestellingen{" + "id=" + id + ", naam=" + naam + ", qty=" + qty + ", totaal=" + totaal + ", besteller=" + besteller + '}';
    }


    
    public static ArrayList getAll() {

        Database db = new Database();
        ArrayList allbestelling = new ArrayList();
        try {
            ResultSet rs = db.executSelect("SELECT * FROM bestellingen");
            while (rs.next()) {

                Bestellingen pr = new Bestellingen();
                pr.id = rs.getInt(1);
                pr.naam = rs.getString(2);
                pr.qty = rs.getInt(3);
                pr.totaal = rs.getDouble(4);
                pr.besteller = rs.getString(5);
               // pr.telefoon = rs.getString(6);
                allbestelling.add(pr);
            }

        } catch (Exception e) {

            throw new SecurityException(e);
        }

        return allbestelling;

    }
    public void deleteBestellingen(int id){
    
        try {
            DBConnect db = new DBConnect();
            db.excuteDml("DELETE FROM bestellingen where id = "+ id);
            db.close();
                     
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    
    }
    public void updateBestellingen(){
    
        try {
            DBConnect db = new DBConnect();
            db.excuteDml("UPDATE bestellingen SET id = "+id+", naam ="+naam+", qty = "+qty+", totaal="+totaal+", besteller"+ besteller);
            db.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        
        }
    
    }
}
