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
public interface    EJBGestionnaireCatalogueLocal
{
    Retour   recupererArticles();
    
    Retour   recupererGenres();
    
    Retour   recupererCategories();
    
    Retour   ajouterArticle(int idGenre, int idCategorie, float prix, String titre, String auteur, String editeur, String description, String lienPhoto);
    
    Retour   modifierArticle(int idGenre, int idCategorie, float prix, String titre, String auteur, String editeur, String description, String lienPhoto);
    
    Retour   creerCategorie(String libelle);
    
    Retour   creerGenre(String libelle);
}
