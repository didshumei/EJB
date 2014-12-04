/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import javax.ejb.Local;

/**
 *
 * @author gruselle
 */
@Local
public interface EJBArticleLocal {

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
    
}
