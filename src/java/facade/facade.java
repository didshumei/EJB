/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package facade;

import Ejb.EJBLigneDeStock;
import interfaces.EJBCatalogueFournisseursLocal;
import interfaces.EJBCommandeReapproLocal;
import java.util.ArrayList;
import java.util.Date;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import metier.Adresse;
import metier.Article;
import metier.ArticleFournisseur;
import metier.Categorie;
import metier.EJBAccuseReception;
import metier.EJBArticle;
import metier.EJBBanque;
import metier.EJBBordereauLivraison;
import metier.EJBCatalogue;
import metier.EJBCategorie;
import metier.EJBCheque;
import metier.EJBCompteClient;
import metier.EJBGenre;
import metier.EJBLettre;
import metier.EJBLigneCommande;
import metier.EJBLignePanier;
import metier.EJBMoyenPaiement;
import metier.EJBPanier;
import metier.EJBRemboursement;
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
    //Sylvain
    @EJB EJBCatalogue catalogue;
    @EJB EJBCategorie categorie;
    @EJB EJBGenre genre;
    @EJB EJBBordereauLivraison bordereau;
    @EJB EJBRemboursement rmb;
    @EJB EJBCheque cheque;
    @EJB EJBLettre lettre;
    @EJB EJBAccuseReception accuse;
    @EJB EJBLigneCommande ligne;
    
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
    
    @Override
    public void ajouterPanier() 
    {
        ejb_art.ajouterPanier();
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
    
    @Override
    public void valider() 
    {
        ejb_banque.valider();
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

    /*
    * METHODES CATALOGUE
    */
    
    @Override
    public void commencerReduction(Article article, float tauxReduction) {
        catalogue.commencerReduction(article, tauxReduction);
    }

    @Override
    public void terminerReduction(Article article) {
        catalogue.terminerReduction(article);
    }

    @Override
    public void modifierPrixArticle(String referenceArticle, float nouveauPrix) {
        catalogue.afficherArticles();   
    }

    @Override
    public void retirerArticle(String referenceArticle) {
        catalogue.retirerArticle(referenceArticle);
    }

    @Override
    public ArrayList<Article> afficherArticles() {
        return catalogue.afficherArticles();
    }

    @Override
    public void creerGenre(String libelleGenre) {
        catalogue.creerGenre(libelleGenre);
    }

    @Override
    public void creerCategorie(String libelleCategorie) {
        catalogue.creerCategorie(libelleCategorie);
    }

    /*
        METHODES GENRE
    */
    
    @Override
    public int getIdGenre() {
        return genre.getIdGenre();
    }

    @Override
    public void setIdGenre(int idGenre) {
        genre.setIdGenre(idGenre);
    }

    @Override
    public String getTitreGenre() {
        return genre.getTitreGenre();
    }

    @Override
    public void setTitreGenre(String titreGenre) {
        genre.setTitreGenre(titreGenre);
    }

    @Override
    public String getReferenceGenre() {
        return genre.getReferenceGenre();
    }

    @Override
    public void setReferenceGenre(String referenceGenre) {
        genre.setReferenceGenre(referenceGenre);
    }

    @Override
    public String getContenu() {
       return bordereau.getContenu();
    }

    @Override
    public void setContenu(String contenu) {
        bordereau.setContenu(contenu);
    }

    @Override
    public void remplirContenu() {
        bordereau.remplirContenu();
    }

    @Override
    public Date getDate() {
        return rmb.getDate();
    }

    @Override
    public void setDate(Date date) {
        rmb.setDate(date);
    }

    @Override
    public void genererLettre() {
        rmb.genererLettre();
    }

    @Override
    public void genererCheque() {
        rmb.genererCheque();
    }

    @Override
    public float getMontant() {
        return cheque.getMontant();
    }

    @Override
    public void setMontant(float montant) {
        cheque.setMontant(montant);
    }

    @Override
    public String getNumero() {
        return cheque.getNumero();
    }

    @Override
    public void setNumero(String numero) {
        cheque.setNumero(numero);
    }
    
    /*
    * METHODES LETTRE
    */

    @Override
    public String getContenuLettre() {
        return lettre.getContenu();
    }

    @Override
    public void setContenuLettre(String contenu) {
        lettre.setContenu(contenu);
    }
    
    /*
    * METHODE ACCUSERECEPTION
    */
    @Override
    public Date getDateReception() {
        return accuse.getDateReception();
    }
    
    @Override
    public void setDateReception(Date dateReception) {
        accuse.setDateReception(dateReception);
    }    

    /*
    * METHODES LIGNECOMMANDE
    */

    @Override
    public float getSstotal() {
        return ligne.getSstotal();
    }

    @Override
    public void setSstotal(float sstotal) {
        ligne.setSstotal(sstotal);    
    }

    @Override
    public boolean isIsARembourser() {
        return ligne.isIsARembourser();
    }

    @Override
    public void setIsARembourser(boolean isARembourser) {
        ligne.setIsARembourser(isARembourser);
    }

    @Override
    public int getQuantiteCommande() {
        return ligne.getQuantiteCommande();
    }

    @Override
    public void setQuantiteCommande(int quantite) {
        ligne.setQuantiteCommande(quantite);
    }

    @Override
    public int getQuantiteLivree() {
        return ligne.getQuantiteLivree();
    }

    @Override
    public void setQuantiteLivree(int quantite) {
        ligne.setQuantiteLivree(quantite);
    }

    

    
}
