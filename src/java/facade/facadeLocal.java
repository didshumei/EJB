/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import java.util.ArrayList;
import java.util.Date;
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
    
     /*
        METHODES CATALOGUE
    */
   
    void commencerReduction(Article article, float tauxReduction);
    void terminerReduction(Article article);
    void modifierPrixArticle(String referenceArticle, float nouveauPrix);
    void retirerArticle(String referenceArticle);
    ArrayList<Article> afficherArticles();
    void creerCategorie(String libelleCategorie);
    
    /*
        METHODES CATEGORIE
    */
    
    
    /*
        METHODES GENRE
    */
    
    void setIdGenre(int idGenre);
    String getTitreGenre();
    void setTitreGenre(String titreGenre);
    String getReferenceGenre();
    void setReferenceGenre(String referenceGenre);
    void creerGenre(String libelleGenre);
    
    /*
    * METHODES BORDEREAULIVRAISON
    */
    String getContenu();
    void setContenu(String contenu);
    void remplirContenu();
    
    /*
    * METHODES REMBOURSEMENT
    */
    Date getDate();
    void setDate(Date date);
    void genererLettre();
    void genererCheque();
    
    /*
    * METHODES CHEQUE
    */
    float getMontant();
    void setMontant(float montant);
    String getNumero();
    void setNumero(String numero);
    
    /*
    * METHODES LETTRE
    */
    String getContenuLettre();
    void setContenuLettre(String contenu);
    
    /*
    * METHODES ACCUSERECEPTION
    */
    Date getDateReception(); 
    void setDateReception(Date dateReception);
    
    /*
    * METHODES LIGNECOMMANDE
    */
    
    int getQuantiteCommande();
    void setQuantiteCommande(int quantite);
    int getQuantiteLivree();
    void setQuantiteLivree(int quantite);
    float getSstotal();
    void setSstotal(float sstotal);
    boolean isIsARembourser();
    void setIsARembourser(boolean isARembourser);
}

