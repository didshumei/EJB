/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import java.util.Date;

/**
 *
 * @author Frontoni
 */
public class Administrateur extends CompteSalarie
{
    public Administrateur()
    {
        super();
    }
    
    public boolean  recupererSalaries() // Ajouter dans les EJB
    {
        return true;
    }
    
    public boolean  creerCompte(String nom, String prenom, String login, String password)
    {
        return true;
    }
    
    public boolean  ajouterUnRole(Salarie salarie, String unRole)
    {
        return true;
    }
     public boolean  supprimerUnRole(Salarie salarie, String unRole)
    {
        return true;
    }
    public boolean  desactiverUnCompte(Salarie salarie)
    {
        return true;
    }
    
    public boolean  modificationFrequencePurge(int nbJours)
    {
        return true;
    }
    
    public boolean  modificationDatePurge(Date date)
    {
        return true;
    }
    
    public boolean  dureeSauvegardeArchive(int nbMois)
    {
        return true;
    }
}
