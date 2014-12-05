/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejb;

import interfaces.EJBResponsableMarketingLocal;
import java.util.Date;
import javax.ejb.Stateless;
import metier.ResponsableMarketing;

/**
 *
 * @author Frontoni
 */
@Stateless
public class EJBResponsableMarketing implements EJBResponsableMarketingLocal
{
    ResponsableMarketing    market;
    
    public  EJBResponsableMarketing()
    {
        market = new ResponsableMarketing();
    }
    
    @Override
    public boolean creerPromotion(Date dateDebut, Date dateFin, float prix)
    {
        return market.creerPromotion(dateDebut, dateFin, prix);
    }

    @Override
    public boolean associerPromoArticle(int idPromo, int idArticle)
    {
        return market.associerPromoArticle(idPromo, idArticle);
    }

    @Override
    public boolean terminerPromotion(int idPromo)
    {
        return market.terminerPromotion(idPromo);
    }

    @Override
    public boolean modifierPrixArticle(int idArticle, float prix)
    {
        return market.modifierPrixArticle(idArticle, prix);
    }
}
