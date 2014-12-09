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
public class    Administrateur extends CompteSalarie
{
    public      Administrateur()
    {
    }
    
    public Retour   recupererSalaries()
    {
        return new Retour(2);
    }
    
    public Retour   creerCompteSalarie(String nom)
    {
        return new Retour(2);
    }
    
    public Retour   ajouterUnRole(String nom, String role)
    {
        return new Retour (2);
    }
     public Retour  supprimerUnRole(String nom, String role)
    {
        return new Retour(2);
    }
    public Retour   desactiverUnCompte(String nom)
    {
        return new Retour(2);
    }
    
    public Retour   modificationFrequencePurge(int nbJours)
    {
        return new Retour(2);
    }
    
    public Retour   modificationDatePurge(Date date)
    {
        return new Retour(2);
    }
    
    public Retour   dureeSauvegardeArchive(int nbMois)
    {
        return new Retour(2);
    }
}
