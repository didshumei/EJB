/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import java.util.ArrayList;
import javax.ejb.Local;
import metier.Adresse;
import metier.Article;
import metier.ArticleFournisseur;
import metier.Categorie;
import metier.Fournisseur;
import metier.Genre;
import metier.LignePanier;

/**
 *
 * @author gruselle
 */
@Local
public interface facadeLocal 
{
    /*
     * méthodes article
     */
    int getIdArticle();
    Genre getGenreArticle();
    float getPrixArticle();
    String getTitreArticle();
    String getAuteurArticle();
    String getEditeurArticle();
    String getDescriptionArticle();
    int getIdGenre();
    Categorie getIdCategorie();
    String getLienPhoto();
    int getSeuilStockMin();
    Article.EtatArticle getEtatArticle();
    
    /*
     * méthodes panier
     */
    int getIdPanier();
    ArrayList<LignePanier> getLignePanier();
    
    /*
     * méthodes lignePanier
     */
    int getQuantite();
    float getSommeIntermediaire();
    
    /*
     * méthodes compteClient
     */
    int getIdCompteClient();
    String getNomCompteClient();
    String getPrenomCompteClient();
    Adresse getAdresseCompteClient();
    String getEmailCompteClient();
    String getMdpCompteClient();
    
    /*
     * méthodes banque
     */
    int getIdBanque();
    Adresse getAdresseBanque();
    
    /*
     * méthodes MoyenPaiement
     */
    String getTypeCB();
    
    // Méthode de l'EJB LigneDeStock
    
    /**
     * 
     * @param refArticle
     * @return 
     */
    public boolean isEnDessousSeuil(Article article);
    
    // Méthode de l'EJB Catalogue Fournisseur
    /**
     * Récupère un article fournisseur en se basant sur une référence d'article SEBO
     * @param refArticle la référence SEBO de l'article
     * @param fournisseur le fournisseur qui vend l'article
     * @return l'article fournisseur ou null si l'article n'est pas vendu par le fournisseur
     */
    public ArticleFournisseur getArticle(Article article, Fournisseur fournisseur);
    
    /**
     * Récupère la liste d'article fournisseur à partir de la référence SEBO d'un
     * article
     * @param refArticle
     * @return 
     */
    public ArticleFournisseur[] getArticles(Article article);
    
    
    // Méthode de l'EJB Commande Reappro
    /**
     * Ajoute un article et la quantité à commander à la commande
     * @param article l'article fournisseur à commander
     * @param qt la quantité à commander
     * @param refCommande la référence de la commande dans laquelle ajouter
     * l'article
     */
    public void ajouterArticle(ArticleFournisseur article, int qt, int refCommande);
}
