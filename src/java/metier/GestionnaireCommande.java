/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

/**
 *
 * @author Frontoni
 */
public class    GestionnaireCommande extends CompteSalarie
{
    public      GestionnaireCommande()
    {
    }
    
    public Retour   recupererCommandes()
    {
        return null;
    }
    
    public Retour   recupererLignesCommande(int idCommande)
    {
        return null;
    }
    
    public Retour   modifierStatutCommande(int idCommande, int nouveauStatut)
    {
        return null;
    }
    
    public Retour   mettreEnRemboursement(int idCommande, int idArticle)
    {
        return null;
    }
    
    public Retour   saisirAccuseReception(int idCommande, String lienImage)
    {
        return null;
    }
}
