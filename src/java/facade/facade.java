/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import Ejb.EJBLigneDeStock;
import interfaces.EJBCatalogueFournisseursLocal;
import interfaces.EJBCommandeReapproLocal;
import java.util.ArrayList;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import metier.Adresse;
import metier.Article;
import metier.ArticleFournisseur;
import metier.Categorie;
import metier.EJBArticle;
import metier.EJBBanque;
import metier.EJBCompteClient;
import metier.EJBLignePanier;
import metier.EJBMoyenPaiement;
import metier.EJBPanier;
import metier.Fournisseur;
import metier.Genre;
import metier.LignePanier;

/**
 *
 * @author gruselle
 */
@Stateless
public class facade implements facadeLocal 
{
    @EJB EJBArticle ejb_art;
    @EJB EJBPanier ejb_pan;
    @EJB EJBLignePanier ejb_lignePan;
    @EJB EJBCompteClient ejb_compteCli;
    @EJB EJBBanque ejb_banque;
    @EJB EJBMoyenPaiement ejb_typePaiement;
    @EJB EJBLigneDeStock ejbLigne;
    @EJB EJBCatalogueFournisseursLocal ejbCatFournisseur;
    @EJB EJBCommandeReapproLocal ejbCmdFournisseur;

    
    /*
     * Méthodes article
     */
    @Override
    public int getIdArticle() 
    {
        return ejb_art.getIdArticle();
    }

    @Override
    public float getPrixArticle() 
    {
        return ejb_art.getPrixArticle();
    }

    @Override
    public String getTitreArticle() 
    {
        return ejb_art.getTitreArticle();
    }

    @Override
    public String getAuteurArticle() 
    {
        return ejb_art.getAuteurArticle();
    }

    @Override
    public String getEditeurArticle() 
    {
        return ejb_art.getEditeurArticle();
    }

    @Override
    public String getDescriptionArticle() 
    {
        return ejb_art.getDescriptionArticle();
    }

    @Override
    public String getLienPhoto() 
    {
        return ejb_art.getLienPhoto();
    }

    @Override
    public int getSeuilStockMin() 
    {
        return ejb_art.getSeuilStockMin();
    }

    @Override
    public Article.EtatArticle getEtatArticle() 
    {
        return ejb_art.getEtatArticle();
    }
    
    @Override
    public Genre getGenreArticle() 
    {
        return ejb_art.getGenreArticle();
    }

    @Override
    public Categorie getIdCategorie() 
    {
        return ejb_art.getIdCategorie();
    }

    /*
     * méthodes panier
     */
    @Override
    public int getIdPanier() 
    {
        return ejb_pan.getIdPanier();
    }

    @Override
    public ArrayList<LignePanier> getLignePanier() 
    {
        return ejb_pan.getLignePanier();
    }

    /*
     * méthodes lignePanier
     */
    @Override
    public int getQuantite() 
    {
        return ejb_lignePan.getQuantite();
    }

    @Override
    public float getSommeIntermediaire() 
    {
        return ejb_lignePan.getSommeIntermediaire();
    }
    
    /*
     * méthodes compteClient
     */
    @Override
    public int getIdCompteClient() 
    {
        return ejb_compteCli.getIdCompteClient();
    }

    @Override
    public String getNomCompteClient() 
    {
        return ejb_compteCli.getNomCompteClient();
    }

    @Override
    public String getPrenomCompteClient() 
    {
        return ejb_compteCli.getPrenomCompteClient();
    }

    @Override
    public Adresse getAdresseCompteClient() 
    {
        return ejb_compteCli.getAdresseCompteClient();
    }

    @Override
    public String getEmailCompteClient() 
    {
        return ejb_compteCli.getEmailCompteClient();
    }

    @Override
    public String getMdpCompteClient() 
    {
        return ejb_compteCli.getMdpCompteClient();
    }    

    /*
     * méthodes Banque
     */
    @Override
    public int getIdBanque() 
    {
        return ejb_banque.getIdBanque();
    }

    @Override
    public Adresse getAdresseBanque() 
    {
        return ejb_banque.getAdresseBanque();
    }

    /*
     * méthode moyenPaiement
     */
    @Override
    public String getTypeCB() 
    {
        return ejb_typePaiement.getTypeCB();
    }
    
    @Override
    public boolean isEnDessousSeuil(Article article)
    {
        return ejbLigne.isEnDessousSeuil(article);
    }

    @Override
    public ArticleFournisseur getArticle(Article article, Fournisseur fournisseur)
    {
        return ejbCatFournisseur.getArticle(article, fournisseur);
    }

    @Override
    public ArticleFournisseur[] getArticles(Article article)
    {
        return ejbCatFournisseur.getArticles(article);
    }

    @Override
    public void ajouterArticle(ArticleFournisseur article, int qt, int refCommande)
    {
        ejbCmdFournisseur.ajouterArticle(article, qt, refCommande);
    }

    
}
