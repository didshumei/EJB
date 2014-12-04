/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import java.util.ArrayList;
import javax.ejb.Stateless;

/**
 *
 * @author gruselle
 */
@Stateless
public class EJBPanier implements EJBPanierLocal 
{
    private Panier pan = new Panier();
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public int getIdPanier() 
    {
        return pan.getIdPanier();
    }

    @Override
    public ArrayList<LignePanier> getLignePanier() 
    {
        return pan.getLignePanier();
    }

}
