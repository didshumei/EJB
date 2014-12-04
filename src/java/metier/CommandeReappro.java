/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import java.util.ArrayList;

/**
 *
 * @author jean
 */
public class CommandeReappro
{
    private ArrayList<LigneCommandeReappro> lignes;
    private String date;
    private double montant;
    private int idCommande;

    public CommandeReappro()
    {
        lignes = new ArrayList<LigneCommandeReappro>();
    }
    
    public CommandeReappro(int id)
    {
        idCommande = id;
    }

    public String getDate()
    {
        return date;
    }

    public void setDate(String date)
    {
        this.date = date;
    }

    public double getMontant()
    {
        return montant;
    }

    public void setMontant(double montant)
    {
        this.montant = montant;
    }

    public int getIdCommande()
    {
        return idCommande;
    }

    public void setIdCommande(int idCommande)
    {
        this.idCommande = idCommande;
    }
    
    public void ajouterLigne(LigneCommandeReappro ligne)
    {
        if(ligne != null)
        {
            lignes.add(ligne);
        }
    }
}