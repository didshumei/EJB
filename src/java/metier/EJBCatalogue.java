/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import java.util.ArrayList;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author sylvainbron
 */
@Stateless
public class EJBCatalogue implements EJBCatalogueLocal {
    @EJB EJBCategorie categorie;

    @Override
    public void commencerReduction(Article article, float tauxReduction) {
    }

    @Override
    public void terminerReduction(Article article) {
    }

    @Override
    public void modifierPrixArticle(String referenceArticle, float nouveauPrix) {
    }

    @Override
    public void retirerArticle(String referenceArticle) {
    }

    @Override
    public ArrayList<Article> afficherArticles() {
        return null;
    }

    @Override
    public void creerGenre(String libelleGenre) {
        
    }

    @Override
    public void creerCategorie(String libelleCategorie) {
        categorie.creerGenre(libelleCategorie);
    }
    
    
    
    
}
