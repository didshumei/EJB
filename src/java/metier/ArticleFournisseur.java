/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

/**
 *
 * @author jean
 */
public class ArticleFournisseur
{
    private Article article;
    private Fournisseur fournisseur;
    private int idArticleFournisseur;

    public ArticleFournisseur(Article article, Fournisseur fournisseur,
            int idArtFournisseur)
    {
        this.article = article;
        this.fournisseur = fournisseur;
        this.idArticleFournisseur = idArtFournisseur;
    }
    
    public ArticleFournisseur(int refArticleFournisseur)
    {
        this.idArticleFournisseur = refArticleFournisseur;
    }

    public Article getArticle()
    {
        return article;
    }

    public void setArticle(Article article)
    {
        this.article = article;
    }

    public Fournisseur getFournisseur()
    {
        return fournisseur;
    }

    public void setFournisseur(Fournisseur fournisseur)
    {
        this.fournisseur = fournisseur;
    }

    public int getIdFournisseur() {
        return idArticleFournisseur;
    }

    public void setIdFournisseur(int idFournisseur)
    {
        this.idArticleFournisseur = idFournisseur;
    }
}
