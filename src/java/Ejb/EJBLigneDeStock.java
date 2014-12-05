/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejb;

import interfaces.EJBLigneDeStockLocal;
import javax.ejb.Stateless;
import metier.Article;
import metier.LigneDeStock;

/**
 *
 * @author jean
 */
@Stateless
public class EJBLigneDeStock implements EJBLigneDeStockLocal
{
    @Override
    public boolean isEnDessousSeuil(Article article)
    {
        LigneDeStock ligne = new LigneDeStock(article);
        
        return ligne.isEnDessousSeuil();
    }
    
}