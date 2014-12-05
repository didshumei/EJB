/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejb;

import java.util.Date;
import javax.ejb.Stateless;
import metier.Administrateur;
import interfaces.EJBAdministrateurLocal;
import metier.Salarie;

/**
 *
 * @author Frontoni
 */
@Stateless
public class EJBAdministrateur implements EJBAdministrateurLocal
{
    Administrateur  admin;
    
    public EJBAdministrateur() 
    {
        admin = new Administrateur();
    }

    @Override
    public boolean modificationFrequencePurge(int nbJours)
    {
        return admin.modificationFrequencePurge(nbJours);
    }

    @Override
    public boolean modificationDatePurge(Date date)
    {
        return admin.modificationDatePurge(date);
    }

    @Override
    public boolean dureeSauvegardeArchive(int nbMois)
    {
        return admin.dureeSauvegardeArchive(nbMois);
    }

    @Override
    public boolean creerCompte(String nom, String prenom, String login, String password)
    {
        return admin.creerCompte(nom, prenom, login, password);
    }

    @Override
    public boolean ajouterUnRole(Salarie salarie, String unRole)
    {
        return admin.ajouterUnRole(salarie, unRole);
    }

    @Override
    public boolean supprimerUnRole(Salarie salarie, String unRole)
    {
        return admin.supprimerUnRole(salarie, unRole);
    }

    @Override
    public boolean desactiverUnCompte(Salarie salarie)
    {
        return admin.desactiverUnCompte(salarie);
    }
}
