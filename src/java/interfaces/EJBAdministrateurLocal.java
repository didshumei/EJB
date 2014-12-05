/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.Date;
import javax.ejb.Local;
import metier.Salarie;

/**
 *
 * @author Frontoni
 */
@Local
public interface EJBAdministrateurLocal
{
    
    boolean creerCompte(String nom, String prenom, String login, String password);
    
    boolean  ajouterUnRole(Salarie salarie, String unRole);
    
    boolean  supprimerUnRole(Salarie salarie, String unRole);
    
    boolean  desactiverUnCompte(Salarie salarie);
    
    boolean  modificationFrequencePurge(int nbJours);
    
    boolean  modificationDatePurge(Date date);
    
    boolean  dureeSauvegardeArchive(int nbMois);
}
