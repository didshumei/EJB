/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package metier;


import java.awt.Image;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author bron
 */
public class Commande {
    
    private int idClient;
    private Date dateCommande;
    private float totalCommande;
    private int statutCommande;
    private Image accuseCommande;
    private Date dateRembCommande;
    private ArrayList<LigneCommande> lignesCommande;
    
    
    public Commande() {
        lignesCommande = new ArrayList<LigneCommande>();
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public Date getDateCommande() {
        return dateCommande;
    }

    public void setDateCommande(Date dateCommande) {
        this.dateCommande = dateCommande;
    }

    public float getTotalCommande() {
        return totalCommande;
    }

    public void setTotalCommande(float totalCommande) {
        this.totalCommande = totalCommande;
    }

    public int getStatutCommande() {
        return statutCommande;
    }

    public void setStatutCommande(int statutCommande) {
        this.statutCommande = statutCommande;
    }

    public Image getAccuseCommande() {
        return accuseCommande;
    }

    public void setAccuseCommande(Image accuseCommande) {
        this.accuseCommande = accuseCommande;
    }

    public Date getDateRembCommande() {
        return dateRembCommande;
    }

    public void setDateRembCommande(Date dateRembCommande) {
        this.dateRembCommande = dateRembCommande;
    }
    
    
    
}
