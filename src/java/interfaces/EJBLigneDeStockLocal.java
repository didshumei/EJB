/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import javax.ejb.Local;
import metier.Article;

/**
 *
 * @author jean
 */
@Local
public interface EJBLigneDeStockLocal
{
    public boolean isEnDessousSeuil(Article article);
}