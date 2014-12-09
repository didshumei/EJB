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
        return new Retour(2);
    }
    
    public Retour   recupererLignesCommande(int idCommande)
    {
        return new Retour(2);
    }
    
    public Retour   modifierStatutCommande(int idCommande, int nouveauStatut)
    {
        return new Retour(2);
    }
    
    public Retour   mettreEnRemboursement(int idCommande, int idArticle)
    {
        return new Retour(2);
    }
    
    public Retour   saisirAccuseReception(int idCommande, String lienImage)
    {
        return new Retour(2);
    }
}
