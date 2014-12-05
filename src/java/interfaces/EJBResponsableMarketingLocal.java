/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import java.util.Date;
import javax.ejb.Local;

/**
 *
 * @author Frontoni
 */
@Local
public interface EJBResponsableMarketingLocal
{
    boolean  creerPromotion(Date dateDebut, Date dateFin, float prix);
    
    boolean  associerPromoArticle(int idPromo, int idArticle);
    
    boolean  terminerPromotion(int idPromo);
    
    boolean  modifierPrixArticle(int idArticle, float prix);
}
