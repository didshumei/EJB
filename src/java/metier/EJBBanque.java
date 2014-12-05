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
public class EJBBanque implements EJBBanqueLocal 
{
    private Banque laBanque = new Banque();
    
    @Override
    public int getIdBanque() 
    {
        return laBanque.getIdBanque();
    }

    @Override
    public Adresse getAdresseBanque() 
    {
        return laBanque.getAdresseBanque();
    }
    
    @Override
    public void valider() 
    {
        laBanque.valider();
    }

}
