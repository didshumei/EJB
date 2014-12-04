/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import java.util.ArrayList;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import metier.Adresse;
import metier.Article;
import metier.Categorie;
import metier.EJBArticle;
import metier.EJBBanque;
import metier.EJBCompteClient;
import metier.EJBLignePanier;
import metier.EJBMoyenPaiement;
import metier.EJBPanier;
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
    public int getIdGenre() 
    {
        return ejb_art.getIdGenre();
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
    public Article.etatArticle getEtatArticle() 
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

    
}
