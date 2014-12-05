/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import javax.ejb.Stateless;

/**
 * Contient tous les appels de méthodes de la classe Article
 * @author gruselle
 */
@Stateless
public class EJBArticle implements EJBArticleLocal 
{
    private Article art = new Article();

    @Override
    public int getIdArticle() 
    {
        return art.getIdArticle();
    }

    @Override
    public float getPrixArticle() 
    {
        return art.getPrixArticle();
    }

    @Override
    public String getTitreArticle() 
    {
        return art.getTitreArticle();
    }

    @Override
    public String getAuteurArticle() 
    {
        return art.getAuteurArticle();
    }

    @Override
    public String getEditeurArticle() 
    {
        return art.getEditeurArticle();
    }

    @Override
    public String getDescriptionArticle() 
    {
        return art.getDescriptionArticle();
    }
    
    @Override
    public String getLienPhoto() 
    {
        return art.getLienPhoto();
    }

    @Override
    public int getSeuilStockMin() 
    {
        return art.getSeuilStockMin();
    }

    @Override
    public Article.EtatArticle getEtatArticle() 
    {
        return art.getEtatArticle();
    }

    @Override
    public Genre getGenreArticle() 
    {
        return art.getGenreArticle();
    }

    @Override
    public Categorie getIdCategorie() 
    {
        return art.getCategorie();
    }    

    @Override
    public void ajouterPanier() 
    {
        art.ajouterPanier();
    }
}
