/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import java.util.Date;

/**
 *
 * @author Frontoni
 */
public class ResponsableMarketing extends CompteSalarie
{
    public  ResponsableMarketing()
    {
    }
    
    public boolean  recupererArticles() // Ajouter dans les EJB
    {
        return true;
    }
    
    public boolean recupererPromos() // Ajouter dans les EJB
    {
        return true;
    }
    
    public boolean  creerPromotion(Date dateDebut, Date dateFin, float prix)
    {
        return true;
    }
    
    public boolean  associerPromoArticle(int idPromo, int idArticle)
    {
        return true;
    }
    
    public boolean  terminerPromotion(int idPromo)
    {
        return true;
    }
    
    public boolean  modifierPrixArticle(int idArticle, float prix)
    {
        return true;
    }
}
