/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

/**
 *
 * @author Frontoni
 */
public class GestionnaireCatalogue extends CompteSalarie
{
    public Retour   ajouterArticle(int idGenre, int idCategorie, float prix, String titre, String lienPhoto, String auteur, String editeur, String description)
    {
        int         idRetour = 0;
        String      messageRetour = "";
        
        //procedure stockée à laquelle on idRetour et messageRetour
        return (new Retour(idRetour, messageRetour));
    }
    
    public Retour   modifierArticle(int idGenre, int idCategorie, float prix, String titre, String lienPhoto, String auteur, String editeur, String description)
    {
        int         idRetour = 0;
        String      messageRetour = "";
        
        //procedure stockée à laquelle on idRetour et messageRetour
        return (new Retour(idRetour, messageRetour));
    }
    
    public Retour   creerCategorie(String libelle)
    {
        int         idRetour = 0;
        String      messageRetour = "";
        
        //procedure stockée à laquelle on idRetour et messageRetour
        return (new Retour(idRetour, messageRetour));
    }
    
    public Retour   creerGenre(String libelle)
    {
        int         idRetour = 0;
        String      messageRetour = "";
        
        //procedure stockée à laquelle on idRetour et messageRetour
        return (new Retour(idRetour, messageRetour));
    }
}
