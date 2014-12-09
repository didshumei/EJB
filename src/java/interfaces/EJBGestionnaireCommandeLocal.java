/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import javax.ejb.Local;
import metier.Retour;

/**
 *
 * @author Frontoni
 */
@Local
public interface    EJBGestionnaireCommandeLocal
{
    Retour  modifierStatutCommande(int idCommande, int nouveauStatut);
    
    Retour  mettreEnRemboursement(int idCommande, int idArticle);
    
    Retour  saisirAccuseReception(int idCommande, String lienImage);
    
    Retour   recupererCommandes();
    
    Retour   recupererLignesCommande(int idCommande);
}
