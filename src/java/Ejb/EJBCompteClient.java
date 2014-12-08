/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejb;

import interfaces.EJBCompteClientLocal;
import javax.ejb.Stateless;
import metier.Adresse;
import metier.CompteClient;

/**
 *
 * @author gruselle
 */
@Stateless
public class EJBCompteClient implements EJBCompteClientLocal 
{
    private CompteClient compteCli = new CompteClient();
    
    @Override
    public int getIdCompteClient() 
    {
        return compteCli.getIdCompteClient();
    }

    @Override
    public String getNomCompteClient() 
    {
        return compteCli.getNomCompteClient();
    }

    @Override
    public String getPrenomCompteClient() 
    {
        return compteCli.getPrenomCompteClient();
    }

    @Override
    public Adresse getAdresseCompteClient() 
    {
        return compteCli.getAdresseCompteClient();
    }

    @Override
    public String getEmailCompteClient() 
    {
        return compteCli.getEmailCompteClient();
    }

    @Override
    public String getMdpCompteClient() 
    {
        return compteCli.getMdpCompteClient();
    }

    @Override
    public String getTelCompteClient() 
    {
        return compteCli.getTelCompteClient();
    }
}
