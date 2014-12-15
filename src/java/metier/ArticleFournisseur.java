/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author jean
 */
public class ArticleFournisseur
{
    private Article article;
    private Fournisseur fournisseur;
    private int idArticleFournisseur;
    private int seuilMinDeCommande;

    public ArticleFournisseur(Article article, Fournisseur fournisseur, int idArticleFournisseur, int seuilMinDeCommande)
    {
        this.article = article;
        this.fournisseur = fournisseur;
        this.idArticleFournisseur = idArticleFournisseur;
        this.seuilMinDeCommande = seuilMinDeCommande;
    }

    public int getIdArticleFournisseur() {
        return idArticleFournisseur;
    }

    public void setIdArticleFournisseur(int idArticleFournisseur) {
        this.idArticleFournisseur = idArticleFournisseur;
    }

    public int getSeuilMinDeCommande() {
        return seuilMinDeCommande;
    }

    public void setSeuilMinDeCommande(int seuilMinDeCommande) {
        this.seuilMinDeCommande = seuilMinDeCommande;
    }

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
    
    public static ArticleFournisseur getArticleFournisseur(int idArticle, int idFournisseur)
    {
        ArticleFournisseur articleFournisseur = null;
        Article article = new Article();
        Fournisseur fournisseur;
        try
        {
            //ouverture de la connexion
            Connection co = Connexion.getConnection();
            
            //requete sql
            article.fillArticleById(idArticle);
            
            fournisseur = Fournisseur.fillFournisseurById(idFournisseur);
            
            System.out.println(fournisseur.getAdresse());
           
        }
        catch (Exception e)
        {
            System.out.println("article inexistant ou invalide : "+e.getMessage());
        }
        
        return articleFournisseur;
    }
}
