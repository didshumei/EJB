/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

/**
 *
 * @author jean
 */
public class LigneCommandeReappro
{
    private ArticleFournisseur article;
    private int quantite;

    public LigneCommandeReappro()
    {
        
    }

    public LigneCommandeReappro(ArticleFournisseur article, int quantite)
    {
        setArticle(article);
    }
    
    public ArticleFournisseur getArticle()
    {
        return article;
    }

    public void setArticle(ArticleFournisseur article)
    {
        this.article = article;
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
