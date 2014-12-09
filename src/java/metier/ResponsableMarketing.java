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
public class    ResponsableMarketing extends CompteSalarie
{
    public      ResponsableMarketing()
    {
    }
    
    public Retour   recupererArticles()
    {
        return new Retour(2);
    }
    
    public Retour   recupererPromos()
    {
        return new Retour(2);
    }
    
    public Retour   creerPromotion(Date dateDebut, Date dateFin, float remise)
    {
        return new Retour(2);
    }
    
    public Retour   associerPromoArticle(int idPromo, int idArticle)
    {
        return new Retour(2);
    }
    
    public Retour   terminerPromotion(int idPromo)
    {
        return new Retour(2);
    }
    
    public Retour   modifierPrixArticle(int idArticle, float prix)
    {
        return new Retour(2);
    }
}
