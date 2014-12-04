/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

/**
 *
 * @author sylvainbron
 */
public class LigneCommande {
    private int quantiteCommande;
    private int quantiteLivree;
    private float sstotal;
    private boolean isARembourser;

    public int getQuantiteCommande() {
        return quantiteCommande;
    }

    public void setQuantiteCommande(int quantiteCommande) {
        this.quantiteCommande = quantiteCommande;
    }

    public int getQuantiteLivree() {
        return quantiteLivree;
    }

    public void setQuantiteLivree(int quantiteLivree) {
        this.quantiteLivree = quantiteLivree;
    }
    

    public float getSstotal() {
        return sstotal;
    }

    public void setSstotal(float sstotal) {
        this.sstotal = sstotal;
    }

    public boolean isIsARembourser() {
        return isARembourser;
    }

    public void setIsARembourser(boolean isARembourser) {
        this.isARembourser = isARembourser;
    }
    
    
    
}
