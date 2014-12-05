/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

/**
 *
 * @author Frontoni
 */
public class GestionnaireCommande extends CompteSalarie
{
    public GestionnaireCommande()
    {
    }
    
    public boolean  mettreEnRemboursement(int idLigneCommande)
    {
        return true;
    }
    
    public boolean  saisirAccuseReception()
    {
        return true;
    }
    
    public boolean  getCommandeLivraisonPartielle()
    {
        return true;
    }
}
