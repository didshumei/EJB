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
public interface EJBGestionnaireCatalogueLocal
{
    Retour   ajouterArticle(int idGenre, int idCategorie, float prix, String titre, String lienPhoto, String auteur, String editeur, String description);
    Retour   modifierArticle(int idGenre, int idCategorie, float prix, String titre, String lienPhoto, String auteur, String editeur, String description);
    Retour   creerCategorie(String libelle);
    Retour   creerGenre(String libelle);
}
