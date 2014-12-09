/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

/**
 *
 * @author Frontoni
 */
public class    GestionnaireCatalogue extends CompteSalarie
{
    public      GestionnaireCatalogue()
    {
    }
    
    public Retour   recupererArticles()
    {
        return new Retour(2);
    }
    
    public Retour   recupererGenres()
    {
        return new Retour(2);
    }
    
    public Retour   recupererCategories()
    {
        return new Retour(2);
    }
    
    public Retour   ajouterArticle(int idGenre, int idCategorie, float prix, String titre, String auteur, String editeur, String description, String lienPhoto)
    {
        return (new Retour(2));
    }
    
    public Retour   modifierArticle(int idGenre, int idCategorie, float prix, String titre, String auteur, String editeur, String description, String lienPhoto)
    {
        return (new Retour(2));
    }
    
    public Retour   creerCategorie(String libelle)
    {
        return (new Retour(2));
    }
    
    public Retour   creerGenre(String libelle)
    {
        return (new Retour(2));
    }
}
