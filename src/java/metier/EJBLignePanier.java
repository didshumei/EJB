/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package metier;

import javax.ejb.Stateless;

/**
 *
 * @author gruselle
 */
@Stateless
public class EJBLignePanier implements EJBLignePanierLocal 
{
    
    private LignePanier lignePan = new LignePanier();
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    @Override
    public int getQuantite() 
    {
        return lignePan.getQuantite();
    }

    @Override
    public float getSommeIntermediaire() 
    {
        return lignePan.getSommeIntermediaire();
    }
    
    
}
