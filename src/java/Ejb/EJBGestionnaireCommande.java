/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejb;

import interfaces.EJBGestionnaireCommandeLocal;
import javax.ejb.Stateless;
import metier.GestionnaireCommande;

/**
 *
 * @author Frontoni
 */
@Stateless
public class EJBGestionnaireCommande implements EJBGestionnaireCommandeLocal
{
    GestionnaireCommande    commande;
    
    public  EJBGestionnaireCommande()
    {
        commande = new GestionnaireCommande();
    }

    @Override
    public boolean mettreEnRemboursement(int idLigneCommande)
    {
        return commande.mettreEnRemboursement(idLigneCommande);
    }

    @Override
    public boolean saisirAccuseReception()
    {
        return commande.saisirAccuseReception();
    }

    @Override
    public boolean getCommandeLivraisonPartielle()
    {
        return commande.getCommandeLivraisonPartielle();
    }
}
