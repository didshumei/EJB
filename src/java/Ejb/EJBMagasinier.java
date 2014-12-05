/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejb;

import interfaces.EJBMagasinierLocal;
import java.util.List;
import javax.ejb.Stateless;
import metier.Magasinier;

/**
 *
 * @author Frontoni
 */
@Stateless
public class EJBMagasinier implements EJBMagasinierLocal
{
    Magasinier  magasinier;

    public EJBMagasinier()
    {
        magasinier = new Magasinier();
    }
    
    @Override
    public boolean mettreAJourStocks(int idArticle, int quantitéAjoutee)
    {
        return magasinier.mettreAJourStocks(idArticle, quantitéAjoutee);
    }

    @Override
    public List<Integer> chercherArticlesDessousSeuil()
    {
        return magasinier.chercherArticlesDessousSeuil();
    }

    @Override
    public boolean fixerQuantiteArticle(int idArticle, int quantite)
    {
        return magasinier.fixerQuantiteArticle(idArticle, quantite);
    }

}
