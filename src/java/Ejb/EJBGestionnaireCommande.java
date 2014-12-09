/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejb;

import interfaces.EJBGestionnaireCommandeLocal;
import javax.ejb.Stateless;
import metier.GestionnaireCommande;
import metier.Retour;

/**
 *
 * @author Frontoni
 */
@Stateless
public class                EJBGestionnaireCommande implements EJBGestionnaireCommandeLocal
{
    GestionnaireCommande    commande;
    
    public  EJBGestionnaireCommande()
    {
        commande = new GestionnaireCommande();
    }

    @Override
    public Retour   modifierStatutCommande(int idCommande, int nouveauStatut)
    {
        return commande.modifierStatutCommande(idCommande, nouveauStatut);
    }

    @Override
    public Retour   mettreEnRemboursement(int idCommande, int idArticle)
    {
        return commande.mettreEnRemboursement(idCommande, idArticle);
    }

    @Override
    public Retour   saisirAccuseReception(int idCommande, String lienImage)
    {
        return commande.saisirAccuseReception(idCommande, lienImage);
    }

    @Override
    public Retour recupererCommandes()
    {
        return commande.recupererCommandes();
    }

    @Override
    public Retour recupererLignesCommande(int idCommande)
    {
        return commande.recupererLignesCommande(idCommande);
    }
}
