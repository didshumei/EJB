/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

/**
 *
 * @author Frontoni
 */
public class GestionnaireCatalogue
{
    public Retour   ajouterArticle(int idGenre, int idCategorie, float prix, String titre, String lienPhoto, String auteur, String editeur, String description)
    {
        int         idRetour = 0;
        String      messageRetour = "";
        
        //procedure stockée à laquelle on idRetour et messageRetour
        return (new Retour(idRetour, messageRetour));
    }
}