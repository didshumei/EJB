/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejb;

import interfaces.EJBGestionnaireCatalogueLocal;
import javax.ejb.Stateless;
import metier.GestionnaireCatalogue;
import metier.Retour;

/**
 *
 * @author Frontoni
 */
@Stateless
public class                EJBGestionnaireCatalogue implements EJBGestionnaireCatalogueLocal
{
    GestionnaireCatalogue   gestion;
    
    public  EJBGestionnaireCatalogue()
    {
        gestion = new GestionnaireCatalogue();
    }
    
    @Override
    public Retour   ajouterArticle(int idGenre, int idCategorie, float prix, String titre, String auteur, String editeur, String description, String lienPhoto)
    {
        return (gestion.ajouterArticle(idGenre, idCategorie, prix, titre, lienPhoto, auteur, editeur, description));
    }

    @Override
    public Retour   modifierArticle(int idGenre, int idCategorie, float prix, String titre, String lienPhoto, String auteur, String editeur, String description)
    {
        return (gestion.modifierArticle(idGenre, idCategorie, prix, titre, lienPhoto, auteur, editeur, description));
    }

    @Override
    public Retour   creerCategorie(String libelle)
    {
        return (gestion.creerCategorie(libelle));
    }

    @Override
    public Retour   creerGenre(String libelle)
    {
        return (gestion.creerGenre(libelle));
    }

    @Override
    public Retour   recupererArticles()
    {
        return (gestion.recupererArticles());
    }

    @Override
    public Retour   recupererGenres()
    {
        return (gestion.recupererGenres());
    }

    @Override
    public Retour   recupererCategories()
    {
        return (gestion.recupererCategories());
    }
}
