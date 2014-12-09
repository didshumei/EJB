/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

/**
 *
 * @author Frontoni
 */
public class    Magasinier extends CompteSalarie
{
    public      Magasinier()
    {
    }
    
    public Retour   recupererArticles()
    {
        return new Retour(2);
    }
    
    public Retour   recupererArticlesEnDessousSeuil()
    {
        return new Retour(2);
    }
    
    public Retour   recupererFournisseurs()
    {
        return new Retour(2);
    }
    
    public Retour   modifierQuantiteEnStock(int idArticle, int quantitéAjoutee)
    {
        return new Retour(2);
    }
    
    public Retour   ajouterFournisseur(String nom, String adresse, String codePostal, String ville, String telephone, String email)
    {
        return new Retour(2);
    }
    
    public Retour   creerCommandeReappro()
    {
        return new Retour(2);
    }
    
    public Retour   ajouterLigneCommandeReappro(int idCommandeReappro, int idArticle, int quantite)
    {
        return new Retour(2);
    }
    
    public Retour   associerArticleFournisseur(int idArticle, int idFournisseur, String referenceArticleChezFournisseur, int seuilMinDeCommande)
    {
        return new Retour(2);
    }
    
    public Retour   modifierFournisseur(int idFournisseur, String nom, String adresse, String codePostal, String ville, String telephone, String email)
    {
        return new Retour(2);
    }
    
    public Retour   modifierSeuilReappro(int idCommandeReappro, int idArticle, int quantite)
    {
        return new Retour(2);
    }
    
    public Retour   retirerFournisseur(int idFournisseur)
    {
        return new Retour(2);
    }
}
