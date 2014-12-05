/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Frontoni
 */
public class Magasinier extends CompteSalarie
{
    public  Magasinier()
    {
    }
    
    public boolean  mettreAJourStocks(int idArticle, int quantitéAjoutee)
    {
        return true;
    }
    
    public List<Integer>    chercherArticlesDessousSeuil()
    {
        List<Integer>       articleDessousSeuil = new ArrayList<Integer>();
        
        return articleDessousSeuil;
    }
    
    public boolean  fixerQuantiteArticle(int idArticle, int quantite)
    {
        return true;
    }
}
