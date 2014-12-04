/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import java.util.ArrayList;
import javax.ejb.Local;
import metier.Adresse;
import metier.Article;
import metier.Categorie;
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
    Article.etatArticle getEtatArticle();
    
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
}
