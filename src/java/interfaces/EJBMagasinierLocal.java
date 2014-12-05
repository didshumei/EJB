/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Frontoni
 */
@Local
public interface EJBMagasinierLocal
{
    boolean  mettreAJourStocks(int idArticle, int quantitéAjoutee);
    
    List<Integer>    chercherArticlesDessousSeuil();
    
    boolean  fixerQuantiteArticle(int idArticle, int quantite);
}
