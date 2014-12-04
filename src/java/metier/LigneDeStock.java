/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import metier.Article.etatArticle;

/**
 * Represente un article dans le stock avec sa quantite, et l'etat du stock pour cette article.
 * @author jean
 */
public class LigneDeStock
{
    private Article article;
    private etatArticle etat;
    private int seuil;
    private int quantite;
    
    public LigneDeStock()
    {
        
    }
    
    public LigneDeStock(Article article)
    {
        this.article = article;
    }
    
    /**
     * Renvoie l'état du stock de l'article selon le seuil défini.
     * @return vrai si la quantité de l'article est inférieure au seuil, faux
     * sinon.
     */
    public boolean isEnDessousSeuil()
    {
        boolean dessousSeuil;
        if (this.getQuantite() < this.getSeuil())
        {
            dessousSeuil = true;
        }
        else
        {
            dessousSeuil = false;
        }
        
        return dessousSeuil;
    }

    public Article getArticle()
    {
        return article;
    }

    public void setArticle(Article article)
    {
        this.article = article;
    }

    public int getSeuil()
    {
        return seuil;
    }

    public void setSeuil(int seuil)
    {
        this.seuil = seuil;
    }

    public etatArticle getEtat()
    {
        return etat;
    }

    public void setEtat(etatArticle etat)
    {
        this.etat = etat;
    }

    public int getQuantite()
    {
        return quantite;
    }

    public void setQuantite(int quantite)
    {
        this.quantite = quantite;
    }
}
