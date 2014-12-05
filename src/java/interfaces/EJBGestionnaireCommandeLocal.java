/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import javax.ejb.Local;

/**
 *
 * @author Frontoni
 */
@Local
public interface EJBGestionnaireCommandeLocal
{
    boolean  mettreEnRemboursement(int idLigneCommande);
    
    boolean  saisirAccuseReception();
    
    boolean  getCommandeLivraisonPartielle();
}
